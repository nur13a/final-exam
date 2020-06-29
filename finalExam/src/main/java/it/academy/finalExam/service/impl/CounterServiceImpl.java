package it.academy.finalExam.service.impl;

import it.academy.finalExam.entity.Counter;
import it.academy.finalExam.repository.CounterRepo;
import it.academy.finalExam.service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CounterServiceImpl implements CounterService {
    private static Integer i=1;
    @Autowired
    private CounterRepo counterRepo;
    @Override
    public List<Counter> getAll() {
        return counterRepo.findAll();
    }

    @Override
    public Counter create() {
        Counter counter1=Counter.builder().count(i++).build();
        return counterRepo.save(counter1);
    }
}
