package xyz.wcl.movieshop.dao.impl;

import xyz.wcl.movieshop.dao.UserDao;
import xyz.wcl.movieshop.dbc.DatabaseConnection;
import xyz.wcl.movieshop.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    /**
     * 插入用户
     * @param user 插入的用户
     */
    @Override
    public void insert(User user) {
        Connection connection= null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DatabaseConnection.getConnection();
//            获取statement
            String sql = "insert into user(user_id,user_name,user_phone,user_password,is_admin) value(?,?,?,?,?) ";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,user.getUser_id());
            preparedStatement.setString(2,user.getUser_name());
            preparedStatement.setString(3,user.getUser_phone());
            preparedStatement.setString(4,user.getUser_password());
            preparedStatement.setInt(5,user.getIs_admin());
//            执行SQL
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
//            释放资源 connection prepareStatement resultSet
            DatabaseConnection.close(connection,preparedStatement,null);
        }
    }

    /**
     * 根据用户ID查询
     * @param id 查询用户的id
     * @return 查询到的用户（含密码）
     */
    @Override
    public User queryById(String id) {
        Connection connection = null;
        PreparedStatement prepareStatement = null;
        ResultSet resultSet = null;
        User user = null;
        try {
            connection = DatabaseConnection.getConnection();
//            获取statement
            String sql = "select * from user where user_id=? ";
            prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setString(1,id);
//            执行sql
            resultSet = prepareStatement.executeQuery();
//            处理查询出来的数据
            while (resultSet.next()){
                String userId = resultSet.getString("user_id");
                String name = resultSet.getString("user_name");
                String phone = resultSet.getString("user_phone");
                String passwd = resultSet.getString("user_password");
                int isAdmin = resultSet.getInt("is_admin");
                user = new User(userId,name,phone,passwd,isAdmin);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
//            释放资源 connection prepareStatement resultSet
            DatabaseConnection.close(connection, prepareStatement, resultSet);
        }
        return user;
    }

    /**
     * 查询所有用户
     * @return 列表返回所有用户（不含密码）
     */
    @Override
    public List<User> queryAll() {
        Connection connection = null;
        PreparedStatement prepareStatement = null;
        ResultSet resultSet = null;
        List<User> userList = new ArrayList<User>();
        try {
            connection = DatabaseConnection.getConnection();
//            获取statement
            String sql ="select * from user";
            prepareStatement = connection.prepareStatement(sql);
//            执行sql
            resultSet = prepareStatement.executeQuery();
//            处理查询出来的数据
            while(resultSet.next()) {
                String userId = resultSet.getString("user_id");
                String name = resultSet.getString("user_name");
                String phone = resultSet.getString("user_phone");
                int isAdmin = resultSet.getInt("is_admin");
                User user = new User(userId,name,phone,isAdmin);
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
//            释放资源 connection prepareStatement resultSet
            DatabaseConnection.close(connection, prepareStatement, resultSet);
        }
        return userList;
    }

    /**
     * 更新用户信息
     * @param user 要更新的用户（含密码）
     */
    @Override
    public void update(User user) {
        Connection connection = null;
        PreparedStatement prepareStatement = null;
        try {
            connection = DatabaseConnection.getConnection();
//            获取Statement
            String sql ="update user set user_name=?,user_phone=?,user_password=?,is_admin=? where user_id=?";
            prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setString(1,user.getUser_name());
            prepareStatement.setString(2,user.getUser_phone());
            prepareStatement.setString(3,user.getUser_password());
            prepareStatement.setInt(4,user.getIs_admin());
            prepareStatement.setString(5,user.getUser_id());
//            执行sql
            prepareStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
//            释放资源 connection prepareStatement resultSet
            DatabaseConnection.close(connection, prepareStatement, null);
        }
    }

    /**
     * 根据用户id删除用户
     * @param id 删除用户的id
     */
    @Override
    public void delete(String id) {
        Connection connection = null;
        PreparedStatement prepareStatement = null;
        try {
            connection = DatabaseConnection.getConnection();
//            获取Statement
            String sql ="delete from user where user_id=?";
            prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setString(1,id);
//            执行sql
            prepareStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
//            释放资源 connection prepareStatement resultSet
            DatabaseConnection.close(connection, prepareStatement, null);
        }
    }

}
