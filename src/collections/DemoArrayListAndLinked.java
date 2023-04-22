package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoArrayListAndLinked {

    public static void main(String[] args) {
        List<Persona> arrayList = new ArrayList<>();
        LinkedList<Persona> linkedList = new LinkedList<>();

        arrayList.add(new Persona(1, "Susan", 30));
        arrayList.add(new Persona(2, "Scarlet", 35));
        arrayList.add(new Persona(3, "Johan", 25));
        arrayList.add(new Persona(4, "Louis", 20));

        linkedList.add(new Persona(1, "Susan", 30));
        linkedList.add(new Persona(2, "Scarlet", 35));
        linkedList.add(new Persona(3, "Johan", 25));
        linkedList.add(new Persona(4, "Louis", 20));

        //Remove in ArrayList
        arrayList.remove(2);

        //Remove in LinkedList
        String nameToDelete = "Johan";
        for (Persona p: linkedList) {
            if (p.getName().equals(nameToDelete)) {
                linkedList.remove(p);
                break;
            }
        }
        System.out.println("==========================================================================================================");
        System.out.println("Printing ArrayList After Removing: "+arrayList);
        System.out.println("Printing LinkedList After Removing: "+linkedList);

        //List Size
        System.out.println("ArrayList size is: "+arrayList.size());
        System.out.println("LinkedList size is: "+linkedList.size());

        System.out.println("First and Last Object from the LinkedList");
        System.out.println("First: "+linkedList.getFirst());
        System.out.println("Last: "+linkedList.getLast());

        //Cleaning lists
        arrayList.clear();
        linkedList.clear();

        System.out.println("========PRINTING AFTER DELETING LISTS====================================================================");
        System.out.println(arrayList);
        System.out.println(linkedList);

        //Is Empty List?
        System.out.println("========LISTS ARE EMPTY?====================================================================");
        System.out.println("ArrayList: "+arrayList.isEmpty());
        System.out.println("LinkedList: "+linkedList.isEmpty());
    }

}
