import java.util.Scanner;
import View.listToWrite;
public class main {
    public static void main(String[] args) {
        listToWrite view = new listToWrite();
        System.out.println("Bem-vindo list To Do Tech, o que quer fazer ? \n1-inserir nova anotacao\n2-ver as todas as anotações escritas\n3-excluir a anotação especifíca");

        view.frontUser();
    }
}
