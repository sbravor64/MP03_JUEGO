package com.company.view;

import java.util.Scanner;

public class MenuPrincipal {
    public void show() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Configurar Competición");
        System.out.println("2. Jugar");
        System.out.println("3. Resultados");
        System.out.println("4. Acabar");

        Competicion competicion = new Competicion();
        MenuVehiculo jugar = new MenuVehiculo();

        int opcion= sc.nextInt();
        switch (opcion) {
            case 1:
                competicion.show();
                break;
            case 2:
                jugar.show();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }
}
