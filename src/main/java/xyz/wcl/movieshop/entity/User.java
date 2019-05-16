package xyz.wcl.movieshop.entity;

public class User {
    /**
     * 无参构造，什么都没有，连操作都没有
     */
    public User(){
        this.user_id = null;
        this.user_name = null;
        this.user_phone = null;
        this.user_password = null;
        this.is_admin = 0;
    };

    /**
     * 不含用户密码的有参构造函数
     * @param user_id 用户id
     * @param user_name 用户姓名
     * @param user_phone 用户电话
     * @param is_admin 用户是否为管理员
     */
    public User(String user_id, String user_name, String user_phone, int is_admin) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_phone = user_phone;
        this.is_admin = is_admin;
    }

    /**
     * 含用户密码的构造方法
     * @param user_id 用户id
     * @param user_name 用户姓名
     * @param user_phone 用户电话
     * @param user_password 用户密码
     * @param is_admin 用户是否为管理员
     */
    public User(String user_id, String user_name, String user_phone, String user_password, int is_admin) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_phone = user_phone;
        this.user_password = user_password;
        this.is_admin = is_admin;
    }

    //用户id
    private String user_id;
    //用户名
    private String user_name;
    //用户手机号码
    private String user_phone;
    //用户密码
    private String user_password;
    //是否为管理员   1表示管理员 0表示普通用户
    private int is_admin;

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", user_password='" + user_password + '\'' +
                ", is_admin=" + is_admin +
                '}';
    }

    public int getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(int is_admin) {
        this.is_admin = is_admin;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }


}
