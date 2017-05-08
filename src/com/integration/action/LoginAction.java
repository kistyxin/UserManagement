package com.integration.action;
import java.util.Iterator;
import java.util.List;
import com.integration.service.UserService;
import com.integration.entity.User;
import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {
	String username;
	String password;
	String usertype;
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String execute(){
		List<User> list = (List<User>) userService.findAll();
		User u = new User();
		Iterator<User> it=list.iterator(); 
		while(it.hasNext()){
			 u = (User)it.next();
			 if(username.trim().equals(u.getName())&&password.trim().equals(u.getPassword())&&usertype.trim().equals(u.getType()))
				  return "success";
			 else return "failer";
		}
		 String page = "failer";
		   return page;
}
}
	