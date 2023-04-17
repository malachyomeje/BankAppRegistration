package com.acount.account.service;


import com.acount.account.dtos.request.UsersDto;
import com.acount.account.model.Account;
import com.acount.account.model.Users;
import com.acount.account.repository.AccountRepository;
import com.acount.account.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

@RequiredArgsConstructor
@Service

public class UsersServiceImpl implements UsersService{
 private final UsersRepository usersRepository;
 private final AccountRepository accountRepository;

 @Override
 public String registerUsers(UsersDto usersDto) {

     Optional<Users> users = usersRepository.findByEmail(usersDto.getEmail());

     if (users.isPresent()) {
         return " users have been taken";
     }
     Users users1 = new Users();
     users1.setName(usersDto.getName());
     users1.setEmail(usersDto.getEmail());
     users1.setPhoneNo(usersDto.getPhoneNo());
//     users1.setId(1L);

     Account account= new Account();
     account.setAccountBalance(0);
     account.setAccountNumber("123"+ LocalTime.now().toString().substring(10));
     accountRepository.save(account);

     users1.setAccount(account);
     usersRepository.save(users1);

     return "user save sucess";
 }

}
