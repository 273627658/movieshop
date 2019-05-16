package xyz.wcl.movieshop.dao;

import xyz.wcl.movieshop.entity.User;

import java.util.List;

public interface UserDao {
    /**
     * 插入用户
     * @param user 插入的用户
     */
    public void insert(User user);

    /**
     * 根据用户ID查询
     * @param id 查询用户的id
     * @return 查询到的用户（含密码）
     */
    User queryById(String id);

    /**
     * 查询所有用户
     * @return 列表返回所有用户（不含密码）
     */
    List<User> queryAll();

    /**
     * 更新用户
     * @param user 要更新的用户（含密码）
     */
    void update(User user);

    /**
     * 根据id删除用户
     * @param id 删除用户的id
     */
    void delete(String id);

}
