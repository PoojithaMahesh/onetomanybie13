package onetomanybie13.controller;

import java.util.ArrayList;
import java.util.List;

import javax.crypto.spec.GCMParameterSpec;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomanybie13.dto.Company;
import onetomanybie13.dto.Employee;

public class CompEmpCont {
public static void main(String[] args) {
	Company company=new Company();
	company.setId(1);
	company.setName("TY");
	company.setGst("ty@123");
	
	
	Employee employee1=new Employee();
	employee1.setId(1);
	employee1.setName("Kiran");
	employee1.setAddress("Bang");
	employee1.setCompany(company);
	
	Employee employee2=new Employee();
	employee2.setId(2);
	employee2.setName("chaithanya");
	employee2.setAddress("Bang");
	employee2.setCompany(company);
	
	List<Employee> employees=new ArrayList<Employee>();
	employees.add(employee1);
	employees.add(employee2);
	company.setEmployees(employees);
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(company);
	entityManager.persist(employee1);
	entityManager.persist(employee2);
	entityTransaction.commit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
