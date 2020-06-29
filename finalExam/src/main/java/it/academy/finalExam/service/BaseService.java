package it.academy.finalExam.service;

import java.util.List;

public interface BaseService <T> {
    List<T> getAll();

   T create() ;
}
