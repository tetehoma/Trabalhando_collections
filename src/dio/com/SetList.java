package dio.com;

import java.util.*;

public class SetList {
    //Exercicio 1
    //Crie uma lista com cores do arco-iris
    //vermelha, laranja, amarela, verde, azul, azul-escuro e violeta
    //Exiba as notas em sequencia
    public static void main(String[] args) {

        Set<String> coresArcoiris = new HashSet<>(Arrays.asList("vermelha", "laranja", "amarela", "verde", "azul", "azul-escuro", "violeta"));
        Iterator<String> iterator = coresArcoiris.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        System.out.println(coresArcoiris.size());

        Set<String> coresArcoIris3 = new LinkedHashSet<>(Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(coresArcoIris3);
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        Set<String> coresOrdemAlfabetica = new TreeSet<>(coresArcoiris);
        System.out.println(coresOrdemAlfabetica);

        for (String cor : coresArcoiris) {
            if (cor.startsWith("v")) {
                System.out.println(cor);
            }
        }
       Iterator <String> iterator1 = coresArcoiris.iterator();
        while (iterator.hasNext()){
            if (!iterator1.next().startsWith("v")){
                iterator1.remove();
            }
        }

        coresArcoiris.clear();
        System.out.println("Confira se o conjunto está vazio:" + coresArcoiris.isEmpty());

    }

}

        









