package com.platzi.Hibernate.dao.interfaces;

import java.util.List;

import com.platzi.Hibernate.model.Teacher;

public interface TeacherI {

	public abstract void saveTeacher(Teacher t);
	
	public abstract List<Teacher> findAllTeacher();
	
	public abstract void findTeacher(Long idTeacher);
	
	public abstract void findByNameTeacher(String nameTeacher);
	
	public abstract void deleteTeacher(Long idTeacher);
	
	public abstract void updateTeacher(Teacher teacher);

	
	
}
