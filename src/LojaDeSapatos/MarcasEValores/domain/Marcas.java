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


    public static double CalcularCredito(Client perfil, Nike compra) {
        if (perfil.getSaldo() < compra.preco) {
            System.out.println("Voce vai ficar devendo: " + CalcularResto(perfil, compra.preco));
        } else {
            System.out.println("Voce vai ficar com um credito de: " + CalcularResto(perfil, compra.preco));
        }
        return 0;
    }

    public static void Print(Client perfil, Nike compra) {

        CalcularCredito(perfil, compra);
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
