package com.blog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BLOGUSER")
public class BlogUser {
	
	private Integer userId;
	
	private String userName;
	
	private String password;
	
	private String emailId;
	
	private Integer roleId;
	
	private Integer enabled;
	
	@Column(name="enabled")
	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	public Integer getUserId(){
		return userId;
	}
	
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	
	@Column(name="user_name")	
	public String getUserName(){
		return userName;
	}
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	@Column(name="pass_word")
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	@Column(name="email_id")
	public String getEmailId(){
		return emailId;
	}
	
	public void setEmailId(String emailId){
		this.emailId = emailId;
	}
	
	@Column(name="role_id")
	public Integer getRoleId(){
		return roleId;
	}
	
	public void setRoleId(Integer roleId){
		this.roleId = roleId;
	}

}
