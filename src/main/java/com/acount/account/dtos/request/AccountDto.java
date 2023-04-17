package com.acount.account.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {
    private String accountName;
    private String accountNumber;
    private Integer accountBalance;
    private String email;
    private String phoneNumber;
}




