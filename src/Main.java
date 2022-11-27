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
        System.out.println("Nome do cliente no início da lista para efetuar o contato: " + personList.get(0).getName() + "\n número de telefone: " + personList.get(0).getPhone());
        while (true) {
            if (personList.isEmpty()) {
                break;
            }
            else {
                Scanner sc = new Scanner(System.in);
                System.out.println("Apagar cliente do início da lista e mostrar o proximo da lista para efetuar o contato? (Y)");
                if (sc.next().equalsIgnoreCase("Y")) {
                    personList.remove(0);
                    if (personList.size() >= 1) {
                        System.out.println("Nome do cliente no início da lista para efetuar o contato: " + personList.get(0).getName() + "\n número de telefone: " + personList.get(0).getPhone());
                    }
                }
                else {
                    break;
                }

            }
        }
    }
}
// programa que contemple uma fila de clientes para as chamadas de um call center.
//        As opções do programa devem ser:
        // Inserir cliente – Deve solicitar ao utilizador os dados Nome e Numero de telefone;
        // Próximo cliente: – Deve ir buscar o cliente no início da lista,  removê-lo e mostrar os seus dados na consola para que o operador possa efetuar o contato com o cliente.
