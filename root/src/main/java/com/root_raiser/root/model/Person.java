package com.root_raiser.root.model;

public abstract class Person {
    private int id;
    private String name;
    private String password;
    private boolean isFarmer;

    public Person(String nm, String password, boolean isFarmer){
        this.id = 0; //get id from database
        this.name=nm;
        this.password=password;
        this.isFarmer=isFarmer;
    }

    public int getId() {return this.id;}

    public String getName(){
        return this.name;
    }

    public String getPassword(){
        return this.password;
    }

    public boolean isFarmer(){
        return this.isFarmer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOccupation(boolean occupation) {
        this.isFarmer = occupation;
    }

    public boolean equals(String name) {
        return this.name == name;
    }

}
