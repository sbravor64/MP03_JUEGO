package com.company.view;

import java.util.Scanner;

public class MenuPrincipal {
    Configuracion configuracion = new Configuracion();
    Jugar jugar = new Jugar(configuracion);
    Resultados resultados = new Resultados(jugar.participanteList);

    public void show() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
        System.out.println("Cursa/Carrera MP03:");
        System.out.println("1. Configurar Competición - " + configuracion);
        System.out.println("2. Jugar");
        System.out.println("3. Resultados");
        System.out.println("4. Acabar");

        opcion= sc.nextInt();

            switch (opcion) {
                case 1:
                    configuracion.show();
                    break;
                case 2:
                    jugar.start();
                    break;
                case 3:
                    resultados.mostrar();
                case 4:
                    break;
            }
        } while (opcion!=4);
    }
}
