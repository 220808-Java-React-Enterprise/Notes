package main.java.com.revature.bio;

public class Cat {
    private String name;
    private int age;
    private String color;
    private int weight;


    public Cat(String name, int age, String color, int weight){
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public void climb(){
        System.out.println(name + " my cat, loves to climb on my lap and shoulders during class time!");
    }
}
