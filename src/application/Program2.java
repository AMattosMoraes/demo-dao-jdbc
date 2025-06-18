package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmenteDAO();

        System.out.println(".:: Teste 1: Department findById ::.");
//        System.out.print("Enter the Department code: ");
//        int id = sc.nextInt();
        Department department = departmentDao.findById(1);
        System.out.println(department);
        System.out.println();

        System.out.println(".:: Teste 2: seller findByAll ::.");
        List<Department> list = departmentDao.findAll();
        for(Department dep : list){
            System.out.println(dep);
        }
        System.out.println();
    }
}
