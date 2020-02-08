package com.example.task.Data;

public class Owner {private int reputation;

    private int user_id;

    private String user_type;

    private String profile_image;

    private String display_name;

    private String link;

    public void setReputation(int reputation){
        this.reputation = reputation;
    }
    public int getReputation(){
        return this.reputation;
    }
    public void setUser_id(int user_id){
        this.user_id = user_id;
    }
    public int getUser_id(){
        return this.user_id;
    }
    public void setUser_type(String user_type){
        this.user_type = user_type;
    }
    public String getUser_type(){
        return this.user_type;
    }
    public void setProfile_image(String profile_image){
        this.profile_image = profile_image;
    }
    public String getProfile_image(){
        return this.profile_image;
    }
    public void setDisplay_name(String display_name){
        this.display_name = display_name;
    }
    public String getDisplay_name(){
        return this.display_name;
    }
    public void setLink(String link){
        this.link = link;
    }
    public String getLink(){
        return this.link;
    }
}
