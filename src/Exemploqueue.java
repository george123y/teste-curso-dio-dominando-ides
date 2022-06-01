import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Exemploqueue {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio ");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");
        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek();
//        filaBanco.clear();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);


        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        for (String client: filaBanco){
            System.out.println(client);
        }
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while(iteratorFilaBanco.hasNext()){
            System.out.println("--->" + iteratorFilaBanco.next());

        }
        System.out.println(filaBanco.size());

//        filaBanco.clear();

        System.out.println(filaBanco.isEmpty());

        filaBanco.add("Wesley");
        System.out.println(filaBanco);


    }
}
