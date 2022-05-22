package com.company;

public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int lustForPower;

    public Slytherin(String name, int witchery, int apparition, int cunning, int determination, int ambition, int lustForPower) {
        super(name, witchery, apparition);
        this.cunning = cunning;
        this.ambition = ambition;
        this.determination = determination;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public int ability(){
        return cunning + ambition + determination + lustForPower;
    }

    public void compareSlytherin(Slytherin student){
        int abilityFirstStudent = ability();
        int abilitySecondStudent = student.ability();
        if (abilityFirstStudent > abilitySecondStudent){
            System.out.println("Студент " + getName() + " лучше  студента " + student.getName());
        }else if (abilityFirstStudent < abilitySecondStudent){
            System.out.println("Студент " + getName() + " хуже студента " + student.getName());
        }else {
            System.out.println("Студенты одинаковы");
        }
    }

    @Override
    public String toString() {
        return "Слизеринец: " +
                super.toString() +
                " Хитрость " + cunning +
                ", Решительность " + determination +
                ", Амбициозность " + ambition +
                ", Жажда власти " + lustForPower;
    }
}
