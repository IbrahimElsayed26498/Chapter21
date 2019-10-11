// In the name of Allah, the Gracious, the Merciful
package com.company;
import com.company.dietel.dataStructure.StackInheritance;
import com.company.dietel.dataStructure.EmptyListException;
public class Main {

    public static void main(String[] args) {
	    StackInheritance<Integer> stack = new StackInheritance<>();

	    // use push method
        stack.push(-1);
        stack.print();
        stack.push(0);
        stack.print();
        stack.push(1);
        stack.print();
        stack.push(5);
        stack.print();

        // remove item from stack
        try{
            int removedItem;

            while (true){
                removedItem = stack.pop();
                System.out.printf("%n%d popped%n", removedItem);
                stack.print();
            }
        }catch (EmptyListException emptyListException){
            emptyListException.printStackTrace();
        }
    }
}
