package com.orm;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;



public class StudentDao implements IStudentDao{

	public void saveStudent(Student student) {
		Transaction trans=null;
		Session session=HibernateUtil.getSessionfactory().openSession();
		trans=session.beginTransaction();
		session.save(student);
		trans.commit();
	}

	public void updateStudent(Student student) {
		Transaction trans=null;
		Session session=HibernateUtil.getSessionfactory().openSession();
		trans=session.beginTransaction();
		session.saveOrUpdate(student);
		trans.commit();
	}

	public Student getStudentById(int id) {
		Transaction trans=null;
		Student student=null;
		Session session=HibernateUtil.getSessionfactory().openSession();
		student=(Student) session.get(Student.class,id);
		trans.commit();
		return student;
	}
	
@SuppressWarnings("unchecked")
	public List<Student> getAllStudents() {
		Transaction trans=null;
		List<Student> student=null;
		Session session=HibernateUtil.getSessionfactory().openSession();
		trans=session.beginTransaction();
		student=session.createQuery("from Student").list();
		return student;
	}

	public void deleteStudent(int id) {
		Transaction trans=null;
		Student student=null;
		Session session=HibernateUtil.getSessionfactory().openSession();
		student=(Student) session.get(Student.class,id);
		session.delete(student);
	}

}
