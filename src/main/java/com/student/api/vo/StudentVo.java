package com.student.api.vo;

import java.util.List;

import com.student.api.entity.AcademicDetails;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentVo {

	private long id;
	private String name;
	private String email;
	private String phoneNumber;
    private String address;

    private List<AcademicDetails> academicDetails;
}
