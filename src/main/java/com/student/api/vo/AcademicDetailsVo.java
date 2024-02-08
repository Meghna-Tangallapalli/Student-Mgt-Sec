package com.student.api.vo;

import com.student.api.entity.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AcademicDetailsVo {

	private Long id;
	private String education;
	private float percentage;
	private int year;
	private String institute;
	
	private Student student;
}
