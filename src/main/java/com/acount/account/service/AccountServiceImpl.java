package com.acount.account.service;


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
    public AccountResponse createAccountNumber(String accountNumber) {

        Optional<Account> users = accountRepository.findByAccountNumber(accountNumber);

        if (users.isPresent()) {
            return new AccountResponse("Account have been taken",new Account());
        }

//        if (!(accountNumber) {
//            return new AccountResponse("WRONG ACCOUNT NOBER");
//        }
        Account createdAccount = new Account();

       createdAccount.setAccountBalance(0);
      createdAccount.setAccountNumber(accountNumber);

       accountRepository.save(createdAccount);
        return new AccountResponse("ACCOUNT CREATED",createdAccount);


    }
//    @Override
//    public AccountResponse deposite(FundingRequestDto fundingRequestDto) {
//
//     Optional<Account> account = accountRepository.findByAccountNumber(fundingRequestDto.getAccountNumber());
//        if (account.isEmpty()){
//            return new AccountResponse("Account number does not exist",new Account());
//        }
//
//        Account Useraccount = account.get();
//     Useraccount.setAccountBalance(fundingRequestDto.getFundingAmount());
//
//        accountRepository.save(Useraccount);
//        return new AccountResponse("funded successfully");
//   }
//   @Override
//   public AccountResponse debit(DebitingDto debitingDto){
//        Optional<Account> userAccount =accountRepository.findByAccountNumber(debitingDto.getAccountNumber());
//        if (userAccount.isEmpty()){
//            return new AccountResponse("Account number does not exist");
//        }
//        Account account= userAccount.get();
//
//int newBalance=account.getAccountBalance()-debitingDto.getDebiting();
//       account.setAccountBalance(newBalance);
//        accountRepository.save(account);
//
//       return new AccountResponse(" your account has been debited with :" +
//               debitingDto.getDebiting() + " your account balance is " + account.getAccountBalance());
//   }


}




