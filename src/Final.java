package PACKAGE_NAME;

public class Final {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaTerminal c1 = new ContaTerminal();
        System.out.println("Por favor, digite seu nome");
        c1.nomeCliente = sc.next();
        System.out.println("Por favor, digite sua agência");
        c1.agencia = sc.next();
        System.out.println("Por favor, digite o numero da sua conta");
        c1.numero = sc.nextInt();
        System.out.println("Por favor, digite seu saldo");
        c1.saldo = sc.nextDouble();
        sc.close();

        System.out.println("Olá " + c1.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + c1.agencia + ", conta " + c1.numero+ " e seu saldo R$"+ c1.saldo +" já está disponível" );
    }
}
