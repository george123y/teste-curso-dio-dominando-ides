import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("Anderson");
        nomes.add("João");
        System.out.println(nomes);

        nomes.set(2, "Larissa");

        System.out.println(nomes);

        Collections.sort(nomes);
        nomes.set(2, "Wesley");

        System.out.println(nomes);

        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove("Wesley");
        System.out.println(nomes);

        String nome = nomes.get(3);
        System.out.println(nome);

        int posicao = nomes.indexOf("Carlos");
        System.out.println(posicao);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        nomes.remove("Larissa");
                tamanho = nomes.size();
        System.out.println(tamanho);

        boolean temAnderson =  nomes.contains("Anderson");
        System.out.println(temAnderson);

        boolean temFernando =  nomes.contains("Fernando");
        System.out.println(temFernando);

        nomes.clear();
        System.out.println(nomes);

        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

        List<String> nomes2= new ArrayList<>();
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");
        System.out.println(nomes2);

    }
}
