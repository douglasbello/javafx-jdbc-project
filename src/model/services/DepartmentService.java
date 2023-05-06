package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {

	public List<Department> findAll() {
		// "mocking" the data, mock means put some fake data just to test
		List<Department> list = new ArrayList<>();
		list.add(new Department(1,"Books"));
		list.add(new Department(2, "Computers"));
		list.add(new Department(3, "Eletronics"));
		
		return list;
	}
}
