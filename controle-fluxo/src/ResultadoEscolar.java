public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
        int nota = 7;

        //condicional composta
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5  && nota <7) { //Condição encadeada
            System.out.println("Prova Recuperação");
        } else{
            System.out.println("Reprovado");
        }
    }
}
