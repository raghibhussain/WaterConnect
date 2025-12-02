package com.example.demo.model;
class tanker {
    private long id ;
    private double capacity ;
    private double price ;
    private String type ;
    private boolean avalible ;
    tanker(long id,double capacity ,double price ,String type ,boolean avalible){
        this.id = id ;
        this.capacity = capacity ;
        this.price = price ;
        this.type = type ;
        this.avalible = avalible  ;
        }
        
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getavailable() {
        return avalible;
    }

    public void setAvailable(boolean avalible) {
        this.avalible = avalible;
    }
}
class booking {
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
