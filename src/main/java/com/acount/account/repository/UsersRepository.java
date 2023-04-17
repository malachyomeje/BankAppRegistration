package com.acount.account.repository;

import com.acount.account.model.Account;
import com.acount.account.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
   Optional<Users>findByEmail(String accountNumber);
}
