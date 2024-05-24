public class Concatenacao {
    
public static void main(String[] args){
    String PrimeiroNome = "Erik";
    String SegundoNome = "Gomes";

    String NomeCompleto = nomeCompleto(PrimeiroNome, SegundoNome);

    System.out.println(NomeCompleto);
}

public static String nomeCompleto (String PrimeiroNome, String SegundoNome) {
    return PrimeiroNome.concat(" ").concat(SegundoNome);
}

}
