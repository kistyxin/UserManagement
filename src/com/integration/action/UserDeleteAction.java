package com.integration.action;
import com.integration.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
public class UserDeleteAction extends ActionSupport {
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String execute(){
		userService.deleteUser(id);
			return SUCCESS;
	}
	private int id;
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
}
