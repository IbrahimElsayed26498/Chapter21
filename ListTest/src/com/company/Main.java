// In the name of Allah, the Gracious, the Merciful
package com.company;

import com.company.dietel.dataStructure.EmptyListException;
import com.company.dietel.dataStructure.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new List<>();

        // insert integers in list
        list.insertAtFront(-1);
        list.print();
        list.insertAtFront(0);
        list.print();
        list.insertAtBack(1);
        list.print();
        list.insertAtBack(5);
        list.print();

        // remove item from list; print after each removal
        try{
            int removedItem = list.removeFromFront();
            System.out.printf("%n%d removed%n", removedItem);
            list.print();

            removedItem = list.removeFromFront();
            System.out.printf("%n%d removed%n", removedItem);
            list.print();

            removedItem = list.removeFromBack();
            System.out.printf("%n%d removed%n", removedItem);
            list.print();

            removedItem = list.removeFromBack();
            System.out.printf("%n%d removed%n", removedItem);
            list.print();
        }
        catch (EmptyListException emptyListException){
            emptyListException.printStackTrace();
        }
    }
}
