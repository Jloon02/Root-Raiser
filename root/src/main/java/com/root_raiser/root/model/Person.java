package com.root_raiser.root.model;

public abstract class Person {
    private String name;
    private String password;
    private boolean isFarmer;

    public Person(String nm, String password, boolean isFarmer){
        this.name=nm;
        this.password=password;
        this.isFarmer=isFarmer;
    }

    public String getName(){
        return this.name;
    }

    public String getPassword(){
        return this.password;
    }

    public boolean isFarmer(){
        return this.isFarmer;
    }

    public void setOccupation(boolean occupation) {
        this.isFarmer = occupation;
    }

}
