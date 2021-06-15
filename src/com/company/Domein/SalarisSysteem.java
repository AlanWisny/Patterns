package com.company.Domein;

import com.company.Observer.Observer;
import com.company.Observer.Subject;
import com.company.Service.AbstractFactory;
import com.company.Service.Singleton;


public class SalarisSysteem implements Subject {
    private int salaris;

    public SalarisSysteem(AbstractFactory F) {
        F.show();
    }

    public void stelIn(int waarde) {
        salaris = waarde;
        notifyAllObservers();
    }

    public int getSalaris() {
        return salaris;
    }


}
