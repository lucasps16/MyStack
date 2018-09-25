/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

import java.util.Iterator;

/**
 *
 * @author Estudiante
 */
public class Lists {

    
    public static void main(String[] args) {
        
//        MyArrayList<String> myArray = new MyArrayList<String>();
//        
//        myArray.add(0,"Pos 0");
//        myArray.add(1,"Pos 1");
//        myArray.add(2,"Pos 2");
//        myArray.add(3,"Pos 3");
//        myArray.add(4,"Pos 4");
//        myArray.add(5,"Pos 5");
//        myArray.add(6,"Pos 6");
//        myArray.add(7,"Pos 7");
//        myArray.add(8,"Pos 8");
//        myArray.add(9,"Pos 9");
//        System.out.println(myArray.size);
//        
//        myArray.add(10,"pos 10");
//        myArray.add(2,"Nuevo dato");
//        
//        System.out.println(myArray.size);
//        for(Iterator<String> iterator = myArray.iterator(); iterator.hasNext();){
//            String elemento =  iterator.next();
//            
//            System.out.println(elemento);
//        }
//        
        


        MyStack<Integer> myStack = new MyStack<Integer>();
        
        myStack.push(1);
        myStack.push(3);
        myStack.push(6);
        myStack.push(8);
        
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        
        System.out.println(myStack.top());
    }
    
}
