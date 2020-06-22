package it.academy.finalExam.service;

import it.academy.finalExam.entity.Report;

import java.util.Date;

public interface ReportService extends BaseService<Report> {
    public void create1(String s, Date date);
}
