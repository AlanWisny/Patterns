package com.company.Service;

public abstract class Singleton {
    private static Singleton Object = null;

    protected Singleton() {
    }

    public static Singleton object() {
        return Object;
    }

    protected static void setObject(Singleton s) {
        Object = s;
    }

    public void show(){
        System.out.println("Singleton object made and called.");
    }
}
