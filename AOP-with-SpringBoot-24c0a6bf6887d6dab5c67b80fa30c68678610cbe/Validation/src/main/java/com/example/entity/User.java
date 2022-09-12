package com.example.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor(staticName="build")
@NoArgsConstructor
@Data
@Entity
@Table(name = "USERS_TABLE")
public class User {
	
	@Id
	@GeneratedValue
	private int userId;
	private String username;
	private String email;
	private String mobileNo;
	private String gender;
	private int age;
	private String nationality;

}
