package com.mycscode.sms.login.controller;

import java.util.List;

import com.mycscode.sms.login.model.ResponseMessage;
import com.mycscode.sms.login.model.Students;
import com.mycscode.sms.login.service.StudentService;

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
public class StudentController {

    @Autowired
    private StudentService studentService;

    private ResponseMessage responseMessage;
    
    @GetMapping("/api/students")
    public ResponseEntity<List<Students>> getAllStudents(){
        List<Students> res = this.studentService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(res);
    }
    
    @GetMapping("/api/students/{id}")
    public ResponseEntity<?> getStudent(@PathVariable("id") int id){
        return ResponseEntity.ok(this.studentService.findById(id));
    }

    @PostMapping("/api/students")
    public ResponseEntity<?> addStudent(@RequestBody Students student){
        Students save = this.studentService.save(student);
        return ResponseEntity.ok(save);
    }

    @PutMapping("/api/students/{id}")
    public ResponseEntity<?> updateStudent(@RequestBody Students student, @PathVariable("id") int id){
        this.studentService.save(student);
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/api/students/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable("id") int id){
        this.studentService.deleteById(id);
        responseMessage = new ResponseMessage();
        responseMessage.setType("success");
        responseMessage.setMessage("Student record has been deleted with student id : " + id );
        return ResponseEntity.ok(responseMessage);
    }
}
