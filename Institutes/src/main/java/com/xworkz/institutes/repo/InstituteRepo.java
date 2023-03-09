package com.xworkz.institutes.repo;

import org.springframework.stereotype.Component;

import com.xworkz.institutes.dto.InstituteDto;


public interface InstituteRepo {

	public String save(InstituteDto dto);
}
