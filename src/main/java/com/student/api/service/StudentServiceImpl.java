package com.student.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.api.entity.AcademicDetails;
import com.student.api.entity.Student;
import com.student.api.mapper.StudentMapper;
import com.student.api.repository.AcademicDetailsRepository;
import com.student.api.repository.StudentRepository;
import com.student.api.vo.AcademicDetailsVo;
import com.student.api.vo.StudentVo;

@Service 
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private StudentMapper studentMapper;
	
	@Autowired
	private AcademicDetailsRepository academicRepository;
	
	@Override
	public StudentVo saveEmp(StudentVo studentVo, AcademicDetailsVo academicsVo) {
		 
		
		/*
		 * Student student = new Student(); student.setId(studentVo.getId());
		 * student.setName(studentVo.getName()); student.setEmail(studentVo.getEmail());
		 * student.setPhoneNumber(studentVo.getEmail());
		 * 
		 * List<AcademicDetails> academicslist = new ArrayList<>();
		 * 
		 * AcademicDetails academics = new AcademicDetails();
		 * academics.setEducation(academicsVo.getEducation());
		 * academics.setPercentage(academicsVo.getPercentage());
		 * academics.setYear(academicsVo.getYear());
		 * academics.setInstitute(academicsVo.getInstitute());
		 * academicslist.add(academics);
		 * 
		 * student.setAcademicDetails(academicslist);
		 * 
		 * // List<AcademicDetails> academicDetailsList = new ArrayList<>();
		 * //academicDetailsList.add(academics);
		 * 
		 * // student.setAcademicDetails(academicDetailsList);
		 * 
		 * // Save the Student and its related AcademicDetails Student save =
		 * studentRepository.save(student);
		 * 
		 * StudentVo studentVo1 = new StudentVo(); studentVo1.setId(save.getId());
		 * studentVo1.setName(save.getName()); studentVo1.setEmail(save.getEmail());
		 * studentVo1.setPhoneNumber(save.getPhoneNumber());
		 * studentVo1.setAddress(save.getAddress());
		 * 
		 * List<AcademicDetailsVo> academicslistVo = new ArrayList<>();
		 * 
		 * AcademicDetailsVo academicsVo1 = new AcademicDetailsVo();
		 * academicsVo1.setEducation(academics.getEducation());
		 * academicsVo1.setPercentage(academics.getPercentage());
		 * academicsVo1.setYear(academics.getYear());
		 * academicsVo1.setInstitute(academics.getInstitute());
		 * academicslistVo.add(academicsVo1);
		 * 
		 * studentVo1.set
		 * 
		 * // Convert the saved Student entity to StudentVo and return return ;
		 * 
		 * //academicslist.add(academics); //student.setAcademicDetails(academicslist);
		 */		 
		

		Student student = new Student();
		student.setId(studentVo.getId());
		student.setName(studentVo.getName());
		student.setEmail(studentVo.getEmail());
		student.setPhoneNumber(studentVo.getEmail());

		List<AcademicDetails> academicslist = new ArrayList<>();

		AcademicDetails academics = new AcademicDetails();
		academics.setEducation(academicsVo.getEducation());
		academics.setPercentage(academicsVo.getPercentage());
		academics.setYear(academicsVo.getYear());
		academics.setInstitute(academicsVo.getInstitute());
		academicslist.add(academics);
		// academics.setStudent(student);
		student.setAcademicDetails(academicslist);
		    
			/*
			 * List<AcademicDetails> academicDetailsList = new ArrayList<>();
			 * academicDetailsList.add(academics);
			 */
		    
		   // student.setAcademicDetails(academicDetailsList);

		    // Save the Student and its related AcademicDetails
		   Student save = studentRepository.save(student);

		    // Convert the saved Student entity to StudentVo and return
		    return convertToStudentVo(save);
		
		
	}
	  
	private StudentVo convertToStudentVo(Student student) {
	    StudentVo studentVo = new StudentVo();
	    studentVo.setId(student.getId());
	    studentVo.setName(student.getName());
	    studentVo.setEmail(student.getEmail());
	    studentVo.setPhoneNumber(student.getPhoneNumber());
	    studentVo.setAddress(student.getAddress());
	 studentVo.setAcademicDetails(student.getAcademicDetails());
	    return studentVo;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

/*	@Override
	public StudentVo getById(long id) throws Exception {
		Optional<Student> employee = studentRepository.findById(id);
		StudentVo response = null;
		if (employee.isPresent()) {
			Student emp = employee.get();

			response = StudentVo.builder()
					.id(emp.getId())
					.name(emp.getName())
					.phoneNumber(emp.getPhoneNumber())
					.build();
			return response;

		} else {
			throw new Exception("Employee not found with given id");
		}
*/
	}

































	/*
	 * @Override public StudentVo saveEmp(StudentVo studentVo, AcademicDetailsVo
	 * academicsVo) { // TODO Auto-generated method stub return null; }
	 */
	 

