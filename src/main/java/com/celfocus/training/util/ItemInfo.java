package com.celfocus.training.util;

public class ItemInfo
{
    public String name;

    public double valor;

    public ItemInfo(String name, double valor) {
        this.name = name;
        this.valor = valor;
    }

    public ItemInfo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
