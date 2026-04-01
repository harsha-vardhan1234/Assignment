package com.many;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Menu {
	private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("demo1");
	 private static EntityManager em=emf.createEntityManager();
	private static EntityTransaction et=em.getTransaction();
	private static Scanner sc=new Scanner(System.in);
	private static String stu;
	private static String dept;
	
	public static void menuu() {
		System.out.println("1.insert into the student table \n2.update student details  \n3.fetch the student data\n4.delete the student data");
		switch(sc.nextInt()) {
		case 1:insert();break;
		case 2:update();break;
		case 3:fetch();break;
		case 4:delete();break;
		default:System.out.println("in valid choice  \n enter the correct choice :");
		menuu();
		
		}
		}
	public static  void insert() {
		System.out.println("enter the no of students u need to insert");
		int count=sc.nextInt();
		for(int i=1;i<=count;i++) {
			 stu="s"+i;
			 dept="d"+i;
			Student stu=new Student();
			System.out.println("enter the id of "+i+"student");
			stu.setId(sc.nextInt());
			sc.nextLine();
			System.out.println("enter the name of the "+i+"student");
			stu.setName(sc.nextLine());
			System.out.println("enter the dept id for "+i+"student ");
			Depart d=em.find(Depart.class,sc.nextInt());
			if(d!=null) {
				stu.setD(d);
			}
			else {
				System.out.println("dept id not found ");
				break;
			}
			et.begin();
			em.persist(stu);
			et.commit();
			}
	}
	public static void update() {
		System.out.println("enter the studentid to update :");
		int id=sc.nextInt();
		Student s=em.find(Student.class,id);
		if(s!=null) {
			System.out.println("1.enter the name to update \n2.enter the dept to update\n3.update both");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:nameUpdate(id);break;
			case 2:deptid(id);break;
			case 3:both(id);break;
			default:System.out.println("invaild choice ");
			update();
			
			}
			}
	}
	public static void nameUpdate(int id) {
		Student s=em.find(Student.class,id);
		System.out.println("enter the name :");
		s.setName(sc.nextLine());
		et.begin();
		em.merge(s);
		et.commit();
		System.out.println("update done ");
		}
	public static void deptid(int id) {
		Student s=em.find(Student.class,id);
		System.out.println("enter the dept id :");
		Depart d=em.find(Depart.class,sc.nextInt());
		if(d!=null) {
			s.setD(d);
			et.begin();
			em.merge(s);
			et.commit();
			System.out.println("update done ");
			
		}
		else {
			System.out.println("dept id is not found ");
			return;
		}
		
	}
	public static void both(int id) {
		Student s=em.find(Student.class,id);
		System.out.println("enter the name :");
		s.setName(sc.nextLine());
		System.out.println("enter the dept id :");
		Depart d=em.find(Depart.class,sc.nextInt());
		if(d!=null) {
			s.setD(d);
			et.begin();
			em.merge(s);
			et.commit();
			System.out.println("update donee ");
			
		}
		else {
			System.out.println("dept id is not found ");
			return;
		}
	}
	public static void fetch() {
		System.out.println("enter the studentid to fetch :");
		int id=sc.nextInt();
		Student s=em.find(Student.class,id);
		if(s!=null) {
			System.out.println("id  name    d_id   name ");
			System.out.print(s.getId()+ " "+s.getName()+"   ");
			 Depart d=s.getD();
			 System.out.print(d.getId()+"    "+d.getName());
		}
		
	}
	public static void delete() {
		System.out.println("enter the studentid to delete  :");
		int id=sc.nextInt();
		Student s=em.find(Student.class,id);
		if(s!=null) {
			et.begin();
			em.remove(s);
			et.commit();
			System.out.println("deleted done ");
			}
		else {
			System.out.println("id not found in the data base ");
		}
		
	}
	
	
    public static void main(String[] args) {
		menuu() ;

	}

}
