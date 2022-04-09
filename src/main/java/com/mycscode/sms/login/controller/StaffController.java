package com.mycscode.sms.login.controller;

import java.util.List;

import com.mycscode.sms.login.model.ResponseMessage;
import com.mycscode.sms.login.model.Staffs;
import com.mycscode.sms.login.service.StaffService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
public class StaffController {

    @Autowired
    private StaffService staffService;

    private ResponseMessage responseMessage;

    @GetMapping("/api/staffs")
    public ResponseEntity<List<Staffs>> getAllStaff(){
        List<Staffs> res = this.staffService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(res);
    }

    @GetMapping("/api/staffs/{id}")
    public ResponseEntity<?> getStaffs(@PathVariable("id") int id){
        return ResponseEntity.ok(this.staffService.findById(id));
        
    }

    @PostMapping("/api/staffs")
    public ResponseEntity<?> addStaff(@RequestBody Staffs staffs){
        Staffs save = this.staffService.save(staffs);
        return ResponseEntity.ok(save);
    }

    @PutMapping("/api/staffs/{id}")
    public ResponseEntity<?> updateStudent(@RequestBody Staffs staffs, @PathVariable("id") int id){
        this.staffService.save(staffs);
        return ResponseEntity.ok(staffs);
    }
    
    @DeleteMapping("/api/staffs/{id}")
    public ResponseEntity<?> deleteStaff(@PathVariable("id") int id){
        this.staffService.deleteById(id);
        responseMessage = new ResponseMessage();
        responseMessage.setType("success");
        responseMessage.setMessage("Staff record has been deleted with student id : " + id );
        return ResponseEntity.ok(responseMessage);
    }
    
}
