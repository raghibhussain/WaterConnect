package com.example.demo.model;

class payment {
    private long id ;
    private booking Booking ;
    private double amount ;
    private String method ;
    private String status ;
    
    payment(long id, booking Booking ,double amount, String method, String status ){ ;
        this.id = id ;
        this.Booking = Booking;
        this.amount = amount ;
        this.method = method ;
        this.status = status ;

    }
    public long getid(){
        return id ;
    }
    public void setid(long id){
        this.id = id ;
    }
    public booking getbooking (){
        return Booking ;
    }
    public void setbooking(booking Booking ){
        this.Booking = Booking;
    }
    public double getamount(){
        return amount ;
    }
    public void setamount (double amount ){
        this.amount = amount ;
    }
    public String getmethod(){
        return method ;
    }
    public void setmethod(String method){
        this.method = method ;
    }
    public String getstatus(){
        return status ;
    }
    public void setstatus(String status){
        this.status = status ;
    }

}

