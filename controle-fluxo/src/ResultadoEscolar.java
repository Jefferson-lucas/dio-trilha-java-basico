public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
        int nota = 5;
        

        //condicional composta
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5  && nota <7) { //Condição encadeada
            System.out.println("Prova Recuperação");
        } else{
            System.out.println("Reprovado");
        }

        //Condicional ternária
        String resultado = (nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado");
        System.out.println(resultado);
    }
}
