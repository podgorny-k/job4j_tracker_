package ru.job4j.tracker;

public class ReplaceAction implements UserAction {

    @Override
    public String name() {
        return "=== Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id:");
        String name = input.askStr("Enter name: ");
        Item newItem = new Item(id, name);
        if (tracker.replace(id, newItem)) {
            System.out.println("Success!");
        } else {
            System.out.println("Wrong!");
        }
        return true;
    }
}