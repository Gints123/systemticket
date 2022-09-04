package com.ticket.ticketsystem.service;

import com.ticket.ticketsystem.model.Request;

import java.util.List;

public interface RequestService {
    public Request saveRequest(Request request);
    public List<Request> getAllRequests();
    public Request getRequestById(int id);
    public void delete(Integer id);
}
