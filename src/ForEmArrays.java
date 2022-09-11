import java.util.concurrent.ThreadLocalRandom;

public class ForEmArrays {
    public static void main(String[] args){
        int mesada = 50;
        while(mesada>0) {
        int valorDoce = valorAleatorio();
        if(valorDoce > mesada)
            valorDoce = mesada;

        System.out.println("Doce do valor:" + valorDoce + "Adicionado no carrinho");
        mesada = mesada - valorDoce;

        }
        System.out.println("Joaozinho esgotou sua mesada");
    }
private static int valorAleatorio(){
        return ThreadLocalRandom.current().nextInt(2, 8);
}
}
