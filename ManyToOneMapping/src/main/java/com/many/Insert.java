package com.many;

import javax.persistence.Persistence;

import javax.persistence.EntityTransaction;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class Insert {

	public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("demo1");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Student s=new Student();
	Student s1=new Student();
	Student s2=new Student();
	Depart d=new Depart();
	d.setId(1);
	d.setName("cse");
	s.setId(1);
	s.setName("harsha");
	s.setD(d);
	s1.setId(2);
	s1.setName("varsha");
	s1.setD(d);
	s2.setId(3);
	s2.setName("vyshu");
	s2.setD(d);
	List<Student> l=new ArrayList<>();
	l.add(s);
	l.add(s1);
	l.add(s2);
	d.setS(l);
	et.begin();
	em.persist(s);
	em.persist(d);
	em.persist(s1);
	em.persist(s2);
	et.commit();
	System.out.println("insertion done ");
	
	
		

	}

}
