package com.acount.account.service;

import com.acount.account.dtos.request.UsersDto;
import com.acount.account.model.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersService {
    String registerUsers(UsersDto usersDto);
}
