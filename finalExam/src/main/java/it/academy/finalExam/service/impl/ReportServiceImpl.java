package it.academy.finalExam.service.impl;

import it.academy.finalExam.controller.CounterController;
import it.academy.finalExam.entity.Report;
import it.academy.finalExam.repository.ReportRepo;
import it.academy.finalExam.service.CounterService;
import it.academy.finalExam.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    private ReportRepo reportRepo;
    @Autowired
    private CounterController counterController;

    @Override
    public List<Report> getAll() {
        return reportRepo.findAll();
    }

    @Override
    public Report create() {
        return null;
    }

     @Override
    public void create1(String s, Date date) {
//        if (counterController.create().hasBody()) return reportRepo.save(Report.builder().type(s).build());
//        else if (counterController.getAll().hasBody()) return reportRepo.save(Report.builder().type(s).build());
         reportRepo.save(Report.builder().type(s).date(date).build());
    }
}
