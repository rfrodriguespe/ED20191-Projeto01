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

    public void add(char value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node n, char value) {
        if (n == null) {
            return new Node(value);
        }

        if (value < n.getValue()) {
            n.setLeft(addRecursive(n.getLeft(), value));
        } else if (value > n.getValue()) {
            n.setRight(addRecursive(n.getRight(), value));
        } else {
            // value already exists
            return n;
        }

        return n;
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

    private void printTreePreOrder(Node n) {
        if (n != null) {
            System.out.print(" " + n.getValue());
            printTreePreOrder(n.getLeft());
            printTreePreOrder(n.getRight());
        }
    }

    public void printTreePostOrder() {
        printTreePostOrder(this.root);
        System.out.println("");
    }

    private void printTreePostOrder(Node n) {
        if (n != null) {
            printTreePostOrder(n.getLeft());
            printTreePostOrder(n.getRight());
            System.out.print(" " + n.getValue());
        }
    }

    private char findSmallestValue(Node root) {
        return root.getLeft() == null ? root.getValue() : findSmallestValue(root.getLeft());
    }

    public void delete(char value) {
        this.root = deleteRecursive(this.root, value);
    }

    private Node deleteRecursive(Node n, char value) {
        if (n == null) {
            System.out.println("Arvore Vazia");
            return null;
        }

        if (value == n.getValue()) {
            if (n.getLeft() == null && n.getRight() == null) {
                return null;
            }
            if (n.getRight() == null) {
                return n.getLeft();
            }

            if (n.getLeft() == null) {
                return n.getRight();
            }
            //
            char smallestValue = findSmallestValue(n.getRight());
            n.setValue(smallestValue);
            n.setRight(deleteRecursive(n.getRight(), smallestValue));
            return n;
            //
        }
        if (value < n.getValue()) {
            n.setLeft(deleteRecursive(n.getLeft(), value));
            return n;
        }
        n.setRight(deleteRecursive(n.getRight(), value));
        return n;
    }

}
