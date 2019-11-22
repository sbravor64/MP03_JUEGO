package com.company.model;

import java.util.Comparator;

public class ComparadorPuntosParticipantes implements Comparator<Participante> {

    @Override
    public int compare(Participante participante, Participante participante2) {
        if(participante.getPuntos() > participante2.getPuntos()){
            return -1;
        } else if(participante.getPuntos() < participante2.getPuntos()){
            return 1;
        }else {
            return 0;
        }
    }
}
