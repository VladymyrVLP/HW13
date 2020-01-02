package com.company;

public class Filter {

    public String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Filter(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Filter{" +
                "s='" + s + '\'' +
                '}';
    }
}
