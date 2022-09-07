package com.example.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor()
@NoArgsConstructor
public class UserRequest {

	@NotNull(message = "UserName shouldn't be null")
	private String username;

	@Email(message = "invalid email address")
	private String email;

	@NotNull
	@Pattern(regexp = "^\\d{10}$", message = "invalid  mobile no entered")
	private String mobileNo;
	private String gender;

	@Min(18)
	@Max(60)
	private int age;

	// NotNull && Empty
	@NotBlank
	private String nationality;

}
