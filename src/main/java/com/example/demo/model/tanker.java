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
