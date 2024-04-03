package functions;
public class selectOption {
    public static int enter(int chosen) {
        method i = new method();
        switch (chosen){
            case 1 :
                i.create();
                break;
            case 2 :
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

