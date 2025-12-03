package com.example.demo.model;

class  booking {
    private long id ;
    private consumer Consumer ;
    private tanker Tanker ;
    private String  bookingTime ;
    private String status ;
    booking (long id ,consumer Consumer ,tanker Tanker, String  bookingTime, String status ){
    this.id = id ;
    this.Consumer = Consumer ;
    this.Tanker = Tanker ;
    this.bookingTime = bookingTime ;
    this.status = status ;
    }
    public long getid(){
        return id ;
    }
    public void setid(long id){
        this.id = id ;
    }
    public  consumer getconsumer(){
        return Consumer ;
    }
    public void setconsumer(consumer Consumer){
        this.Consumer = Consumer ;
    }
    public tanker gettanker(){
        return Tanker ;
    }
    public void settanker (tanker Tanker){
        this.Tanker = Tanker ;
    }
    public String getbookingTime (){
        return bookingTime ;
    }
    public void setbookingTime (String bookingTime ){
        this.bookingTime = bookingTime ;
    }
    public String getstatus(String status){
        return status ;
    }
}
