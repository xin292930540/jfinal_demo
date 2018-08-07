package com.demo.user;

import com.demo.common.model.User;
import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.jfinal.ext.interceptor.SessionInViewInterceptor;
import com.jfinal.plugin.ehcache.CacheKit;

import java.util.HashMap;
import java.util.Map;

@Before(UserInterceptor.class)
public class UserController extends Controller {

     UserService userService = UserService.me;

    public void index(){
        setAttr("userPage",userService.getPaginate(getParaToInt(0,1),2));
        render("user.html");
    }

    public void add(){
        render("add.html");
    }

    @Before(UserValidator.class)
    public void save(){
        getBean(User.class).save();
        redirect("/user");
    }

    @Before(UserValidator.class)
    public void update(){
        getBean(User.class).update();
        redirect("/user");
    }

    public void edit(){
        setAttr("user", userService.findById(getParaToInt()));
    }

    public void delete(){
        userService.deleteById(getParaToInt());
        redirect("/user");
    }

    @Before(SessionInViewInterceptor.class)
    public void login(){
        Map<String, Object> resultMap = new HashMap<String, Object>();
        String uName = getPara("uName");
        String pwd = getPara("pwd");
        User user = userService.find(uName,pwd);
        if (user!=null){
            resultMap.put("isSuccess",Boolean.TRUE);
            resultMap.put("userLogin",user);
            resultMap.put("msg","登录成功");
            setSessionAttr("loginUser", user);
            //CacheKit 操作cache把user加入到缓存中
            CacheKit.put("UserCache","user",user);
        }else{
            resultMap.put("isSuccess",Boolean.FALSE);
            resultMap.put("userLogin",user);
            resultMap.put("msg","用户或密码不存在,登录失败");
        }
        renderJson(resultMap);
    }
}
