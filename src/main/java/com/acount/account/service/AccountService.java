package com.acount.account.service;

import com.acount.account.dtos.request.AccountDto;
import com.acount.account.dtos.request.DebitingDto;
import com.acount.account.dtos.request.FundingRequestDto;
import com.acount.account.dtos.response.AccountResponse;

public interface AccountService {
    AccountResponse MyAccount(AccountDto accountDto);

    AccountResponse deposite (FundingRequestDto fundingRequestDto);

    AccountResponse debit (DebitingDto debitingDto);
}
