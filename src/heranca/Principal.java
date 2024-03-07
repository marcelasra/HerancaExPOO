package heranca;

public class Principal {
    
    public static void main(String[] args) {
        Aluno a1 = new Aluno(); //instânciando a classe aluno
        Professor p1 = new Professor(); //instânciando a classe professor
        
        a1.nome = "Marcela Andrade";
        a1.rg = "13.905.418-2";
        a1.cpf = "722.463.038-18";
        a1.registroAluno = 125221330;
        a1.notaVestibular = 8.0f;
        a1.curso = "Bacharelado em Sistemas de Informação";
        a1.dataMatricula = "02/02/2023";
        
        p1.nome = "Martinelli";
        p1.rg = "21.406.675-7";
        p1.cpf = "770.352.078-05";
        p1.matriculaProfessor = 300468;
        p1.dataAdmissao = "10/10/2019";
        p1.salarioHorista = 70.99;
        
        System.out.println("\t - Dados do Aluno RA nº: " + a1.registroAluno + "-\n" );
        System.out.println(a1.retornaDadosAluno());
        
        System.out.println("\t - Dados do Professor Matrícula nº: " + p1.matriculaProfessor + "-\n" );
        System.out.println(p1.retornaDadosProfessor());
    }
}
