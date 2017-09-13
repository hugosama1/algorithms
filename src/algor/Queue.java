/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algor;

/**
 *
 * @author hugo
 */
public class Queue {
    private int index;
    private Object[] array;
    
    public Queue() {
        this.index = -1;
        this.array = new Object[10];
    }
    
    public void enqueue( Object obj) {
        if( index + 1 == array.length) throw new IllegalStateException("QUEUE WAS FULL");
        index++;
        array[index] = obj;
    }
    
    public Object dequeue() {
        if( isEmpty() ) throw new IllegalStateException("QUEUE WAS EMPTY");
        Object obj = array[0];
        index--;
        if( !isEmpty()) {
            System.arraycopy(array,1,array,0, index + 1);
        }
        return obj;
    } 
    
    public boolean isEmpty() {
        return index < 0;
    }
    
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue("ONE");
        queue.enqueue("ONE");
        queue.enqueue("ONE");
        queue.enqueue("ONE");
        queue.enqueue("ONE");
        queue.enqueue("ONE");
        queue.enqueue("ONE");
        queue.enqueue("ONE");
        queue.enqueue("ONE");
        queue.enqueue("ONE");
        queue.enqueue("ONE");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
    
}
