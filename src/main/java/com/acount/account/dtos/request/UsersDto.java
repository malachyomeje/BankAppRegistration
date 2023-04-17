package com.acount.account.dtos.request;

import com.acount.account.model.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class UsersDto {

    private String name;
    private String email;
    private String phoneNo;



}
