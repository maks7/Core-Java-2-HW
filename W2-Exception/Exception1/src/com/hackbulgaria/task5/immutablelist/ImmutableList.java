package com.hackbulgaria.task5.immutablelist;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import org.apache.commons.lang3.SerializationUtils;

public final class ImmutableList<E> extends ArrayList<E> {

   
    /**
     * 
     */
    private static final long serialVersionUID = -9179922429605209677L;

    public ImmutableList() {
        
    }

    public ImmutableList(Collection<? extends E> collection) {
        super(collection);
    }

    @SafeVarargs
    public final <E> List<E> asList(E... arguments) {
        List<E> arrList = new ArrayList<>();
        for (E element : arguments) {
            arrList.add(element);
        }
        return new ImmutableList<E>(arrList);
    }

    @Override
    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) SerializationUtils.clone((Serializable) super.get(index));
    }

    @Override
    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void ensureCapacity(int minCapacity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, E element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
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
    public boolean removeIf(Predicate<? super E> filter) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void replaceAll(UnaryOperator<E> operator) {
        throw new UnsupportedOperationException();
    }

}
