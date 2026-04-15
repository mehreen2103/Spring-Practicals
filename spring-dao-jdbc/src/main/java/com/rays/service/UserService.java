
package com.rays.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rays.dao.UserDAOInt;
import com.rays.dto.UserDTO;

@Service
public class UserService {

	@Autowired
	private UserDAOInt dao;

	public long add(UserDTO dto) {
		long pk = dao.add(dto);
		return pk;
	}

	public void delete(int id) {
		dao.delete(id);
	}
	
	public void update(UserDTO dto) {
		dao.update(dto);
	}
	
	public UserDTO findByPk(int id) {
		return dao.findbypk(id);
	}

	public UserDTO findByLogin(String login) {
		return dao.findbylogin(login);
	}

	public UserDTO authenticate(String login, String password) {
		return dao.authenticate(login, password);
	}
	
	
	public List<UserDTO> search(UserDTO dto, int pageNo, int pageSize) {
		return dao.search(dto, pageNo, pageSize);
	}


}
