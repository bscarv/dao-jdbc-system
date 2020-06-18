package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {		
		
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
	}

}
