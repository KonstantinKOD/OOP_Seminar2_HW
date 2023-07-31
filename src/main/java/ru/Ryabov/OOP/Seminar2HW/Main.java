package ru.Ryabov.OOP.Seminar2HW;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Kostya");
        Human human2 = new Human("Vasya");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();


    }
}