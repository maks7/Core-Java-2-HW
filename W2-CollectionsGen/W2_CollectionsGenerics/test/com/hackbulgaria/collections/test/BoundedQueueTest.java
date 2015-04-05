package com.hackbulgaria.collections.test;

import static org.junit.Assert.*;

//import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.task3.boundedqueue.BoundedQueue;

public class BoundedQueueTest {
    
//    @Before
//    public void before() {
//        
//    }
    
    @Test
    public void test_head_Integer() {
        
        BoundedQueue<Integer> bqu = new BoundedQueue<>(3);
        
        bqu.offer(1);
        bqu.offer(2);
        bqu.offer(3);
        bqu.offer(4);
        bqu.offer(5);
        System.out.println(bqu.toString()); //3,4,5
        
        BoundedQueue<Integer> llexpected = new BoundedQueue<>(3);
        llexpected.offer(3);
        llexpected.offer(4);
        llexpected.offer(5);
        System.out.println(llexpected.toString()); 
        
        assertEquals(new Integer(3), bqu.peek());
    }
    
    @Test
    public void test_head_String() {
        
        BoundedQueue<String> bqu = new BoundedQueue<String>(4);
        
        bqu.offer("Hello");
        bqu.offer("World!");
        bqu.offer("Test");
        bqu.offer("case");
        bqu.offer("method!");
        System.out.println(bqu.toString());
        
        assertEquals(new String("World!"), bqu.peek());
    }
    
    @Test
    public void test_size_Integer() {
        
        BoundedQueue<Integer> bqu = new BoundedQueue<>(3);
        
        bqu.offer(1);
        bqu.offer(2);
        bqu.offer(3);
        bqu.offer(4);
        bqu.offer(5);
        System.out.println(bqu.toString());
              
        assertEquals(3, bqu.size());
    }
}
