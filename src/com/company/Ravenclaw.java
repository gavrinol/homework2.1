package com.company;

public class Ravenclaw extends Hogwarts {
    private int wisdom;
    private int ingenuity;
    private int creative;

    public Ravenclaw(String name, int witchery, int apparition, int wisdom, int ingenuity, int creative) {
        super(name, witchery, apparition);
        this.creative = creative;
        this.ingenuity = ingenuity;
        this.wisdom = wisdom;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    public int ability(){
        return wisdom + ingenuity + creative;
    }

    public void compareRavenclaw(Ravenclaw student){
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
        return "Когтевранец: " +
                super.toString() +
                " Мудрость" + wisdom +
                ", Остроумие " + ingenuity +
                ", Творчество " + creative;
    }
}
