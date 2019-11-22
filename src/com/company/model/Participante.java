package com.company.model;
import java.util.Objects;
import java.util.Random;

public class Participante implements Comparable<Participante>{

    private String nom;
    private float time;
    private String vehiculo;

    private int puntos=0;

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom(){
        return nom;
    }

    public void setTime(){
        float min = 1F;
        float max = 4F;
        time = min + new Random().nextFloat() * (max - min);
    }

    public float getTime() {
        return time;
    }

    public void setVehiculo(String vehiculo){
        this.vehiculo=vehiculo;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public int hashCode() {
        return Objects.hash(time);
    }

    @Override
    public int compareTo(Participante participante) {
        if(getTime() < participante.getTime()){
            return -1;
        } else if(getTime() > participante.getTime()){
            return 1;
        }else {
            return 0;
        }
    }
}
