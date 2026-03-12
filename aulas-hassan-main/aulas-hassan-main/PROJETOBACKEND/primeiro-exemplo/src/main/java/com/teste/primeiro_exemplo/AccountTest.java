package com.teste.primeiro_exemplo;

public class AccountTest {
     public static void main(String[] args)
    {
        //cria um objeto Scanner para obter entrada
        Scanner input = new Scanner(System.in);

        //Cria um objeto account e o atribui a my account
        Account myAccount = new Account();

        //exibe o valor inicial do nome null
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        //solicita e lê o nome
        System.out.printIn("Please enter the name: ");
        String theName = input.nextLine(); //Lê uma linha de texto
        myAccount setName(theName); //Insere thename em myaccount
        System.out.printIn(); //gera saída de uma linha em branco

        //exibe o nome armazenado no objeto my account
        System.out.prinf("Name in object myAccount is: %n%s%n",
            myAccount.getName());
    }
}
