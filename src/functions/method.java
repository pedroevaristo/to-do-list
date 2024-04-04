package functions;
import java.util.Scanner;

public class method implements interfaceOf{
    int index = 0;
    Scanner scan = new Scanner(System.in);
    //criar um armazenamento temporario que repassa para uma lista em que pode deletar, atualizar, criar, consultar
    @Override
    public boolean create(String text) {
        index +=1;
        boolean validation = list.put(index, text).isEmpty();
        return validation;

    }

    @Override
    public boolean consult(int index) {
        boolean validation = list.containsKey(index);
        return validation;
    }

    @Override
    public void exclude() {

    }
}
