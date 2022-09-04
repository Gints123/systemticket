package com.ticket.ticketsystem.login.loginService;

import com.ticket.ticketsystem.login.model.Login;

public interface LoginService {
    Login findById(int id);
}
