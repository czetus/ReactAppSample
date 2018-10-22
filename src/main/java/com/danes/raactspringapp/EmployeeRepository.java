package com.danes.raactspringapp;

import com.danes.raactspringapp.domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
