package LojaDeSapatos.MarcasEValores.service;

import LojaDeSapatos.MarcasEValores.Exceptions.CreditoException;
import LojaDeSapatos.MarcasEValores.domain.Client;
import LojaDeSapatos.MarcasEValores.domain.Marcas;
import org.jetbrains.annotations.NotNull;

public class CalcularSaldo  {
    public  void CalcularNike(Marcas marcas, Client client){

        double Saldo = client.getSaldo() - marcas.getPreco();
        System.out.println("------------------------");


       if(Saldo <= 0 ) {
           System.out.println();
       }else{
           System.out.println("seu troco: "+ Saldo);
       }
    }

    public void CreditoException(@NotNull Client client, Marcas marcas) throws CreditoException {
            if ((client.getSaldo() < marcas.getPreco())) {
                throw new CreditoException("Saldo insuficiente");


            }else{
                System.out.println("Compra realizada!");
            }
    }



}
