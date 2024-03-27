import java.util.Scanner;
import anotation.create;
public class menuList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem-vido ao To-Do, o que você quer fazer hoje? Fazer anotação (1) ou colocar algum lembrete (2) ?");
        int choice = scan.nextInt();

        switch (choice){
            case 1:
                new create();
                break;


            case 2:
                break;
        }
    }
}
