package com.company.Interface;

import com.company.Domein.SalarisSysteem;
import com.company.Observer.Observer;
import com.company.Observer.Subject;
import com.company.Service.SalarisBerekening;

public class MaandloonBerekening implements SalarisBerekening, Observer{
    private int salaris;
    private Subject S;

    public MaandloonBerekening(int b, SalarisSysteem P) {
        salaris = b;
        S = P;
        S.insert(this);
    }

    @Override
    public int salaris() {
        return salaris;
    }

    @Override
    public void verhoog(int bedrag) {
        salaris += bedrag;
    }

    @Override
    public void toon() {
        System.out.println("Salaris van maandloon is : " + salaris());
    }

    @Override
    public void update() {
        System.out.println("Salaris is = " + String.valueOf(((SalarisSysteem)S).getSalaris()));
    }
}
