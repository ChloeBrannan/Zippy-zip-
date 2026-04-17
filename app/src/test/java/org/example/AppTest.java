package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class AppTest {

    @Test
    public void testZipNumbersInOrder() {
        List<Integer> odds = Arrays.asList(1, 3, 5);
        List<Integer> evens = Arrays.asList(2, 4, 6);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertEquals(expected, App.zip(odds, evens));
    }

    @Test
    public void testZipUnevenLargeLists() {
        List<Integer> list1 = Arrays.asList(10, 30, 50, 70, 90, 110);
        List<Integer> list2 = Arrays.asList(20, 40, 60);
        List<Integer> expected = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 90, 110);
        assertEquals(expected, App.zip(list1, list2));
    }

    @Test
    public void testZipStringLists() {
        List<String> list1 = Arrays.asList("One", "Three", "Five");
        List<String> list2 = Arrays.asList("Two", "Four");
        List<String> expected = Arrays.asList("One", "Two", "Three", "Four", "Five");
        assertEquals(expected, App.zip(list1, list2));
    }

    @Test
    public void testZipOneEmpty() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> empty = new ArrayList<>();
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, App.zip(list1, empty));
    }
}