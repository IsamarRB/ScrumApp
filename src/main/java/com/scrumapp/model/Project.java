package com.scrumapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Project")

public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column (name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    public int getId(){
        return id;
    }
    public void setId (int id){
        this.id = id;
    }

    public  String getName(){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }

}
