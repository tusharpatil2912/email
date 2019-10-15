package com.slksoft.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.slksoft.entity.User;

public interface UsersDao {

	// CRUD OPERATIONS
	
	@Insert("insert into users(name, email, phone, gender, password, created_at) values(#{name}, #{email}, #{phone}, #{gender}, md5(#{password}), #{createdAt})")
	public void addNewUser(User user);
	
	// QUERIES
	
	@Select("select * from users where email=#{email} and password=md5(#{password})")
	public User loginUser(@Param("email") String email, @Param("password") String password);
	
	
}
