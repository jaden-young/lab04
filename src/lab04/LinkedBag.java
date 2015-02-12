/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab04;

/**
 *
 * @author jaden.young
 */
public class LinkedBag<T> implements Bag<T>{

    // Nested node class
    private static class Node<T> {
        private T element;
        private Node<T> next;
        public Node( T newElement, Node <T> newNext) {
            element = newElement;
            next = newNext;
        }
        
        // ----- Accessor Methods -------
        public T getElement() {
            return element;
        }
        
        public Node<T> getNext() {
            return next;
        }
        
        // ----- Mutator Methods ------
        public void setElement(T newElement) {
            element = newElement;
        }
        
        public void setNext(Node<T> newNext) {
            next = newNext;
        }
    }
    
    private Node<T> bagHead;
    private Node<T> bagTail;
    private int count;
    
    public LinkedBag(){
        // empty list
    }
    
     @Override
    public int getCurrentSize() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public boolean isFull() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(T newElement) {
        bagHead = new Node<>(newElement, bagHead);
        if(isEmpty())
            bagTail = bagHead;
        count++;
        return true;
    }

    @Override
    public T remove() {
        if(isEmpty())
            return null;
        T temp = bagHead.getElement();
        bagHead = bagHead.getNext();
        count--;
        if(isEmpty())
            bagTail = null;
        return temp;
    }

    @Override
    public boolean remove(T item) {
        for(int i = 0; i < count; i++) {
            if()
        }
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getFrequencyOf(Object item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(Object item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
