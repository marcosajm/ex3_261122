import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Clientes> personList = new ArrayList<Clientes>();
        while(true) {
            Clientes p =new Clientes();
            Scanner stdin = new Scanner(System.in);
            System.out.println("Inserir Nome do cliente:");
            p.setName(stdin.next());
            System.out.println("Inserir o número de telefone:");
            p.setPhone(stdin.nextInt());
            personList.add(p);
            System.out.println("Deseja adicionar mais clientes? (Y/N)");
            if(stdin.next().equalsIgnoreCase("N")) {
                break;
            }
        }
        Collections.sort(personList);
        System.out.println("Nome do cliente no início da lista é: " + personList.get(0).getName() + " número de telefone: " + personList.get(0).getPhone());
        while (true) {
            if (personList.size() < 1) {
                break;
            }
            else {
                if(personList.size() >= 1) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Apagar cliente do início da lista emostrar o proximo? (Y)");
                    if (sc.next().equalsIgnoreCase("Y")) {
                        personList.remove(0);
                        System.out.println("Nome do cliente no início da lista é: " + personList.get(0).getName() + " número de telefone: " + personList.get(0).getPhone());
                    } else {
                        break;
                    }
                }
            }

        }
    }
}
