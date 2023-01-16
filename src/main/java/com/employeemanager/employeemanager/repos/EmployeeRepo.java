package com.employeemanager.employeemanager.repos;

import java.util.Optional;

import com.employeemanager.employeemanager.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{
	Optional<Employee> findEmployeeById(Long id);

	@Transactional
	void deleteEmployeeById(Long id);
}
