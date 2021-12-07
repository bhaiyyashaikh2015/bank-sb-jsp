package com.bhaiyya.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bhaiyya.bank.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

Long deleteByEmail(String email);

List<Account> findByEmail(String email);

List<Account> findByEmailOrPhone(String email, String phone);

void deleteByEmailAndPhone(String email, String phone);

void deleteByEmailOrPhone(String email, String phone);

Account findByAccnumber(Long accnumber);

}
