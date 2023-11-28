package us.kvitko.catfactoryapp.model.entity;

public class Animal {

    private int age;
    private double weight;
    private Color color;
    private long id;
    private static long counter = 0;

    public Animal(int age, double weight, Color color) {
        counter++;
        id = counter;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public Animal() {
        counter++;
        id = counter;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cat {"  +
                "age=" + age +
                ", weight=" + weight +
                ", color=" + color +
                ", id=" + id +
                '}';
    }
}
