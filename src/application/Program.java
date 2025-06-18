package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(".:: Teste 1: seller findById ::.");
        Seller seller  = sellerDao.findById(10);
        System.out.println(seller);
        System.out.println();

//        System.out.println(".:: Teste 2: seller findByDepartment ::.");
//        Department department = new Department(2,null);
//        List<Seller> list = sellerDao.findByDepartment(department);
//        for(Seller obj : list){
//            System.out.println(obj);
//        }
//        System.out.println();

//        System.out.println(".:: Teste 3: seller findByAll ::.");
//        list = sellerDao.findAll();
//        for(Seller obj : list){
//            System.out.println(obj);
//        }
//        System.out.println();

//        System.out.println(".:: Teste 4: seller insert ::.");
//        Seller newSeller = new Seller(null, "Alexandre", "alexandre@gmail.com", new Date(), 10000.00,department);
//        sellerDao.insert(newSeller);
//        System.out.println("Inserted! New id: " + newSeller.getId());
//        System.out.println();

//        System.out.println(".:: Teste 5: seller update ::.");
//        seller = sellerDao.findById(11);
//        seller.setName("Alexandre Mattos");
//        sellerDao.update(seller);
//        System.out.println("Update completed");

        System.out.println(".:: Teste 6: seller delete ::.");
        System.out.print("Enter id for delete teste: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.print("Deleted completed");
        sc.close();

    }
}
