package Entities;

public class Reserva {
    private Passageiro passageiro;
    private Voo voo;

    public Reserva(Passageiro passageiro, Voo voo){
        this.passageiro = passageiro;
        this.voo = voo;
    }
    public Passageiro getPassageiro(){
        return passageiro;
    }
    public Voo getVoo(){return voo;}

    @Override
    public String toString() {
        return "Reserva{" +
                "passageiro=" + passageiro +
                ", voo=" + voo +
                '}';
    }
}
