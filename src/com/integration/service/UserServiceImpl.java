package com.integration.service;
import java.util.List;
import com.integration.dao.UserDAO;
import com.integration.entity.User;
public class UserServiceImpl implements UserService {
	private UserDAO userDAO;
	public void setUserDAO(UserDAO userDAO){
		this.userDAO=userDAO;
	}
	public void saveUser(User user) {
		if(userDAO.findById(user.getId())==null)
			userDAO.save(user);
	}
	public User getUser(String name) {
		return userDAO.getUser(name);
	}
	public void deleteUser(int id) {
		if(userDAO.findById(id)!=null)
			userDAO.delete(id);
		
	}
	public void updateUser(User user) {
		if(userDAO.findById(user.getId())!=null)
			userDAO.update(user);
	}
	public User findUserById(int id) {
		return userDAO.findById(id);
	}
	public List<User> findAll() {
		return userDAO.findAll();
	}

	
	
}
