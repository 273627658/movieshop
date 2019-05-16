package xyz.wcl.movieshop.entity;

public class Comment {
    //空的构造函数
    public Comment(){
    };
    //评论id
    private String comment_id;
    //用户id
    private String user_id;
    //电影id
    private String moive_id;
    //评论时间
    private String comment_time;
    //评论内容
    private String content;
    //评论评分
    private String comment_score;

    public String getComment_id() {
        return comment_id;
    }

    public void setComment_id(String comment_id) {
        this.comment_id = comment_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getMoive_id() {
        return moive_id;
    }

    public void setMoive_id(String moive_id) {
        this.moive_id = moive_id;
    }

    public String getComment_time() {
        return comment_time;
    }

    public void setComment_time(String comment_time) {
        this.comment_time = comment_time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getComment_score() {
        return comment_score;
    }

    public void setComment_score(String comment_score) {
        this.comment_score = comment_score;
    }
}
