package com.Developers.School_Management_System.repo;

import com.Developers.School_Management_System.modal.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {

}
