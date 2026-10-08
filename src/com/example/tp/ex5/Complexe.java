package com.example.tp.ex5;

public class Complexe {

    private double reel;
    private double imaginaire;

    public Complexe(double reel, double imaginaire) {
        this.reel = reel;
        this.imaginaire = imaginaire;
    }

    public Complexe plus(Complexe autre) {
        return new Complexe(
            this.reel + autre.reel,
            this.imaginaire + autre.imaginaire
        );
    }

    public Complexe moins(Complexe autre) {
        return new Complexe(
            this.reel - autre.reel,
            this.imaginaire - autre.imaginaire
        );
    }

    @Override
    public String toString() {
        if (imaginaire >= 0) {
            return reel + " +" + imaginaire + "i";
        } else {
            return reel + " " + imaginaire + "i";
        }
    }
}