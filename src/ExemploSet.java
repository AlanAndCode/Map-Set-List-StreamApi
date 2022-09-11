import java.util.*;

class ExemploSet {
    public static void main(String[] args){
    System.out.println("Crie um conjunto e adicione as notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 5d, 6d, 9d, 3.6, 0d));
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("Exibida a menor nota: " + Collections.min(notas));

        System.out.println("Exibida a menor nota: " + Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exibida a soma nota: " + soma);

        System.out.println("Exiba a media das notas :" + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Ordem Crescente");
        Set<Double> notas3 = new TreeSet<>(notas);
        System.out.println(notas3);

    }
}

