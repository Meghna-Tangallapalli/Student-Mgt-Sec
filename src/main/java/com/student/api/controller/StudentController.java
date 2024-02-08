package com.student.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.api.service.StudentService;
import com.student.api.vo.AcademicDetailsVo;
import com.student.api.vo.StudentVo;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/save")
	public ResponseEntity<StudentVo> saveEmp(@RequestBody StudentVo studentVo, @RequestBody AcademicDetailsVo academicsVo){		
		return new ResponseEntity<>(studentService.saveEmp(studentVo, academicsVo), HttpStatus.CREATED);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * @GetMapping("/getEmp") public ResponseEntity<StudentVo> getById(@RequestParam
	 * long id) throws Exception{ return new
	 * ResponseEntity<>(studentService.getById(id), HttpStatus.OK);
	 * 
	 * }
	 */
}
