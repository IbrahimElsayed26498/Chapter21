// in the name of Allah, the Gracious, the Merciful
package com.company;
import com.company.dietel.dataStructure.*;
public class Queue <T>{
    private List<T> queueList;

    public Queue(){
        queueList = new List<>("queue");
    }

    // add object to queue
    public void enqueue(T object){
        queueList.insertAtBack(object);
    }

    // remove object from queue
    public T dequeue() throws EmptyListException{
        return queueList.removeFromFront();
    }

    // determine if queue is empty
    public boolean isEmpty(){
        return queueList.isEmpty();
    }

    // output queue content
    public void print(){
        queueList.print();
    }
}
