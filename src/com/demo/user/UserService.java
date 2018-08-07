package com.demo.user;

import com.demo.common.model.User;
import com.jfinal.plugin.activerecord.Page;

import java.util.List;

public class UserService {

    public static final UserService me = new UserService();

    private User userDao = new User().dao();

    public Page<User> getPaginate(int pageNumber,int pageSize){
        String from = " from user ";
        String totalRowSql = "select count(*) " + from;
        String findSql = "select id,uName,if(sex=1,'男','女') sexStr" + from;
        return userDao.paginateByFullSql(pageNumber, pageSize, totalRowSql, findSql);
    }

    public User findById(int id){
        return userDao.findById(id);
    }

    public void deleteById(int id){
        userDao.deleteById(id);
    }

    public User find(String uName,String pwd){
        List<User> userList = userDao.find("select uName,if(sex=1,'先生','女生') sexStr from user where uName = ? and pwd = ?",new Object[]{uName,pwd});
        if(userList!=null && userList.size()>0){
            return userList.get(0);
        }
        return null;
    }
}
