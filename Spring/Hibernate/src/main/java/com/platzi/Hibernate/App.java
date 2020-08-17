package com.platzi.Hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.platzi.Hibernate.dao.TeacherDaoImpl;
import com.platzi.Hibernate.model.Course;
import com.platzi.Hibernate.model.Teacher;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		
		Teacher teacher = new Teacher();
		teacher.setAvatar("Antoniov");
		teacher.setName("Antonio");
		
		TeacherDaoImpl s = new TeacherDaoImpl();
		s.saveTeacher(teacher);
		
		/* findAll */
		
		List<Teacher> listT =  s.findAllTeacher();
		for(Teacher data : listT) {
			System.out.println(data.getName());
		}
		
		
		
	}
}
