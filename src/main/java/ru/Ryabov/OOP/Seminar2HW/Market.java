package ru.Ryabov.OOP.Seminar2HW;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {

    private final List<Actor> queue;

    public Market() {
        this.queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " вошел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor: actors) {
            System.out.println(actor.getName()+" вышел из магазина");
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrder();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println("Покупатель " + actor.getName() + " встал в очередь");
        this.queue.add(actor);

    }

    @Override
    public void takeOrder() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " сделал заказ.");

            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (actor.setMakeOrder(true) && !actor.isTakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил свой заказ.");
            }
        }

    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.setTakeOrder(true)) {
                releaseActors.add(actor);
                System.out.println(actor.getName() + " вышел из очереди.");
            }
        }
        releaseFromMarket(releaseActors);
    }
}
