package com.ticket.ticketsystem.login.loginService;

import com.ticket.ticketsystem.login.loginRepository.LoginRepo;
import com.ticket.ticketsystem.login.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    LoginRepo loginRepo;

    @Override
    public Login findById(int id) {
        return null;
    }
}
