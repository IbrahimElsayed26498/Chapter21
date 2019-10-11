// in the name of Allah, the Gracious, the Merciful
package com.company;
import com.company.dietel.dataStructure.*;

public class StackCompostion <T> {
    private List<T> stackList;

    public StackCompostion(){
        stackList = new List<>("Stack");
    }

    // add object to stack
    public void push(T object){
        stackList.insertAtFront(object);
    }

    // remove object from stack
    public T pop() throws EmptyListException {
        return stackList.removeFromFront();
    }

    // determine if stack is empty
    public boolean isEmpty(){
        return stackList.isEmpty();
    }

    // output stack contests
    public void print(){
        stackList.print();
    }
}
