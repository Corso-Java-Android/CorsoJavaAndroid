package com.example.a001;

import java.io.Serializable;

public class State implements Serializable {

    private int contatore = 0;

    public void reset() {
        this.contatore = 0;
    }

    public int updateContatore() {
        this.contatore++;
        return contatore;
    }

    public State() {
        this.contatore = 0;
    }

    public State(int contatore) {
        this.contatore = contatore;
    }

    public int getContatore(){
        return contatore;
    }

    @Override
    public String toString() {
        return "State{" +
                "contatore=" + contatore +
                '}';
    }
}
