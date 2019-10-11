package com.company.dietel.dataStructure;

class ListNode<T>{

    T data;                // data for this node
    ListNode<T> nextNode;  // reference to the next node

    // constructor that creates a ListNode that refers to object
    ListNode(T object){
        this(object, null);
    }

    // constructorthat creates ListNode that refers to the specified
    // object and to the next ListNode
    ListNode(T object, ListNode<T> node){
        data = object;
        nextNode = node;
    }

    // return reference to data in node
    T getData(){
        return data;
    }

    // return reference to the next node in the list
    ListNode<T> getNext(){
        return nextNode;
    }
}
public class List<T> {
    private ListNode<T> firstNode;
    private ListNode<T> lastNode;
    private String name; // string like "list" used in printing

    // constructor creates empty list
    public List(){
        this("list");
    }

    // constructor creates an empty List with a name
    public List(String listName){
        name = listName;
        firstNode = lastNode = null;
    }

    // insert item at front of List
    public void insertAtFront(T insertItem){
        if(isEmpty()){
            firstNode = lastNode = new ListNode<T>(insertItem);
        }else {
            firstNode = new ListNode<T>(insertItem, firstNode); // ibrahim : this will return a new node which next is first node
        }
    }

    public void insertAtBack(T insertItem){
        if(isEmpty()){
            firstNode = lastNode = new ListNode<T>(insertItem);
        }else{
            lastNode = lastNode.nextNode = new ListNode<T>(insertItem);
        }
    }

    // remove first node from list
    public  T removeFromFront() throws EmptyListException{
        if(isEmpty())
            throw new EmptyListException(name);
        T removedItem = firstNode.data;

        // update references firstNode and lastNode
        if (firstNode == lastNode)
            firstNode = lastNode = null;
        else
            firstNode = firstNode.nextNode;

        return removedItem;
    }

    // remocve last node from list
    public  T removeFromBack() throws EmptyListException{
        if(isEmpty())
            throw new EmptyListException(name);

        T removedItem = lastNode.data;

        // update references firstNode and lastNode
        if (firstNode == lastNode)
            firstNode = lastNode = null;
        else{
            ListNode<T> current = firstNode;

            // loop while current node does not refer to lastNode
            while (current.nextNode != lastNode)
                current = current.nextNode;

            lastNode = current;
            current.nextNode = null;
        }
        return removedItem;
    }
    // determine whether list is empty
    public boolean isEmpty(){
        return firstNode == null;
    }

    // output list contents
    public void print(){
        if(isEmpty()){
            System.out.printf("Empty %s%n", name);
            return;
        }
        System.out.printf("The %s is : ", name);
        ListNode<T> current = firstNode;

        // while not at end of list, output current node's data
        while(current != null){
            System.out.printf("%s ", current.data);
            current = current.nextNode;
        }

        System.out.println();
    }

}
