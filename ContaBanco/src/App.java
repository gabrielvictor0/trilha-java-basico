public class App {


    public static void main(String[] args) {
        ContaTerminal contaTerminal = new ContaTerminal();
        
        contaTerminal.lerNumero();
        contaTerminal.lerNomeCliente();
        contaTerminal.lerSaldo();
        contaTerminal.lerAgencia();

        System.out.println("Olá " + contaTerminal.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + contaTerminal.agencia + ", conta " + contaTerminal.numero + " e seu saldo R$" + contaTerminal.saldo + " já está disponível para saque.");
    }
}
