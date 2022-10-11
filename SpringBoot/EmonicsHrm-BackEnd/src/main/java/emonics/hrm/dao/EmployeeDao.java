package emonics.hrm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import emonics.hrm.entities.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer> {
		List<Employee> findBySalaryGreaterThan(double salary);
		
		@Query("select e from Employee e where e.salary<?1")
		List<Employee> findAllEmployee(double amt);
}
