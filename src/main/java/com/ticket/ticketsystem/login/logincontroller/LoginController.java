package com.ticket.ticketsystem.login.logincontroller;



import com.ticket.ticketsystem.login.loginService.LoginService;
import com.ticket.ticketsystem.login.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<Login> loginUser(@RequestBody Login data){
        Login user=loginService.findById(data.getId());
        if (user.getPassword().equals(data.getPassword()))
            return ResponseEntity.ok(user);
        return (ResponseEntity<Login>) ResponseEntity.internalServerError();
    }
}
