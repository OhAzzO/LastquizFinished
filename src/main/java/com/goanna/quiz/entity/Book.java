package com.goanna.quiz.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
	
    String name;
    int id;

    public Book( @JsonProperty("id") int id, @JsonProperty("name") String name ) {
        
        this.name = name;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}