package com.company.dietel.dataStructure;

public class StackInheritance<T> extends List<T> {
    public StackInheritance(){
        super("Stack");
    }

    // add object to stack
    public void push(T object){
        insertAtFront(object);
    }

    // remove object from stack
    public T pop() throws EmptyListException{
        return removeFromFront();
    }
}
