package com.example.involvement.repository;

import com.example.involvement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentrepo extends JpaRepository<Student, Long> {
}
