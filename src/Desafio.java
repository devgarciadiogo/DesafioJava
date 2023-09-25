import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Diogo Garcia";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Tranferir valor
                3 - Receber valor
                4 - Sair
                
                """;

        Scanner scanner = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = scanner.nextInt();

            if(opcao == 1){
                System.out.println("O saldo atual é: " + saldo);
            }else if (opcao ==  2){
                System.out.println("Qual o valor que deseja tranferir ?");
                double valor = scanner.nextDouble();
                if (valor > saldo){
                    System.out.println("Não ha saldo suficiente para realizar a tranferência desejada");
                }else {
                    saldo -= valor;
                    System.out.println("Saldo atualizado: " + saldo);
                }
            }else if (opcao == 3){
                System.out.println("Valor recebido: ");
                double valor = scanner.nextDouble();
                saldo += valor;
                System.out.println("Saldo atualizado: " + saldo);
            }else if (opcao != 4){
                System.out.println("Opção invalida");
            }
        }

    }
}