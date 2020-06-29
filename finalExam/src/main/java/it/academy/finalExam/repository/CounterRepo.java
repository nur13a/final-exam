package it.academy.finalExam.repository;

import it.academy.finalExam.entity.Counter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CounterRepo extends JpaRepository<Counter,Long> {
}
