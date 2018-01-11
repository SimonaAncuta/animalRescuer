package org.fasttrackit;

public class Animal {

    public static String controlType = "Animal";
    private String name;
    private double age;
    private String healthCondition;
    private String color;
    private String breed;
    String favoriteFoodName;
    String favoriteActivityName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(String healthCondition) {
        this.healthCondition = healthCondition;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Boolean getFemale() {
        return female;
    }

    public void setFemale(Boolean female) {
        this.female = female;
    }

    public Boolean getMetish() {
        return metish;
    }

    public void setMetish(Boolean metish) {
        this.metish = metish;
    }

    private Boolean female;
    private Boolean metish;

}