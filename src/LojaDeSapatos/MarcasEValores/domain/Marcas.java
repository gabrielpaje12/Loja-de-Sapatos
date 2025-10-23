package LojaDeSapatos.MarcasEValores.domain;


public abstract class Marcas {

    protected String nome;
    protected int numero;
    protected double preco;


    public void Print() {
        System.out.println("Produto: " + this.nome);
        System.out.println("Numero: " + this.numero);
        System.out.println("Preco: " + this.preco);
    }


    public Marcas(String nome, int numero, double preco) {
        this.nome = nome;
        this.numero = numero;
        this.preco = preco;
    }

    public static double CalcularResto(Client perfil, double compra) {
        return perfil.getSaldo() - compra;
    }





    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }



    public int getNumero() {
        return numero;
    }




}
