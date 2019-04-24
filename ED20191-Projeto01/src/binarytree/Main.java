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
public class Main {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.add('f');
        bt.add('d');
        bt.add('h');
        bt.add('c');
        bt.add('e');
        bt.add('g');
        bt.add('i');

        bt.printTreeInOrder();

        bt.delete('g');
        
        bt.printTreeInOrder();

    }

}
