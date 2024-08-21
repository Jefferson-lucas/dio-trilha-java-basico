public class ExemploBreakContinue {
    public static void main(String[] args) {

        //Utilização de break e continue onde o break para a aplicação e o continue atua apenas na iteração que atenda a condição desejada
        for(int numero = 1; numero <= 5; numero ++){
            if (numero == 3) {
                //break;
                continue;
            }
        System.out.println(numero);
        }
    }
    
}
