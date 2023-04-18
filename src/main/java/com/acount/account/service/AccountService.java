package com.acount.account.service;


import com.acount.account.dtos.response.AccountResponse;

public interface AccountService {
//    AccountResponse createAccountNumber(AccountDto accountDto);

    AccountResponse createAccountNumber(String accountNumber);

//    AccountResponse deposite (FundingRequestDto fundingRequestDto);
//
//    AccountResponse debit (DebitingDto debitingDto);
}
