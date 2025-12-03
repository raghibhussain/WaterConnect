package com.example.demo.model;

class admin extends User{
    private String role ;

    admin(Long id, String name, String email, String password, String phone ,String role ){
        super(id,name,email,password,phone);
        this.role = role ;
    }
    public String getrole(){
        return role ;
    }
    public void setcompanyName(String role ){
        this.role = role ;
    }
}
