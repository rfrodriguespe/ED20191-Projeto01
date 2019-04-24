/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author rfrodrigues
 */
public class BinaryTree {

    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.getValue()) {
            current.setLeft(addRecursive(current.getLeft(), value));
        } else if (value > current.getValue()) {
            current.setRight(addRecursive(current.getRight(), value));
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.getValue()) {
            return true;
        }
        return value < current.getValue()
                ? containsNodeRecursive(current.getLeft(), value)
                : containsNodeRecursive(current.getRight(), value);
    }

    public void printTreeInOrder() {
        printTreeInOrder(this.root);
        System.out.println("");
    }

    private void printTreeInOrder(Node node) {
        if (node != null) {
            printTreeInOrder(node.getLeft());
            System.out.print(" " + node.getValue());
            printTreeInOrder(node.getRight());
        }
    }
    
    public void printTreePreOrder() {
        printTreePreOrder(this.root);
        System.out.println("");
    }

    private void printTreePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.getValue());
            printTreePreOrder(node.getLeft());
            printTreePreOrder(node.getRight());
        }
    }
    
    public void printTreePostOrder() {
        printTreePostOrder(this.root);
        System.out.println("");
    }

    private void printTreePostOrder(Node node) {
        if (node != null) {
            printTreePostOrder(node.getLeft());
            printTreePostOrder(node.getRight());
            System.out.print(" " + node.getValue());
        }
    }
}
