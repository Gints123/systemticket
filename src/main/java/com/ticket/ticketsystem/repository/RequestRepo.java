package com.ticket.ticketsystem.repository;

import com.ticket.ticketsystem.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepo extends JpaRepository<Request, Integer> {
}
