package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TESTE 1: seller findById ===");		
		Seller seller1 = sellerDao.findById(3);		
		System.out.println(seller1);
		
		System.out.println();
		
		System.out.println("=== TESTE 2: seller findByDepartment ===");
		Department dep2 = new Department(2, null);
		List<Seller> list2 = sellerDao.findByDepartment(dep2);		
		for(Seller seller2 : list2) {
			System.out.println(seller2);
		}
		
		System.out.println();
		
		System.out.println("=== TESTE 3: seller findAll ===");
		List<Seller> list3 = sellerDao.findAll();		
		for(Seller seller3 : list3) {
			System.out.println(seller3);
		}
		
		System.out.println();
		
		System.out.println("=== TESTE 4: seller insert ==="); 
		Seller seller4 = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, dep2);
		sellerDao.insert(seller4); System.out.println("Inserted! New id = " + seller4.getId());
		
		System.out.println();
		
		System.out.println("=== TESTE 5: seller update ==="); 
		Seller seller5 = sellerDao.findById(1);
		seller5.setName("Martha Wayne");
		sellerDao.update(seller5);
		System.out.println("Update completed!");
		
		System.out.println();
		
		System.out.println("=== TESTE 6: seller delete ==="); 
		System.out.println("Enter an id to delete: "); 
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed!");
		
		sc.close();
		
	}

}
