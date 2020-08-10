package com.platzi.Hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "teacher_social_media")
public class TeacherSocialMedia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_teacher_social_media")
	private Long idTeacherSocialMedia;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_Teacher")
	private Teacher teacher;
	
	@ManyToOne
	@JoinColumn(name = "id_social_media ")
	private SocialMedia idSocialMedia;
	
	private String nickname;

	public TeacherSocialMedia() {
	}

	public TeacherSocialMedia(Teacher teacher, SocialMedia idSocialMedia, String nickname) {
		super();
		this.teacher = teacher;
		this.idSocialMedia = idSocialMedia;
		this.nickname = nickname;
	}

	public Long getIdTeacherSocialMedia() {
		return idTeacherSocialMedia;
	}

	public void setIdTeacherSocialMedia(Long idTeacherSocialMedia) {
		this.idTeacherSocialMedia = idTeacherSocialMedia;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public SocialMedia getIdSocialMedia() {
		return idSocialMedia;
	}

	public void setIdSocialMedia(SocialMedia idSocialMedia) {
		this.idSocialMedia = idSocialMedia;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	

}
