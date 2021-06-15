package com.company.Interface;

import com.company.Observer.Observer;
import com.company.Observer.Subject;
import com.company.Service.SalarisBerekening;

public class PersoneelsLidImpl implements PersoneelsLid {
    private SalarisBerekening SB;
    private int salaris;

    public PersoneelsLidImpl(SalarisBerekening sb) {
        this.SB = sb;
        salaris = 0;
    }

    @Override
    public int salaris() {
        return SB.salaris();
    }

    @Override
    public void opslag(int bedrag) {
        SB.verhoog(bedrag);
    }


}
