package com.ticket.ticketsystem.controller;

import com.ticket.ticketsystem.login.loginService.LoginService;
import com.ticket.ticketsystem.login.model.Login;
import com.ticket.ticketsystem.model.Request;
import com.ticket.ticketsystem.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/ticket")
public class RequestController {
    @Autowired
    RequestService requestService;

    @PostMapping("/add")
    private String add(@RequestBody Request request){
        requestService.saveRequest(request);
        return "New request added";

    }

    @GetMapping("/getall")
    private List getAllRequests(){
        return requestService.getAllRequests();
    }

    @PutMapping("/{id}")
    private Request updateRequest(@PathVariable("id") int id, @RequestBody Request updateRequest){
        Request request = requestService.getRequestById(id);
        request.setEquipment(updateRequest.getEquipment());
        request.setParameters(updateRequest.getParameters());
        request.setReason(updateRequest.getReason());
        request.setRequestedby(updateRequest.getRequestedby());
        request.setStatus(updateRequest.getStatus());
        requestService.saveRequest(request);
        return requestService.getRequestById(id);
    }

    @GetMapping("/{id}")
    private Request getRequest(@PathVariable("id") int id){
        return requestService.getRequestById(id);
    }

    @DeleteMapping("/{id}")
    private void deletetask(@PathVariable("id") int id) { requestService.delete(id);}
}
