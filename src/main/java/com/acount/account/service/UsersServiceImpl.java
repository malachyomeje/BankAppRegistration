package com.acount.account.service;


import com.acount.account.dtos.request.UsersDto;
import com.acount.account.dtos.response.AccountResponse;
import com.acount.account.model.Users;
import com.acount.account.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.Optional;

@RequiredArgsConstructor
@Service

public class
UsersServiceImpl implements UsersService{

 private final UsersRepository usersRepository;
 private final AccountService accountService;
 @Override
 public String registerUsers(UsersDto usersDto) {

     Optional<Users> users = usersRepository.findByEmail(usersDto.getEmail());
     if (users.isPresent()) {
         return " users have been taken";
     }
     String newAccountNumber1 =  LocalTime.now().toString();
     String newAccountNumber = newAccountNumber1.substring(10)+"123";
     AccountResponse verifiedAccount = accountService.createAccountNumber(newAccountNumber);

     Users users1 = new Users();
     users1.setName(usersDto.getName());
     users1.setEmail(usersDto.getEmail());
     users1.setPhoneNo(usersDto.getPhoneNo());
    users1.setAccount(verifiedAccount.getAccount());

     usersRepository.save(users1);

     return "user save sucess";
 }

}
