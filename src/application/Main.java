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
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);		
		for(Seller seller2 : list) {
			System.out.println(seller2);
		}
	}

}
