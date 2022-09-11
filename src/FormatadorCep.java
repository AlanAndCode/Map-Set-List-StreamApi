public class FormatadorCep {
    public static void main(String[] args){
        try {
            String CepFormatado = formatarCep("2376506");
            System.out.println(CepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep nao corresponde com as regras de negocio");
        }
    }
    static  String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
        throw new CepInvalidoException();
//SIMULANDO UM CEP FORMATADO
        return "23.765-064";
    }
}
