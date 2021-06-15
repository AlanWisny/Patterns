package com.company.Interface;

import com.company.Service.SalarisBerekening;

public class UurloonBerekening implements SalarisBerekening{
    private int uurloon;
    private int aantalUur;

    public UurloonBerekening(int b, int u) {
        uurloon = b;
        aantalUur = u;
    }

    @Override
    public int salaris() {
        return uurloon * aantalUur;
    }

    @Override
    public void verhoog(int bedrag) {
        uurloon += bedrag;
    }

    @Override
    public void toon() {
        System.out.println("Salaris van uurloon is : " + salaris());
    }
}
