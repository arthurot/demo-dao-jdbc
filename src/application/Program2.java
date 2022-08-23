package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
//		System.out.println("=== TESTE 1: department findById ===");
//		Department dep = departmentDao.findById(2);
//		System.out.println(dep);
//
//		System.out.println("\n=== TESTE 3: department findAll ===");
//		List<Department> list = departmentDao.findAll();
//
//		for (Department obj : list) {
//			System.out.println(obj);
//		}
//		
//		System.out.println("\n=== TESTE 4: department insert ===");
//		Department newDep = new Department(null, "Food");	
//		departmentDao.insert(newDep);
//		System.out.println("Inserted! New id = " + newDep.getId());
//		
//		System.out.println("\n=== TESTE 5: department update ===");
//		dep = departmentDao.findById(3);
//		dep.setName("Stocks Updt");
//		departmentDao.update(dep);
//		System.out.println("Update completed!");
		
		System.out.println("\n=== TESTE 6: department delete ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt(); 
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		
		sc.close();
	}

}
