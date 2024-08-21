public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"FELIPE","JONAS","JULIA","MARCOS"};

        //Utilização do for com array
        for(int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }

        // Forma otimizada para trabalhar com Arrays onde a cada iteração a variavel declarada recebe o elemento na posição informada
        for(String aluno : alunos){
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
    
}
