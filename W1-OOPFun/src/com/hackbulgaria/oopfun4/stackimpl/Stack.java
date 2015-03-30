package com.hackbulgaria.oopfun4.stackimpl;

interface Stack {
    public void push (Object obj);
    public Object peek();
    public Object pop ();
    public void clear ();
    public boolean isEmpty();
    public int length();
    public int search(Object o);
}
