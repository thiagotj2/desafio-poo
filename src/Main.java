import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente1 = new Cliente("João", "11111111111");
        Conta conta1 = new ContaCorrente(cliente1);

        Cliente cliente2 = new Cliente("Maria", "22222222222");
        Conta conta2 = new ContaPoupanca(cliente2);

        int opcao;
        do {
            System.out.println("\n=== MENU BANCO ===");
            System.out.println("1 - Depositar na conta do João");
            System.out.println("2 - Sacar da conta do João");
            System.out.println("3 - Transferir João -> Maria");
            System.out.println("4 - Extrato João");
            System.out.println("5 - Extrato Maria");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> conta1.depositar(100);
                case 2 -> conta1.sacar(50);
                case 3 -> conta1.transferir(conta2, 30);
                case 4 -> conta1.imprimirExtrato();
                case 5 -> conta2.imprimirExtrato();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
