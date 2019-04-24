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
public interface BinaryTreeInterface {
    
    public void addNode (char value);
    
    public Node removeNode (char value);
    
    public Node searchNode (char value);
    
    public void printTree();
    
}
