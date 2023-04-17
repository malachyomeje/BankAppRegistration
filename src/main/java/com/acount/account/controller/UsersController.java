package com.acount.account.controller;

;
import com.acount.account.dtos.request.UsersDto;

import com.acount.account.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/account")

public class UsersController {

        private final UsersService usersService;


        @PostMapping("/registerUsers")
        public String registerUsers(@RequestBody UsersDto usersDto) {
            return usersService.registerUsers(usersDto);
        }


    }
