package it.academy.finalExam.controller;

import it.academy.finalExam.service.CounterService;
import it.academy.finalExam.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/counter")
public class CounterController {
    @Autowired
    private CounterService counterService;
    @Autowired
    private ReportService reportService;

    @GetMapping
    public ResponseEntity getAll(){
        try{
            reportService.create1("get", (Date) counterService.getAll());
            return new ResponseEntity<>(counterService.getAll(), HttpStatus.FOUND);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity create(){
        try{
            reportService.create1("post",counterService.create().getDate());
            return new ResponseEntity<>(counterService.create(), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }
}
