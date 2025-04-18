package Entities;

import java.util.Arrays;

public class Voo {
    private String destino;
    private int numVoo;
    private double preco;
    private Passageiro[] passageiros = new Passageiro[30];

    public Voo(String destino,int numVoo, double preco){
        this.destino = destino;
        this.numVoo = numVoo;
        this.preco = preco;
    }

    public Passageiro[] getPassageiros(){
        return passageiros;
    }
    public String getDestino(){return destino;}
    public int getNumVoo(){return numVoo;}
    public double getPreco(){return preco;}

    @Override
    public String toString() {
        return "Voo{" +
                "destino='" + destino + '\'' +
                ", numVoo=" + numVoo +
                ", preco=" + preco +
                ", passageiros=" + Arrays.toString(passageiros) +
                '}';
    }
}
