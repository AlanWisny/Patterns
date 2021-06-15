package com.company.Interface;

import com.company.Service.AbstractFactory;
import com.company.Service.SalarisBerekening;
import com.company.Service.Singleton;

public class Factory implements AbstractFactory {
    private static Factory Object;

    public Factory() {
    }

//    public static Singleton singleton() {
//        if (Singleton.object() == null) {
//            setObject(new Factory());
//        }
//        return Singleton.object();
//    }

    @Override
    public void berekening(int bedrag, int uur) {
        SalarisBerekening U = new UurloonBerekening (bedrag,uur);
        PersoneelsLid P = new PersoneelsLidImpl(U);
        System.out.println(P.salaris());
//        SalarisBerekening   M = new MaandloonBerekening(bedrag);
//        PersoneelsLid       Q = new PersoneelsLidImpl (M);
//        System.out.println(Q.salaris());
//        Q.opslag(500);
    }

    public void show(){
        System.out.println("Objecten zijn aangemaakt");
    }
}
