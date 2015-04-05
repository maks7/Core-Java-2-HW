package com.hackbulgaria.task3.boundedqueue;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BoundedQueue<E> implements Queue<E> {
    
    private int size = 0;
    private LinkedList<E> bq = new LinkedList<>();;
    
    public BoundedQueue(int size) {
        this.size = size;
    }
    
    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (this.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        Object[] arrObj = new Object[size];
        for (int i = 0; i < size; i++) {
            arrObj[i] = bq.get(i);
        }
        return arrObj;
    }

    @Override
    public <E> E[] toArray(E[] a) {
       // Object[] arrObj = new Object[size];
        for (int i = 0; i < size; i++) {
            a[i] = (E)bq.get(i);
        }
        return a;
    }

    @Override
    public boolean remove(Object o) {
        return bq.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        bq.clear();
    }

    @Override
    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean offer(E e) {
        
        if (e != null) {
            if (bq.size() < size) {
                bq.add(e);
            } else {
                bq.add(e);
                E el = bq.remove();
            }
            return true;
        }
        return false;
    }

    @Override
    public E remove() {
        E el = bq.remove();
        return el;
    }

    @Override
    public E poll() {
        E el = bq.poll();
        return el;
    }

    @Override
    public E element() {
        throw new UnsupportedOperationException();
    }

    @Override
    public E peek() {
        E el = bq.peek();
        return el;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < bq.size(); i++) {
            if (i < bq.size() - 1) { 
                sb.append(bq.get(i).toString()).append(", ");
            } else {
                sb.append(bq.get(i).toString());
            }
        }
        return sb.toString();
    }
    
}
