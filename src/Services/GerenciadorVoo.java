package Services;

import Entities.Passageiro;
import Entities.Voo;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorVoo {
    private Voo voo;
    private Passageiro passageiro;
    private List<Voo> vooList = new ArrayList<>();


    public boolean addVoo(String destino, int numVoo, double preco){
        for(Voo v: vooList){
            if(v.getNumVoo() == numVoo){
                System.out.println("Este voo ja existe");
                return false;
            }
        }
        Voo novovoo = new Voo(destino,numVoo,preco);
        vooList.add(novovoo);
        System.out.println("Voo criado com sucesso.");
        return true;
    }

    public Voo procurarVoo(int numVoo){
        for(Voo v: vooList){
            if(v.getNumVoo() == numVoo){
                System.out.println("existe");
                return v;

            }
        }
        System.out.println("Voo não encontrado");
        return null;
    }


    public List<Voo> getVooList() {
        return vooList;
    }
    public Voo getVoo(){return voo;}

    public void exibirVoos(){
        for(Voo v: vooList){
            System.out.println(v);
        }
    }
}
