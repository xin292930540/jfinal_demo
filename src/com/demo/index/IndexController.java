package com.demo.index;

import com.demo.common.model.User;
import com.jfinal.core.Controller;
import com.jfinal.plugin.ehcache.CacheKit;

/**
 * 本 demo 仅表达最为粗浅的 jfinal 用法，更为有价值的实用的企业级用法
 * 详见 JFinal 俱乐部: http://jfinal.com/club
 * 
 * IndexController
 */
public class IndexController extends Controller {
	public void index() {
	    //User user = (User) getSessionAttr("loginUser");
	    User user = CacheKit.get("UserCache","user");
        if(user!=null){
            setAttr("user",user);
            render("index.html");
        }else{
            redirect("/login");
        }
	}
}





