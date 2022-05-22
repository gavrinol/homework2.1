package com.company;

public class Hogwarts {
    private String name;
    private int witchery;
    private int apparition;

    public Hogwarts(String name, int witchery, int apparition) {
        this.name = name;
        this.witchery = witchery;
        this.apparition = apparition;
    }

    public String getName() {
        return name;
    }

    public int getWitchery() {
        return witchery;
    }

    public int getApparition() {
        return apparition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWitchery(int witchery) {
        this.witchery = witchery;
    }

    public void setApparition(int apparition) {
        this.apparition = apparition;
    }
    public void print(){
        System.out.println(this);
    }

    public int ability(){
        return  witchery + apparition;
    }
    public void compareHogwarts(Hogwarts student){
        int abilityFirstStudent = ability();
        int abilitySecondStudent = student.ability();
        if (abilityFirstStudent > abilitySecondStudent){
            System.out.println("Студент " + getName() + " обладает большей мощностью магии " + student.getName());
        }else if (abilityFirstStudent < abilitySecondStudent){
            System.out.println("Студент " + getName() + " обладает меньшей мощностью магии " + student.getName());
        }else {
            System.out.println("Студенты одинаковы");
        }
    }

    @Override
    public String toString() {
        return"Имя '" + name + '\'' +
                ", колдовство " + witchery +
                ", трансгрессия " + apparition;
    }
}
