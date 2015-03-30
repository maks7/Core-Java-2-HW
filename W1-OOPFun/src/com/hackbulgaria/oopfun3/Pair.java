package com.hackbulgaria.oopfun3;

public final class Pair {

    Object objFirst;
    Object objSecond;

    public void setFirst(Object obj) {
        this.objFirst = obj;
    }

    public Object getFirst() {
        return this.objFirst;
    }

    public void setSecond(Object obj) {
        this.objSecond = obj;
    }

    public Object getSecond() {
        return this.objSecond;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }

        final Pair other = (Pair) obj;

        if (this.objFirst == null) {
            if (other.objFirst != null) {
                return false;
            }

        } else if (!this.objFirst.equals(other.objFirst)) {
            return false;
        }

        if (this.objSecond == null) {
            if (other.objSecond != null) {
                return false;
            }
        } else if (!this.objSecond.equals(other.objSecond)) {
            return false;
        }

        return true;
    };

    @Override
    public String toString() {
        return "Class Pair: Object 1: " + objFirst.toString() + ", Object 2: " + objSecond.toString();
    }
}
