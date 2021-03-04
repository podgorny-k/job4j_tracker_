package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortItemsTest {

    @Test
    public void whenSortingAscend() {
        List<Item> items = new ArrayList<>();
        Item item1 = new Item("one");
        Item item2 = new Item("two");
        Item item3 = new Item("three");
        Item item4 = new Item("four");
        Item item5 = new Item("five");
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.sort(new SortItemsAscend());

        List<Item> expect = new ArrayList<>();
        expect.add(item5);
        expect.add(item4);
        expect.add(item1);
        expect.add(item3);
        expect.add(item2);

        assertThat(items, is(expect));
    }

    @Test
    public void whenSortingDescend() {
        List<Item> items = new ArrayList<>();
        Item item1 = new Item("one");
        Item item2 = new Item("two");
        Item item3 = new Item("three");
        Item item4 = new Item("four");
        Item item5 = new Item("five");
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.sort(new SortItemsDescend());

        List<Item> expect = new ArrayList<>();
        expect.add(item2);
        expect.add(item3);
        expect.add(item1);
        expect.add(item4);
        expect.add(item5);

        assertThat(items, is(expect));
    }
}