import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu Nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite seu código de Usuário: ");
        int numeroCliente = scanner.nextInt();

        System.out.println("Por favor, digite sua Agência: ");
        String agenciaCliente = scanner.next();

        System.out.println("Por favor, digite seu Saldo: ");
        double saldoCliente = scanner.nextDouble();

        
        System.out.println("Olá " + nomeCliente + "! Obrigado por criar uma conta em nosso banco, sua Agência é " + agenciaCliente + 
        ", Conta " + numeroCliente + " e seu Saldo " + saldoCliente + " já está disponível para saque.");  
    }
}