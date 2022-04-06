package com.mycscode.sms.login.controller;

import java.util.Optional;

import com.mycscode.sms.login.model.ResponseMessage;
import com.mycscode.sms.login.model.loginData;
import com.mycscode.sms.login.model.loginUser;
import com.mycscode.sms.login.service.loginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
public class login {
    @Autowired
    private loginService loginService;
    
    private loginData loginData;

    private ResponseMessage responseMessage;
    
    @PostMapping("/api/login")
    public ResponseEntity<?> getUser(
        // @RequestParam("email") String email,
        // @RequestParam("password") String password
        @RequestBody loginData loginData
    )
    {
        String email = loginData.getEmail();
        String password = loginData.getPassword();
        // System.out.println(loginData);
        try{
            Optional<loginUser> user = this.loginService.findById(email);
            loginUser obj = user.get();
            if(email.equals(obj.getEmail()) && password.equals(obj.getPassword())){
                return ResponseEntity.status(HttpStatus.ACCEPTED).body(user);
                // return ResponseEntity.ok("Login Successful");
            }
            else{
                responseMessage = new ResponseMessage();
                responseMessage.setType("Unauthorized");
                responseMessage.setMessage("Incorrect Credentials");
                return ResponseEntity.status(HttpStatus.ACCEPTED).body(responseMessage);
                // return ResponseEntity.ok("Incorrect Credentials");
            }
        }
        catch(Exception e){}
        // return ResponseEntity.status(HttpStatus.ACCEPTED).body("Incorrect Credentials");
        responseMessage = new ResponseMessage();
        responseMessage.setType("Unauthorized");
        responseMessage.setMessage("Incorrect Credentials");
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(responseMessage);
    }

    // To register data
    // @PostMapping("/api/login")
    // public ResponseEntity<?> addUser(@RequestBody loginUser user){
    //     loginUser save = this.loginService.save(user);
    //     return ResponseEntity.ok(save);
    // }
}
