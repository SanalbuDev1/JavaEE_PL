package com.platzi.Hibernate.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_teacher")
	private Long idTeacher;

	/* Relations */

	@OneToMany(mappedBy = "teacher")
	private Set<Course> coursesList;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_teacher")
	private Set<TeacherSocialMedia> teacherSocialMediasList;

	private String name;
	private String avatar;

	public Teacher() {
	}

	public Teacher(String name, String avatar) {
		super();
		this.name = name;
		this.avatar = avatar;
	}

	public Long getIdTeacher() {
		return idTeacher;
	}

	public void setIdTeacher(Long idTeacher) {
		this.idTeacher = idTeacher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Set<Course> getCoursesList() {
		return coursesList;
	}

	public void setCoursesList(Set<Course> coursesList) {
		this.coursesList = coursesList;
	}

	public Set<TeacherSocialMedia> getTeacherSocialMediasList() {
		return teacherSocialMediasList;
	}

	public void setTeacherSocialMediasList(Set<TeacherSocialMedia> teacherSocialMediasList) {
		this.teacherSocialMediasList = teacherSocialMediasList;
	}

}
