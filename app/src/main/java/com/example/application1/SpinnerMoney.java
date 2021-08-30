package com.example.application1;

public class SpinnerMoney {
    public String id;
    public String moneda;

    public SpinnerMoney(String id, String moneda)
    {
        this.moneda = moneda;
        this.id = id;
    }
    @Override
    public String toString(){
        return moneda;
    }
}
