package stack.Operations;

import java.util.*;  
   public class StackOperPushPopMeth {
  
   public static void main(String args[])   
{  
   //creating an object of Stack class  
   Stack <Integer> stack = new Stack<>();  
   System.out.println("stack: " + stack);  
    //pushing elements into the stack  
    pushelmnt(stack, 0);  
    pushelmnt(stack, 1);  
    pushelmnt(stack, 2);  
    pushelmnt(stack, 3);  
    pushelmnt(stack, 4);  
    pushelmnt(stack, 5);  
    pushelmnt(stack, 6);  

    popelmnt(stack);  

    popelmnt(stack);  
///throws exception 
   try   
   {  
        popelmnt(stack);  
   }   
       catch (EmptyStackException e)   
    {  
        System.out.println("empty stack");  
      }  
    }  
//performing//// operation  
   static void pushelmnt(Stack stk, int x)   
    {  
    
	   stk.push(new Integer(x));  
        System.out.println("push = " + x);  
          System.out.println("stack: " + stk);  
}  
            static void popelmnt(Stack stk)   
{  
       System.out.print("pop = ");  
         Integer x = (Integer) stk.pop();  
         System.out.println(x);  
           System.out.println("stack: " + stk);  
      }  
}  
