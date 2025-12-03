package com.example.demo.model;
class supplier extends User{
    private String companyName ;
    private int VehicalNumber ;
    supplier (Long id, String name, String email, String password, String phone, String companyName,int VehicalNumber){
        super(id,name,email,password,phone);
        this.companyName = companyName ;
        this.VehicalNumber = VehicalNumber ;
    }

    public String getcompanyName(){
        return companyName ;
    }
    public void setcompanyName(String companyName){
        this.companyName = companyName ;
    }
    public int getvehicalNumber(){
        return VehicalNumber ;
    }
    public void setvehicalNumber(int VehicalNumber){
        this.VehicalNumber = VehicalNumber ;
    }
}