package com.integration.dao;
import java.util.List;
import com.integration.entity.User;
public interface UserDAO {
	 void save(User user);
	 User getUser(String name);
	 void delete(int id);
	 void update(User user);
	 User findById(int id);
	 List<User> findAll();
}