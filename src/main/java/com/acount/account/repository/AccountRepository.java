package com.acount.account.repository;

import com.acount.account.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
   Optional<Account> findByAccountNumber(String accountNumber);
}
