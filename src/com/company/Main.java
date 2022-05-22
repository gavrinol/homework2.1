package com.company;

public class Main {

    public static void main(String[] args) {
        Hogwarts pad = new Hogwarts("jnjn", 3,4);
        Hogwarts[] hogwarts = {
                new Hogwarts("Гарри Поттер", 7, 6),
                new Hogwarts("Гермиона Грейнджер", 10, 9),
                new Hogwarts("Рон Уизли", 6, 5),
                new Hogwarts("Драко Малфой", 6, 7),
                new Hogwarts("Грэхэм Монтегю", 5, 8),
                new Hogwarts("Грегори Гойл", 5, 3),
                new Hogwarts("Захария Смит", 6, 6),
                new Hogwarts("Седрик Диггори", 8,9),
                new Hogwarts("Джастин Финч-Флетчли", 7, 7),
                new Hogwarts("Чжоу Чанг", 8, 8),
                new Hogwarts("Падма Патил", 7, 5),
                new Hogwarts("Маркус Белби", 6,6)
        };
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", 7, 6, 7, 8, 10),
                new Gryffindor("Гермиона Грейнджер", 10, 9, 6, 6,8),
                new Gryffindor("Рон Уизли", 6, 5, 5, 8, 9),
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 6, 6, 4, 8,7),
                new Hufflepuff("Седрик Диггори", 8,9, 9,5,8),
                new Hufflepuff("Джастин Финч-Флетчли", 7, 7,3,9,5),
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 6, 7,8,6,9,8),
                new Slytherin("Грэхэм Монтегю", 5, 8,6,7,5,10),
                new Slytherin("Грегори Гойл", 5, 3, 4,8,6,7),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 8, 8, 6,8,7),
                new Ravenclaw("Падма Патил", 7, 5,8,6,9),
                new Ravenclaw("Маркус Белби", 6,6,4,8,8)
        };

        hogwarts[5].print();
        gryffindors[0].print();
        slytherins[1].print();
        hufflepuffs[2].print();
        ravenclaws[0].print();
        slytherins[0].ability();
        hogwarts[0].compareHogwarts(slytherins[0]);
        gryffindors[0].compareGryffindor(gryffindors[2]);
        slytherins[1].compareSlytherin(slytherins[0]);
    }
}
