package collections;

import java.util.*;

public class LinkedLists {

    public static void main(String[] args) {
        LinkedList<Persona> linkedList = new LinkedList<>();
        linkedList.add(new Persona(1, "Gambito", 35));
        linkedList.add(new Persona(2, "Frodo", 45));
        linkedList.add(new Persona(3, "Hulk", 75));
        linkedList.add(new Persona(4, "Thor", 55));

        //Collections.sort(linkedList);
        linkedList.sort(null);
        System.out.println("======Printing Ordered List========");
        linkedList.forEach(System.out::println);
        System.out.println("===================================");

        //Add a new one at the beginning
        linkedList.add(0, new Persona(5, "Saul", 40));
        linkedList.addLast(new Persona(15, "Aquaman", 80));
        System.out.println("Peek First: "+linkedList.peekFirst().getName());

        //replace an element at a specified position
        linkedList.set(2, new Persona(12, "Gabo", 100));

        //Poll: Retrieves and Remove the head (first element) of the list
        linkedList.poll();


        List<String> listToSort = new LinkedList<>(Arrays.asList("Gambito",
                "Frodo","Hulk","Thor"));

        listToSort.sort(Comparator.naturalOrder());

        for (Persona per:linkedList) {
            System.out.println("Prueba: " +per.getName());
        }

        System.out.println("Ordered List" );
        listToSort.forEach(System.out::println);
    }
}
