package com.ticket.ticketsystem.service;

import com.ticket.ticketsystem.model.Request;
import com.ticket.ticketsystem.repository.RequestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RequestServiceImpl implements RequestService{

    @Autowired
    RequestRepo requestRepo;


    public Request saveRequest(Request request) {
        return requestRepo.save(request);
    }


    public List<Request> getAllRequests() {
        return requestRepo.findAll();
    }

    public Request getRequestById(int id) {
        return requestRepo.findById(id).get();
    }

    public void delete(Integer id) { requestRepo.deleteById(id);}
}
