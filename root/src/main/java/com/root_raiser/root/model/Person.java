package com.root_raiser.root.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

@Entity
public abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
