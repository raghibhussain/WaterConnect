package com.example.demo.model;

class consumer extends User {
    private String address ;

    consumer (Long id ,String name ,String email ,String password ,String phone ,String address){
        super(id,name,email,password,phone);
        this.address = address ;
    }
    public String getaddress(){
        return address ;
    }
    public void setaddress(String address){
        this.address = address ;
    }
}