package com.company.model;

import java.util.Scanner;

public class Campeonato {
    Scanner sc = new Scanner(System.in);
    private int numCircuitos;
    private int numParticipantes;

    public void setNumCircuitos(int numCircuitos) {
        this.numCircuitos = numCircuitos;
    }

    public int getNumCircuitos(){
        return numCircuitos;
    }

    public void setNumParticipantes(int numParticipantes) {
        this.numParticipantes = numParticipantes;
    }

    public int getNumParticipantes(){
        return numParticipantes;
    }
}

