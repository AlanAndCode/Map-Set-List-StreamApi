public class ResultadoEscolar {
    public static void main(String[] args){
        double nota1 = 7.5;
        double nota2 = 5.0;
         double notaFinal = (nota1 + nota2) / 2.0;
        if(notaFinal < 6.0){


            System.out.println("Reprovado por nota: " + notaFinal);
        }else {
            System.out.println("Aprovado:" + notaFinal);
        }
    }
}
