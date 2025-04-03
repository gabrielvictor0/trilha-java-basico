import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
       
    }
 

   int numero;
   String agencia;
   String nomeCliente;
   double saldo; 

    Scanner ler = new Scanner(System.in);

    public void lerNumero(){
        System.out.println("Por favor, digite o número da conta!");
        numero = ler.nextInt();
    }
    
    public void lerNomeCliente(){
        System.out.println("Por favor, digite o nome da conta!");
        nomeCliente = ler.next();
        nomeCliente = nomeCliente + ler.nextLine();
        System.out.println("");
    }
    
    public void lerSaldo(){
        System.out.println("Por favor, digite o saldo da conta!");
        saldo = ler.nextDouble();
    }
    
    public void lerAgencia(){
        System.out.println("Por favor, digite o número da Agência!");
        agencia = ler.next();
    }
   
}
