import java.util.Scanner;

public class ContaTerminal {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public static void main(String[] args) throws Exception{
        //TODO:Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Por favor, digite o número da conta:");

        //Obter pela scanner os valores digitados no terminal
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite a agência da conta:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();        

        //Exibir a mensagem conta criada
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n", nomeCliente, agencia, numero, saldo);

        scanner.close();
    }
}