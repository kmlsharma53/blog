package com.blog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADMIN")
public class Admin {
	
	private Integer adminId;
	
	private String adminName;
	
	private Integer roleId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="admin_id")
	public Integer getAdminId(){
		return adminId;
	}
	
	public void setAdminId(Integer adminId){
		this.adminId = adminId;
	}
	
	@Column(name="admin_name")
	public String getAdminName(){
		return adminName;
	}
	
	public void setAdminName(String adminName){
		this.adminName = adminName;
	}
	
	@Column(name="role_id")
	public Integer getroleId(){
		return roleId;
	}
	
	public void setRoleId(Integer roleId){
		this.roleId = roleId;
	}

}
