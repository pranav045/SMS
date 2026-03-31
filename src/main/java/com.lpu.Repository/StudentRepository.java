package com.lpu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lpu.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
