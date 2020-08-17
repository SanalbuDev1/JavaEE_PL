package com.platzi.Hibernate.dao;

import java.util.List;

import org.hibernate.Session;

import com.platzi.Hibernate.dao.interfaces.TeacherI;
import com.platzi.Hibernate.model.Teacher;

public class TeacherDaoImpl extends SessionD implements TeacherI {
	SessionD sessionD;

	public TeacherDaoImpl() {
		this.sessionD = new SessionD();
	}

	@Override
	public void saveTeacher(Teacher t) {
		Session s = null;
		try {
			s = this.sessionD == null ? sessionD.openSession() : this.sessionD.returnSession();
			s.persist(t);
		} catch (Exception e) {
			System.out.println("Ocurrio un error " + e.getMessage());
		} finally {
			s.close();
		}
	}

	@Override
	public List<Teacher> findAllTeacher() {
		Session s = null;
		List<Teacher> list;
		try {
			s = this.sessionD == null ? sessionD.openSession() : this.sessionD.returnSession();
			if(!s.isOpen()) {
				s = openConnectionSession(s);
			}
			list =  s.createQuery("from Teacher").list();
		} catch (Exception e) {
			System.out.println("Ocurrio un error " + e.getMessage());
			return null;
		} finally {
			s.close();
		}			
		return list;
	}

	@Override
	public void findTeacher(Long idTeacher) {
		// TODO Auto-generated method stub

	}

	@Override
	public void findByNameTeacher(String nameTeacher) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteTeacher(Long idTeacher) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub

	}

}
