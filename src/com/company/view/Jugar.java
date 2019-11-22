package com.company.view;

import com.company.model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Timer;

public class Jugar {
    Scanner sc = new Scanner(System.in);
    Configuracion configuracion;
    ArrayList<Participante> participanteList = new ArrayList<>();
    ComparadorPuntosParticipantes comparadorPuntos = new ComparadorPuntosParticipantes();

    public Jugar(Configuracion configuracion) {
        this.configuracion = configuracion;
    }

    public void start() {
        participanteList.clear();
        elegirVehiculo();

        Participante Pjugador = new Participante();
        Pjugador.setNom(configuracion.getNomJ());

        participanteList.add(Pjugador);

        int cantPart = configuracion.getCantParticipantes();

        for (int i = 1; i <= cantPart; i++) {
            Participante p = new Participante();
            p.setNom("Participante " + i);
            participanteList.add(p);
        }

        for (int i = 0; i < configuracion.getCantCircuitos() ; i++) {
            int y = i+1;
            System.out.println("---------------------");
            System.out.println("Circuito " + y);
            System.out.println("---------------------");
            for (Participante p : participanteList) {
                p.setTime();
            }

            Collections.sort(participanteList);

            for (int j = 0; j <3 ; j++) {
                Participante p = participanteList.get(j);
                if(j==0){
                    p.setPuntos(p.getPuntos()+10);
                } else if(j==1){
                    p.setPuntos(p.getPuntos()+8);
                } else if(j==2){
                    p.setPuntos(p.getPuntos()+6);
                }
            }

            for (Participante p_ordenado: participanteList) {
                System.out.format(p_ordenado.getNom() + " ----> " + "%.2f",p_ordenado.getTime());
                System.out.print("s");
                System.out.print(" ");
                System.out.print(" -----> "+p_ordenado.getPuntos() + " Pts");
                System.out.println("");
            }

            Collections.sort(participanteList, comparadorPuntos);

            Resultados resultados = new Resultados(participanteList);
            resultados.setListParticipantes(participanteList);

            System.out.println("");
        }
    }

    public void elegirVehiculo() {
        System.out.println("1. Coche");
        System.out.println("2. Moto");
        System.out.println("3. Bicicleta");

        int opcion;
        do {
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    Coche coche;
                    break;
                case 2:
                    Moto moto;
                    break;
                case 3:
                    Bicicleta bicicleta;
                    break;
            }
        } while (opcion>3);

    }
}
