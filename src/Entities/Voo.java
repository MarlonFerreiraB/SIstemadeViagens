package Entities;

import java.util.Arrays;

public class Voo {
    private String destino;
    private double preco;
    private Passageiro[] passageiros = new Passageiro[30];

    public Voo(String destino, double preco){
        this.destino = destino;
        this.preco = preco;
    }

    public Passageiro[] getPassageiros(){
        return passageiros;
    }
    public String getDestino(){return destino;}
    public double getPreco(){return preco;}

    @Override
    public String toString() {
        return "Voo{" +
                "destino='" + destino + '\'' +
                ", preco=" + preco +
                ", passageiros=" + Arrays.toString(passageiros) +
                '}';
    }
}
