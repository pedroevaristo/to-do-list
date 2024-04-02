import java.util.Scanner;
import interfaceList.create;
public class menuList {
    public static void main(String[] args) {
        create start = new create();
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem-vido ao To-Do, o que você quer fazer hoje? Fazer anotação (1) ou colocar algum lembrete (2) ?");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println("O que você quer fazer?\n\n1. Criar uma nova anotação\n 2. consultar\n 3. excluir anotação");
                start.create();
                break;


            case 2:
                break;
        }
    }
}
