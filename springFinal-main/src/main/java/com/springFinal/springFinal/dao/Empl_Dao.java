package com.springFinal.springFinal.dao;


	
import org.springframework.data.jpa.repository.JpaRepository;

import com.springFinal.springFinal.entities.Employee;

public interface Empl_Dao extends JpaRepository<Employee,Integer> {

	}


