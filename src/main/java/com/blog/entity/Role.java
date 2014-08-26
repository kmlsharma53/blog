package com.blog.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ROLE")
public class Role {
	
	private Integer roleId;
	
	private String roleName;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="role_id")
	public Integer getRoleId(){
		return roleId;
	}
	
	public void setRoleId(Integer roleId){
		this.roleId = roleId;
	}
	
	@Column(name="role_name")
	public String getRoleName(){
		return roleName;
	}
	
	public void setRoleName(String roleName){
		this.roleName = roleName;
	}
}
