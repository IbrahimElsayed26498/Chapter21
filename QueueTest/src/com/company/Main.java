// in the name of Allah, the Gracious, the Merciful
package com.company;
import com.company.dietel.dataStructure.EmptyListException;

public class Main {

    public static void main(String[] args) {
	    Queue<Integer> queue = new Queue<>();

	    // use enqueue method
        queue.enqueue(-1);
        queue.print();
        queue.enqueue(0);
        queue.print();
        queue.enqueue(1);
        queue.print();
        queue.enqueue(5);
        queue.print();

        try{
            int removedItem;

            while (true){
                removedItem = queue.dequeue();
                System.out.printf("%n%d dequeued%n", removedItem);
                queue.print();
            }
        }catch (EmptyListException emptyListException){
            emptyListException.printStackTrace();
        }
    }
}
