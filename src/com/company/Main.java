package com.company;

import com.company.Domein.SalarisSysteem;
import com.company.Interface.Factory;
import com.company.Interface.MaandloonBerekening;
import com.company.Service.AbstractFactory;
import com.company.Service.Singleton;

public class Main {

    public static void main(String[] args) {
        AbstractFactory F = new Factory();
//        Singleton F1 = Singleton.object();
        SalarisSysteem S1 = new SalarisSysteem(F);
        MaandloonBerekening m = new MaandloonBerekening(100, S1);

        m.toon();
        m.update();
        m.verhoog(500);
        m.toon();

//        S1.berekening(1000, 20);

    }
}
