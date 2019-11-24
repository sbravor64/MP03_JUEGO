package com.company.view;

import com.company.model.Participante;

import java.util.ArrayList;

public class Resultados {

    public Resultados(ArrayList<Participante> listParticipantes) {
        this.listParticipantes = listParticipantes;
    }

    ArrayList<Participante> listParticipantes = new ArrayList<>();

    public ArrayList<Participante> getListParticipantes() {
        return listParticipantes;
    }

    public void setListParticipantes(ArrayList<Participante> listParticipantes) {
        this.listParticipantes = listParticipantes;
    }

    public void mostrar() {
        System.out.println("----- Clasificación Total -----");
        int posicion = 0;
        for (Participante p: listParticipantes) {
            posicion++;
            System.out.format(posicion+".º " + p.getNom() + " ----> " + p.getPuntos() + " Puntos");
            System.out.println(" ");
        }
        System.out.println(" ");
    }

}

