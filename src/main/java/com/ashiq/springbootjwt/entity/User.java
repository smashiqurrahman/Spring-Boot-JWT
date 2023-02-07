package com.ashiq.springbootjwt.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="USER_TBL")
public class User {
	@Id
	private int id;
	private String userName;
	private String password;
	private String email;
}
