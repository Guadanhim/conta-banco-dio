import java.util.Scanner;


class Cliente {
    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private float saldoConta;

    public Cliente(int numeroConta, String agencia, String nomeCliente, float saldoConta) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldoConta = saldoConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public float getSaldoConta() {
        return saldoConta;
    }
}


public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Por favor, Digite o número da conta! :");
        int numeroConta = scanner.nextInt(); 
        scanner.nextLine();
        
        System.out.println("Por favor, Digite o número da agência!");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, Digite seu nome!:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, Digite o saldo da conta!:");
        float saldoConta = scanner.nextFloat();
        

        Cliente cliente = new Cliente(numeroConta, agencia, nomeCliente, saldoConta);

        String mensagemAutomatica = "Olá " + cliente.getNomeCliente() + ". Obrigado por criar uma conta em nosso banco. Sua agência é " + cliente.getAgencia() + ", conta: " + cliente.getNumeroConta() + " e seu saldo de " + cliente.getSaldoConta() + " já está disponível para saque.";

        System.out.println(mensagemAutomatica);
        
        scanner.close();
        
    }
	

}


