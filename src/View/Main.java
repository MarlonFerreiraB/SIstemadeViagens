package View;

import Services.GerenciadorPassageiro;
import Services.GerenciadorVoo;
import Services.GerenciarReserva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciadorPassageiro gerenciadorPassageiro = new GerenciadorPassageiro();
        GerenciadorVoo gerenciadorVoo = new GerenciadorVoo();
        GerenciarReserva gerenciarReserva = new GerenciarReserva(gerenciadorVoo);



        while (true){
            System.out.println("1. Cadastrar Passageiro");
            System.out.println("2. Cadastrar Voo");
            System.out.println("3. Fazer Reserva");
            System.out.println("4. Cancelar Reserva");
            System.out.println("5. Sair");

            int n = sc.nextInt();
            sc.nextLine();

            switch (n){
                case 1:
                    System.out.print("Nome: ");
                    String name = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    gerenciadorPassageiro.addPassageiro(name, cpf);
                    break;
                case 2:
                    System.out.print("Destino: ");
                    String destino = sc.nextLine();
                    System.out.print("Numero do Voo: ");
                    int numVoo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Preço da passagem: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();
                    gerenciadorVoo.addVoo(destino,numVoo,preco);
                    gerenciadorVoo.procurarVoo(numVoo);
                    gerenciadorVoo.exibirVoos();
                    break;
                case 3:
                    System.out.print("CPF: ");
                    String buscaCpf = sc.nextLine();
                    System.out.print("Numero do voo: ");
                    int numVoop = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Numero da cadeira: ");
                    int cadeira = sc.nextInt();
                    sc.nextLine();
                    gerenciarReserva.addReserva(numVoop,cadeira, gerenciadorPassageiro.procurarPassageiro(buscaCpf) );
                    break;
                case 4:

                case 5:
                default:
            }
        }


    }
}