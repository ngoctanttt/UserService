package com.tanln.invoice.userserivice.repository;

import com.tanln.invoice.userserivice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,String> {

   @Query(value = "SELECT u FROM User u WHERE u.taxCode = ?1")
    User getByTaxCode(String taxCode);
}
