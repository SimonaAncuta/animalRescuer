package org.fasttrackit;

public class Rescuer {
    String name;
    double money;
    Boolean professional;
    double experience;
    Boolean fast;
    double age;


    public void feed(Animal animal, DogFood food) {
        System.out.println(this.name + "just gave some" +  food.getName()+ "food to" + animal.getName());
    }

    public String feed(String Animal, String Food) {
        System.out.println(Animal);
        System.out.println(Food);


        return "Simona just gave some Purina food to Chaika";
    }


    @Override
    public String toString() {
        return "Rescuer{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", professional=" + professional +
                ", experience=" + experience +
                ", fast=" + fast +
                ", age=" + age +
                '}';
    }
}






