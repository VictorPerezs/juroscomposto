package Jurosc;
import java.util.Scanner;

public class JurosComp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Cliente cliente = new Cliente();
		Conta conta = new Conta();
		
		
		System.out.println("Insira seu Nome Completo: ");
		String nPessoa = scan.nextLine();
		cliente.setnomePessoa(nPessoa);
		
		System.out.println("Insira seu CPF: ");
		String cpf = scan.nextLine();
		cliente.setcpfPessoa(cpf);
		
		System.out.println("Quanto dinheiro quer retirar pelo imprestimo? ");
		double emp = scan.nextDouble();
		conta.setemprestimo(emp);
		
		System.out.println("Em quantas parcelas quer pagar o imprestimo? ");
		int parc = scan.nextInt();
		conta.setparcelas(parc);
		
		
		double juros = 0.015;
		double total = 0.0 , parcmensal = 0.0 , valormensal = 0.0;
		for(int i = 1; i<= parc; i++) {
			
		parcmensal = emp / parc;
		valormensal = parcmensal * Math.pow((1+juros),i);
	    total = total + valormensal;
	    	
	    System.out.println(i+ "ª Parcela: " + "Valor: " +valormensal + " R$"  );
			
		}
	
		System.out.println ("O valor final das parcelas é: " + total + " R$");
		
			scan.close();
		
	}
}
