package com.Developers.School_Management_System.repo;

import com.Developers.School_Management_System.modal.Examination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface examRepository extends JpaRepository<Examination,Long> {
}
