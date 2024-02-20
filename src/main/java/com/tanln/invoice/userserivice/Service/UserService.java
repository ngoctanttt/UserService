package com.tanln.invoice.userserivice.Service;

import com.tanln.invoice.userserivice.entity.User;
import com.tanln.invoice.userserivice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    public User getUserInfo(String taxCode){
        //Validate Info

        return userRepository.getByTaxCode(taxCode);
    }
}
