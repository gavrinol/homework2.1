package com.company;

public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int witchery, int apparition, int hardWork, int loyalty, int honesty) {
        super(name, witchery, apparition);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int ability(){
        return honesty + hardWork + loyalty;
    }

    public void compareHufflepuff(Hufflepuff student){
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
        return "Пуфендуец: " +
                super.toString() +
                " Трудолюбие " + hardWork +
                ", Верность " + loyalty +
                ", Честность " + honesty;
    }
}
