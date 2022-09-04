package com.ticket.ticketsystem.login.loginRepository;

import com.ticket.ticketsystem.login.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepo extends JpaRepository<Login, Integer> {
}
