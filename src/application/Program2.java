package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== TEST 1: department findById ====");
		Department department = departmentDao.findById(7);
		System.out.println(department);
		
		System.out.println("\n==== TEST 2: department findAll ====");
		List<Department> list = departmentDao.findAll();
		for(Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println("\n==== TEST 3: department insert ====");
		Department newDepartment = new Department(null, "Financeiro");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n==== TEST 4: department delete ====");
		departmentDao.deleteById(6);
		System.out.println("Delete complete!!");
		
		System.out.println("\n==== TEST 5: department update ====");
		department.setName("Finance");
		departmentDao.update(department);
		System.out.println("Update complete!");

	}

}
