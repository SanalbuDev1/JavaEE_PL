package com.platzi.Hibernate.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "social_media")
public class SocialMedia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_social_media")
	private Long idSocialMedia;
	@Column(name = "name")
	private String name;
	@Column(name = "icon")
	private String icon;

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "id_social_media") private Set<TeacherSocialMedia>
	 * teacherSocialMediasList;
	 * 
	 * public Set<TeacherSocialMedia> getTeacherSocialMediasList() { return
	 * teacherSocialMediasList; }
	 * 
	 * public void setTeacherSocialMediasList(Set<TeacherSocialMedia>
	 * teacherSocialMediasList) { this.teacherSocialMediasList =
	 * teacherSocialMediasList; }
	 */

	public Long getIdSocialMedia() {
		return idSocialMedia;
	}

	public void setIdSocialMedia(Long idSocialMedia) {
		this.idSocialMedia = idSocialMedia;
	}

	public SocialMedia() {
	}

	public SocialMedia(String name, String icon) {
		super();
		this.name = name;
		this.icon = icon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

}
