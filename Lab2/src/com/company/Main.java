package com.company;

import com.company.LinkedList.LinkedList;

public class Main {
    public static void main(String[] args) {

        //ArrayList
        System.out.println("\n====================\n" +
                           "Array list!\n" +
                           "====================");
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hello");
        arr.add(", ");
        arr.add("world");
        System.out.println("\nSize of array list : " + arr.size());
        arr.add("!");
        System.out.println("\nItems: ");
        for (var item :
                arr) {
            System.out.print(item);
        }

        System.out.println("\n\nIs list contains \"!\"?" + arr.contains("!"));
        arr.remove(3);
        System.out.println("Removing.... \n" +
                            "And now? : " + arr.contains("!"));

        //===============================================
        //LinkedList
        System.out.println("\n\n==================== \n" +
                           "Linked list!\n" +
                           "====================");
        LinkedList<Double> linkedList = new LinkedList<>();
        linkedList.add(550.2);
        linkedList.add(120.1);
        linkedList.add(1200.95);
        System.out.println("\nSize of linked list : " + linkedList.size());
        linkedList.add(5.5);
        System.out.println("\nItems: ");
        for (var item :
                linkedList) {
            System.out.println(item);
        }
        System.out.println("\nIs list contains 120.1? : " + linkedList.contains(120.1));
        linkedList.remove(120.1);
        System.out.println("Removing.... \n" +
                "And now? : " + linkedList.contains(120.1));
    }
}
