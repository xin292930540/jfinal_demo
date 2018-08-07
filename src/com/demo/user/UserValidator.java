package com.demo.user;

import com.demo.common.model.Blog;
import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class UserValidator extends Validator {
	
	protected void validate(Controller controller) {
		validateRequiredString("user.uName", "uNameMsg", "请输入User用户名!");
		validateRequiredString("user.pwd", "pwdMsg", "请输入User密码!");
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(Blog.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/user/save"))
			controller.render("add.html");
		else if (actionKey.equals("/user/update"))
			controller.render("edit.html");
	}
}
