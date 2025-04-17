package Entities;

public class Passageiro {
    private String name;
    private String cpf;

    public Passageiro(String name, String cpf){
        this.name =name;
        this.cpf = cpf;
    }

    public String getName(){return name;}
    public String getCpf(){return cpf;}

    @Override
    public String toString() {
        return "Passageiro{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
