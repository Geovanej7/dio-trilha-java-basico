import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:conhecer e importar a classe scanner

        Scanner scn = new Scanner(System.in);
        //exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite seu nome :");
        

        System.out.println("digite o número:");
        

        System.out.println("Por favor, digite o número da Agência :");
        

        System.out.println("Digite o seu Saldo :");
        

        //obter pela classe scanner os valores digitados pelo terminal
        String nome = scn.next();
        int numero = scn.nextInt();
        int numeroAgencia = scn.nextInt();
        float saldo = scn.nextFloat();
        String saldoFormatado = String.format("%.2f", saldo);
        //Exibir a mensagem conta criada

        System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numero + " e seu saldo " + saldoFormatado +" já está disponível para saque");
    }
}

