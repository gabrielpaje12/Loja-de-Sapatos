package LojaDeSapatos.MarcasEValores.test;


import LojaDeSapatos.MarcasEValores.Exceptions.CreditoException;
import LojaDeSapatos.MarcasEValores.domain.Client;

import LojaDeSapatos.MarcasEValores.domain.Mizuno;
import LojaDeSapatos.MarcasEValores.domain.Nike;
import LojaDeSapatos.MarcasEValores.service.CalcularSaldo;

import java.util.Scanner;

public class test {
    public static void main(String[] args) throws CreditoException {
        Scanner sc = new Scanner(System.in);
        CalcularSaldo calcularSaldo = new CalcularSaldo();
        Nike nike = new Nike("Tn 3 ", 41, 900);
        Mizuno mizuno = new Mizuno("prect 12",41,2000);

        System.out.println("Digite suas informaçaoes:");
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("saldo: ");
        double saldo = sc.nextDouble();

        Client cl = new Client(nome,saldo);
        calcularSaldo.CreditoException(cl,nike);
        mizuno.Print();
        calcularSaldo.CalcularNike(nike, cl);
    }
}
