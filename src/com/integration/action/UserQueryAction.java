package com.integration.action;
import java.util.List;
import org.apache.struts2.ServletActionContext;
import com.integration.entity.User;
import com.integration.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
public class UserQueryAction extends ActionSupport {
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String execute(){	
			List<User> userlist=userService.findAll();
			ServletActionContext.getRequest().setAttribute("userlist", userlist);
			return SUCCESS;
	}
}
