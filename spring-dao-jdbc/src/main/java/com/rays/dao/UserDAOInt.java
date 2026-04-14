package com.rays.dao;

import com.rays.dto.UserDTO;

public interface UserDAOInt {
	
	public long nextpk();
	
	public long add(UserDTO dto);
	
	public void delete(int id);
	
	public void update(UserDTO dto);
	
	public UserDTO findbypk(int id);
	
	public UserDTO findbylogin(String login);
	
	public UserDTO authenticate(String login, String password);

}
