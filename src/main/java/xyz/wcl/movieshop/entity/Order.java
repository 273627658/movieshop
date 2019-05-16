package xyz.wcl.movieshop.entity;

public class Order {
    //空的构造函数
    public Order(){
    };
    //订单id
    private String order_id;
    //电影id
    private String movie_id;
    //用户id
    private String user_id;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(String movie_id) {
        this.movie_id = movie_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
