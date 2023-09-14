package com.springboot.learnspringboot;

public class Course {
//    creating the fields
    private long id;
    private String name;
    private String author;

    //    create Constructor
    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    //    create Getters
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    //    create toSring method
    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }


}
