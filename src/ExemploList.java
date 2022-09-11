import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static  void main(String[] args){
       // List notas = new ArrayList();



        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.0);
        notas.add(6.0);
        notas.add(9.0);
        notas.add(2.0);
        notas.add(1.0);
        notas.add(4.0);
System.out.println(notas.toString());

System.out.println("Exiba a posiçao nota 6.0: " + notas.indexOf(6d));
        notas.add(4, 22d);
        System.out.println(notas);

        System.out.println("Substitua a nota 6.0 pela nota 21.0: ");
        notas.set(notas.indexOf(6d), 21.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 6.0 está na lista: " + notas.contains(5d));

        /*System.out.println("Exiba todas as notas em que foram informados: ");
        for (Double nota : notas)System.out.println(nota);*/

        System.out.println("Exibida a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exibida a menor nota: " + Collections.min(notas));

        System.out.println("Exibida a maior nota: " + Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a media das notas :" + (soma/notas.size()));

        System.out.println("Remova a nota 1: ");
        notas.remove(1d);
        System.out.println(notas);

        System.out.println("Remova a nota na posiçao 0: ");
        notas.remove(6);
        System.out.println(notas);

        System.out.println("Remova a nota menor que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("A lista está vazia: " + notas.isEmpty());
    }

}
