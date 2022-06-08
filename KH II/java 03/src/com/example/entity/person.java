package com.example.entity;

public class person {
    private String name;
    private Integer year;
    private String place;


    //constructor -> khởi tạo oject
public person(){

}
public person ( String name){
    this.name = name; //-> là đối tượng hiện tại trong lớp person
}
    public person ( String name, Integer year){
        this.name = name;
        this.year=year;
    }
    public person ( String name, Integer year, String place){
        this.name = name;
        this.year=year;
        this.place=place;
    }
    //getter
    public String getName(){
    return name;
    }
    //setter
    public void setName () {
    this.name=name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String sayHello(){
    return "T2108A1";
    }
}
