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






