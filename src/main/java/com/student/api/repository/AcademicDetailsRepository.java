package com.student.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.api.entity.AcademicDetails;

@Repository
public interface AcademicDetailsRepository extends JpaRepository<AcademicDetails, Long>{

}
