package xyz.wcl.movieshop.dao.impl;

import xyz.wcl.movieshop.dao.UserDao;
import xyz.wcl.movieshop.entity.User;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UserDaoImplTest {
    static User user;
    static {
        user = new User();
        user.setUser_id("855");
        user.setUser_name("testOfUserDao");
        user.setUser_phone("1545244354");
        user.setUser_password("1111");
        user.setIs_admin(0);
    }


    @org.junit.Test
    public void insert() {
        UserDao userDao = new UserDaoImpl();
        userDao.insert(user);
    }

    @org.junit.Test
    public void queryById(){
        UserDao userDao = new UserDaoImpl();
        User u = userDao.queryById("855");
        System.out.println(u.toString());
    }

    @org.junit.Test
    public void queryAll(){
        UserDao userDao = new UserDaoImpl();
        List<User> userList = new ArrayList<User>();
        userList = userDao.queryAll();
        for (int i = 0;i<userList.size();i++){
            User u = userList.get(i);
            System.out.println(u.toString());
        }
    }

    @org.junit.Test
    public void update(){
        User u = new User();
        u.setUser_id("855");
        u.setUser_name("test");
        u.setUser_phone("1545244354");
        u.setUser_password("1111");
        u.setIs_admin(0);
        UserDao userDao = new UserDaoImpl();
        userDao.update(u);
        System.out.println(u.toString());
    }

    @org.junit.Test
    public void delete(){
        String id = "855";
        UserDao userDao = new UserDaoImpl();
        userDao.delete(id);
        queryAll();
    }
}