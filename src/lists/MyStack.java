/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

import java.util.ArrayList;

public class MyStack<E> {
    
    public int size;
    private  E[] sequence = (E[]) new Object[10];
    MyArrayList<E> myStack = null;

    public MyStack() {
    
        myStack = new MyArrayList<>();
    }

    public void push(E element){
        myStack.add(0, element);
    }
    
    public E pop(){
        
        return myStack.remove(0);
    }
    
    public E top(){
        return myStack.get(0);
    }

}
