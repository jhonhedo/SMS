package com.abm.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.abm.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
