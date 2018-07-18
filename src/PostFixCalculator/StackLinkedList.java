// Author: Tyler Hickam
// Purpose: implementation of both a stack and linked list
package PostFixCalculator;

public class StackLinkedList<T> {
    
    private Node<T> top;

    public StackLinkedList( ) {
        top = null;
    }
    
    public void push(T data) {
        top = new Node<T>(data, top);
    }

    public T pop( ) {
        T data = top.data;
        top = top.next;
        return data;
    }

    public T peek( ) {
        return top.data;
    }
    
    public void clear( ) {
        top = null;
    }
    
    public boolean isEmpty( ) {
        return top == null;
    }

   public String toString() {
      if(isEmpty()) return "";

      String stackString = "";
      Node<T> tmp = top;
      while(tmp != null)
      {
         stackString += (tmp.data + " ");
         tmp = tmp.next;
      }
      
      return stackString;
   }

   private class Node<T>
   {
      public T data;
      public Node<T> next;

      public Node(T data)
      {
         this(data, null);
      }

      public Node(T data, Node<T> n)
      {
         this.data = data; next = n;
      }
   }
}