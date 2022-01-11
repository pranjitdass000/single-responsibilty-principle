package com.stackroute.entity;

public class Length {
    private int length;

    public Length() {
    }

    public Length(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Length{" +
                "length=" + length +
                '}';
    }
}
