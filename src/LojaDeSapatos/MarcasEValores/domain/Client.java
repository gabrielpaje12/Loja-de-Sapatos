package LojaDeSapatos.MarcasEValores.domain;

import java.util.Scanner;

public class Client {

    private String Nome ;
    private double Saldo;

    public  Client(String nome, double saldo) {
        this.Nome = nome;
        this.Saldo = saldo;
    }

    public String getNome() {
        return Nome;
    }

    public double getSaldo() {
        return Saldo;
    }
}
