// In the name of Allah, the Gracious, the Merciful
package com.company.dietel.dataStructure;

class TreeNode<T extends Comparable<T>>{
    // package access member
    TreeNode<T> leftNode;
    T data; // node value
    TreeNode<T> rightNode;

    // constructor initializes data and makes this a leaf node
    public TreeNode(T nodeData){
        data = nodeData;
        leftNode = rightNode = null;
    }

    // locate insertion point and insert new node; ignore dublicate values
    public void insert(T insertValue){
        // insert in left subtree
        if(insertValue.compareTo(data) < 0){
            // insert new TreeNode
            if(leftNode == null)
                leftNode = new TreeNode<T>(insertValue);
            else
                leftNode.insert(insertValue);
        }

        // insert in right subtree
        else if (insertValue.compareTo(data) > 0){
            // insert new treeNode
            if(rightNode == null)
                rightNode = new TreeNode<T>(insertValue);
            else // continue traversing right subtree
                rightNode.insert(insertValue);
        }
    }
}
public class Tree <T extends Comparable<T>>{
    private TreeNode<T> root;

    // constructor initializes an empty tree of integers
    public Tree(){
        root = null;
    }

    // insert a new node in the binary search tree
    public void insertNode(T insertValue){
        if(root == null)
            root = new TreeNode<T>(insertValue);
        else
            root.insert(insertValue);
    }

    // begin preorder traversal
    public void preorderTraversal(){
        preorderHelper(root);
    }

    // recursive method to perform preorder traversal
    private void preorderHelper(TreeNode<T> node){
        if(node == null)
            return;

        System.out.printf("%s " , node.data);
        preorderHelper(node.leftNode);
        preorderHelper(node.rightNode);
    }

    // begin inorder traversl
    public void inorderTraversal(){
        inorderHelper(root);
    }

    // recursive method to perform inorder traversal
    private void inorderHelper(TreeNode<T> node){
        if(node == null)
            return;

        inorderHelper(node.leftNode);
        System.out.printf("%s ", node.data);
        inorderHelper(node.rightNode);
    }

    // begin postorder traversal
    public void postorderTraversal(){
        postorderHelper(root);
    }
    // recursive method to perform postorder traversal
    private void postorderHelper(TreeNode<T> node){

        if (node == null)
            return;

        postorderHelper(node.leftNode);
        postorderHelper(node.rightNode);
        System.out.printf("%s ", node.data);
    }
}
