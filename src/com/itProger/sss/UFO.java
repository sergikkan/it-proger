package com.itProger.sss;

public class UFO implements HumanInterface {
    private int age;
    private Personality person;

    UFO(int age, Personality person){
        this.age=age;
        this.person=person;
    }
    @Override
    public void talk() {
        System.out.println("Привет, я инопланетное существо");
        System.out.println("Персона: " +this.person);
    }

    @Override
    public void wallk() {
        System.out.println("Привет, я инопланетное существо и я могу ходить");
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
