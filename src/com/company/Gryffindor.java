package com.company;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honour;
    private int bravery;


    public Gryffindor(String name, int witchery, int apparition, int nobility, int honour, int bravery) {
        super(name, witchery, apparition);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }


    public int ability(){
        return nobility + honour + bravery;
    }

    public void compareGryffindor(Gryffindor student){
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
        return "Гриффиндорец: " +
                super.toString() +
                " благородство " + nobility +
                ", честь " + honour +
                ", смелость " + bravery;
    }
}
