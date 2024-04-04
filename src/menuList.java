import java.util.Scanner;
import functions.selectOption;
import functions.interfaceOf;
public class menuList {
    public static void main(String[] args) {
        selectOption start = new selectOption();

        Scanner scan = new Scanner(System.in);
        System.out.println("Anotações disponíveis:" + interfaceOf.list.size() );
        System.out.println("Bem-vido ao To-Do, o que você quer fazer hoje? Fazer anotação (1) ou colocar algum lembrete (2) ?");

        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println("O que você quer fazer?\n\n1. Criar uma nova anotação\n 2. consultar\n 3. excluir anotação");
                int chosen = scan.nextInt();
                start.enter(chosen);
                break;


            case 2:
                break;
        }
    }
}
