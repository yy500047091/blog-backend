package com.codewithyogesh.blog.services;

import java.util.List;

import com.codewithyogesh.blog.payloads.UserDto;

public interface UserService {

	UserDto registerNewUser(UserDto userDto,String role);
	
	
	UserDto createUser(UserDto user);

	UserDto updateUser(UserDto user, Integer userId);

	UserDto getUserById(Integer userId);

	List<UserDto> getAllUsers();

	void deleteUser(Integer userId);

}
