package xyz.wcl.movieshop.entity;

public class Ticket {
    //空的构造函数
    public Ticket(){
    };
    //电影票id
    private String ticket_id;
    //电影id
    private String movie_id;
    //放映id
    private String show_id;
    //价格
    private double price;
    //位置号
    private int seat;
    //状态 0表示未售出 1表示已售出
    private boolean status;

    public String getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(String ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(String movie_id) {
        this.movie_id = movie_id;
    }

    public String getShow_id() {
        return show_id;
    }

    public void setShow_id(String show_id) {
        this.show_id = show_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
