import java.util.Locale;
import java.util.Scanner;

public class FormatadorCepExemplo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o cep - Apenas Números:");
        
        try {
            String cepFormatado = formatarCep(scanner.nextLine());
            System.out.println("O cep formatado é: " + cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println("O CEP deve conter 8 digitos");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        
        String cepFinal;

        if (cep.length() !=8) {
            throw new CepInvalidoException();
        }
        
        cepFinal = cep.substring(0, 2).concat(".").concat(cep.substring(2,5)).concat("-").concat(cep.substring(5, 8));

        return cepFinal;
    }
}
