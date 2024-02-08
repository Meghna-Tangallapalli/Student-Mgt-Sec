package com.student.api.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.student.api.vo.AcademicDetailsVo;
import com.student.api.vo.StudentVo;

@Component
public interface StudentService {

	
	
	//StudentVo getById(long id) throws Exception;

	StudentVo saveEmp(StudentVo studentVo, AcademicDetailsVo academicsVo);

	
}
