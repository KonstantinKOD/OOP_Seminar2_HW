package ru.Ryabov.OOP.Seminar2HW;

public class Human extends Actor{
    public Human(String name){
        super(name);
    }

    @Override
    public boolean setMakeOrder(boolean setMakeOrder) {

        return setMakeOrder;
    }

    @Override
    public boolean setTakeOrder(boolean setTakeOrder) {

        return setTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return false;
    }

    @Override
    public boolean isTakeOrder() {
        return false;
    }
    @Override
    String getName() {
        return super.getName();
    }
}
