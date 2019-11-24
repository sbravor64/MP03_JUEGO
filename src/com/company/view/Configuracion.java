package com.company.view;
import com.company.model.Campeonato;
import com.company.model.Participante;

import java.util.Scanner;

public class Configuracion {
    private String nomJ;
    private int cantParticipantes;
    private int cantCircuitos;

    public void show() {
        Scanner sc = new Scanner(System.in);

        Participante participante = new Participante();
        Campeonato campeonato = new Campeonato();

        System.out.print("Ecribir nombre del jugador: ");
        nomJ=sc.nextLine();
        participante.setNom(nomJ);

        System.out.print("Cantidad de Participantes: ");
        cantParticipantes=sc.nextInt();
        campeonato.setNumParticipantes(cantParticipantes);
        sc.nextLine();

        System.out.print("Cantidad de Circuitos: ");
        cantCircuitos = sc.nextInt();
        campeonato.setNumCircuitos(cantCircuitos);

        System.out.println("");
    }

    @Override
    public String toString() {
        return "Configuración actual{" +
                "nomJ='" + nomJ + '\'' +
                ", cantParticipantes=" + cantParticipantes +
                ", cantCircuitos=" + cantCircuitos +
                '}';
    }

    public String getNomJ() {
        return nomJ;
    }

    public int getCantParticipantes() {
        return cantParticipantes;
    }

    public int getCantCircuitos() {
        return cantCircuitos;
    }
}
