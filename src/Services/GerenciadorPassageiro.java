package Services;

import Entities.Passageiro;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorPassageiro {
    Passageiro passageiro;
    List<Passageiro> passageiroList = new ArrayList<>();

    public boolean addPassageiro(String name, String cpf){
        for(Passageiro p: passageiroList){
            if(p.getCpf().equals(cpf)){
                System.out.println("Ja existe um cadastro com esse cpf");
                return false;
            }
        }
        Passageiro novoPassageiro = new Passageiro(name,cpf);
        passageiroList.add(novoPassageiro);
        System.out.println("Passageiro Cadastrado com sucesso");
        return true;
    }

    public Passageiro procurarPassageiro(String cpf){
        for(Passageiro p: passageiroList){
            if (p.getCpf().equals(cpf)) {
                return p;
            }
        }
        System.out.println("Passageiro não encontrado");
        return  null;
    }
}
