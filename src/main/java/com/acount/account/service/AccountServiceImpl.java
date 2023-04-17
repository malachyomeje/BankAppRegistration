package com.acount.account.service;

import com.acount.account.dtos.request.AccountDto;
import com.acount.account.dtos.request.DebitingDto;
import com.acount.account.dtos.request.FundingRequestDto;
import com.acount.account.dtos.response.AccountResponse;
import com.acount.account.model.Account;
import com.acount.account.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {


    private final AccountRepository accountRepository;

    @Override
    public AccountResponse MyAccount(AccountDto accountDto) {


        Optional<Account> users = accountRepository.findByAccountNumber(accountDto.getAccountNumber());

        if (users.isPresent()) {
            return new AccountResponse("Account have been taken");
        }

        if (!(accountDto.getAccountNumber().length() == 11)) {
            return new AccountResponse("WRONG ACCOUNT NOBER");
        }
        Account owner = new Account();

       owner.setAccountBalance(accountDto.getAccountBalance());
      owner.setAccountNumber(accountDto.getAccountNumber());

       accountRepository.save(owner);
        return new AccountResponse("ACCOUNT CREATED");


    }
    @Override
    public AccountResponse deposite(FundingRequestDto fundingRequestDto) {

     Optional<Account> account = accountRepository.findByAccountNumber(fundingRequestDto.getAccountNumber());
        if (account.isEmpty()){
            return new AccountResponse("Account number does not exist");
        }

        Account Useraccount = account.get();
     Useraccount.setAccountBalance(fundingRequestDto.getFundingAmount());

        accountRepository.save(Useraccount);
        return new AccountResponse("funded successfully");
   }
   @Override
   public AccountResponse debit(DebitingDto debitingDto){
        Optional<Account> userAccount =accountRepository.findByAccountNumber(debitingDto.getAccountNumber());
        if (userAccount.isEmpty()){
            return new AccountResponse("Account number does not exist");
        }
        Account account= userAccount.get();

int newBalance=account.getAccountBalance()-debitingDto.getDebiting();
       account.setAccountBalance(newBalance);
        accountRepository.save(account);

       return new AccountResponse(" your account has been debited with :" +
               debitingDto.getDebiting() + " your account balance is " + account.getAccountBalance());
   }


}




