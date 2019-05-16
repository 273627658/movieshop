package xyz.wcl.movieshop.entity;

public class Movie {
    //空的构造函数
    public Movie() {
    };
    //电影id
    private String movie_id;
    //电影名
    private String movie_name;
    //电影海报url
    private String image_url;
    //导演名
    private String director;
    //主演名
    private String actor;
    //电影评分
    private double movie_score;
    //电影简介
    private String discription;
    //是否为广告
    private boolean is_AD;

    public String getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(String movie_id) {
        this.movie_id = movie_id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public double getMovie_score() {
        return movie_score;
    }

    public void setMovie_score(double movie_score) {
        this.movie_score = movie_score;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public boolean isIs_AD() {
        return is_AD;
    }

    public void setIs_AD(boolean is_AD) {
        this.is_AD = is_AD;
    }
}
