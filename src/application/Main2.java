package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TESTE 1: department findById ===");		
		Department department1 = departmentDao.findById(3);		
		System.out.println(department1);	
		
		
		System.out.println();
		
		System.out.println("=== TESTE 3: department findAll ===");
		List<Department> list3 = departmentDao.findAll();		
		for(Department department3 : list3) {
			System.out.println(department3);
		}
		
		System.out.println();
		
		System.out.println("=== TESTE 4: department insert ==="); 
		Department department4 = new Department(null, "Sports");
		departmentDao.insert(department4); 
		System.out.println("Inserted! New id = " + department4.getId());
		
		System.out.println();
		
		System.out.println("=== TESTE 5: department update ==="); 
		Department department5 = departmentDao.findById(8);
		department5.setName("Aquatic Sports");
		departmentDao.update(department5);
		System.out.println("Update completed!");
		
		System.out.println();
		
		System.out.println("=== TESTE 6: department delete ==="); 
		System.out.println("Enter an id to delete: "); 
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		
		sc.close();		
	}
}
