// in the name of Allah, the Gracious, the Merciful
package com.company;

import com.company.dietel.dataStructure.Tree;
import com.company.dietel.dataStructure.EmptyListException;

import java.security.SecureRandom;

public class Main {

    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<Integer>();
        SecureRandom randomNumber = new SecureRandom();
        System.out.println("Inserting the following values:");

        // insert 10 random integers from 0-99 in tree
        for(int i = 1; i <= 10; i++){
            int value = randomNumber.nextInt(100);
            System.out.printf("%d ", value);
            tree.insertNode(value);
        }

        System.out.printf("%n%nPerorder traversal%n");
        tree.preorderTraversal();

        System.out.printf("%n%nInorder traversal%n");
        tree.inorderTraversal();

        System.out.printf("%n%npostorder traversal%n");
        tree.postorderTraversal();
        System.out.println();
    }
}
