package com.example.demo.model;

public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String phone;

    public User() {}

    public User(Long id, String name, String email, String password, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    public long getid(){
        return id ;
    }
    public void setid(long id){
        this.id = id ;
    }

    public String getname(){
        return name ;
    }
    public void setname(String name){
        this.name = name ;
    }

    public String getemail(){
        return email ;
    }
    public void setemail(String email){
        this.email = email ;
    }
    public String getpassword(){
        return password ;
    }
    public void setpassword(String password){
        this.password = password ;
    }
    public String getphone(){
        return phone ;
    }
    public void setphone(String phone){
        this.phone = phone ;
    }

}
 







