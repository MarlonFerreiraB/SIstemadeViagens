package Services;

import Entities.Passageiro;
import Entities.Reserva;
import Entities.Voo;

import java.util.ArrayList;
import java.util.List;

public class GerenciarReserva {
    private Reserva reserva;
    GerenciadorVoo gerenciadorVoo;
    Voo voo;
    List<Reserva> reservaList = new ArrayList<>();

    public GerenciarReserva(GerenciadorVoo gerenciadorVoo){
        this.gerenciadorVoo = gerenciadorVoo;
    }


    public boolean addReserva(int numvoo,int numeCadeira, Passageiro passageiro){
        Voo vooEncontrado = gerenciadorVoo.procurarVoo(numvoo);
        if(numeCadeira < 0 || numeCadeira >= vooEncontrado.getPassageiros().length){
          System.out.println("Escolha um numero dentro das possibilidades");
          return false;
        }
      vooEncontrado.getPassageiros()[numeCadeira] = passageiro;
      Reserva novaReserva = new Reserva(passageiro,vooEncontrado);
      reservaList.add(novaReserva);
      return true;
    }

    public boolean removeReserva(String cpf){
        for(Reserva r: reservaList){
            if(r.getPassageiro().getCpf().equals(cpf)){
                reservaList.remove(r);
                System.out.println("Reserva removida com sucesso");
                return true;
            }
        }
        System.out.println("Reserva n encontrada");
        return false;
    }

    public Reserva procurarReserva(String cpf){
        for(Reserva r: reservaList){
            if(r.getPassageiro().getCpf().equals(cpf)){
                System.out.println(r);
                return r;
            }
        }
        System.out.println("Reserva não encontrada");
        return null;
    }

}
