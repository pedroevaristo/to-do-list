package View;

import Controller.factoryMethod;

import java.util.Scanner;

public class selectOption {

    public static int enter(int chosen) {
        Scanner scan = new Scanner(System.in);
        factoryMethod i = new factoryMethod();

        switch (chosen){
            case 1 :
                System.out.println("Qual é a tarefa ?");
                String text = scan.next();
                i.create(text);
                break;

            case 2 :
                System.out.println("Qual o indice quer escolher, no máximo: "/*+  Factorymethod.list.size()*/);
                int index = scan.nextInt();
                boolean verify = i.consult(index);
                if(verify != true){
                    System.out.println("Não foi possível achar o indice digitado, verifique se digitou certo");
                }else{
                    System.out.println("Aqui está: \n" /*+ commandHeader.list.get(index)*/);
                }
                break;
            case 3 :
                break;
            default:
                System.out.println("Não existe essa opção");
                break;

        }

        return chosen;
    }
}

