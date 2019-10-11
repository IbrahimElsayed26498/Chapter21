package com.company.dietel.dataStructure;

public class EmptyListException extends RuntimeException {
    public EmptyListException(){
        this("list");
    }

    public EmptyListException(String name){
        super(name + "is empty"); // call superclass constructor
    }
}
