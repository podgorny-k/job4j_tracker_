package ru.job4j.tracker;

public class StartUI {

    public static void main(String[] args) {
        Item item = new Item();
        System.out.println(item.getCreated());

        Tracker tracker = new Tracker();
        tracker.add(item);
        System.out.println(tracker.findById(1));

        Item item2 = new Item();
        System.out.println(item2);
    }
}