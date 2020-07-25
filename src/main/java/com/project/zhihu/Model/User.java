package com.project.zhihu.Model;

public class User {
    //User attributes
    private long id;
    private String name;
    private String password;
    private String salt;
    private String headUrl;

    public User(){}
    public User(String name, String password, String salt, String headUrl){
        this.name = name;
        this.password = password;
        this.salt = salt;
        this.headUrl = headUrl;
    }

    public void setId(int id){
        this.id = id;
    }
    public long getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public void setSalt(String salt){
        this.salt = salt;
    }
    public String getSalt(){
        return salt;
    }
    public void setHeadUrl(String headUrl){
        this.headUrl = headUrl;
    }
    public String getHeadUrl(){
        return headUrl;
    }
    public String toString(){
        StringBuilder Result = new StringBuilder("ID:"+String.valueOf(id));
        Result.append(" NAME:"+name);
        Result.append(" PASSWORD:"+password);
        Result.append(" SALT:"+salt);
        Result.append(" HEADURL:"+headUrl);
        return Result.toString();
    }
}
