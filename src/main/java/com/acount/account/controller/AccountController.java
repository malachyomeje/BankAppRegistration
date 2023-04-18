package com.acount.account.controller;

//import com.acount.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/account")
public class AccountController {



//private final AccountService accountService;
//    @PostMapping("/creatingAccount")
//    public AccountResponse creatingAccount(@RequestBody AccountDto accountDto) {
//       return accountService.createAccountNumber(accountDto);
//    }
//
//    @PostMapping("/fundAccount")
//    public AccountResponse creatingAccount(@RequestBody FundingRequestDto fundingRequestDto) {
//        return accountService.deposite(fundingRequestDto);
//    }
//
//
//    @PostMapping("/debiting")
//    public AccountResponse debitAccount(@RequestBody DebitingDto debitingDto) {
//        return accountService.debit(debitingDto);
//
//    }
}