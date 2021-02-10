package ru.job4j.tracker;

public class ReplaceAction implements UserAction {

    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit item ====");
        int id = input.askInt("Enter id:");
        String name = input.askStr("Enter name: ");
        Item newItem = new Item(id, name);
        if (tracker.replace(id, newItem)) {
            out.println("Success!");
        } else {
            out.println("Wrong!");
        }
        return true;
    }
}