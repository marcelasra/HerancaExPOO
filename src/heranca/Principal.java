package heranca;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Aluno a1 = new Aluno(); //inst�nciando a classe aluno
        Professor p1 = new Professor(); //inst�nciando a classe professor
        Scanner texto = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        a1.nome = texto.nextLine();
        
        System.out.println("Digite o RG do aluno: ");
        a1.rg = texto.nextLine();
        
        System.out.println("Digite o CPF do aluno: ");
        a1.cpf = texto.nextLine();
        
        System.out.println("Digite o Registro do Aluno: ");
        a1.registroAluno = num.nextInt();
        
        System.out.println("Digite a nota do Vestibular: ");
        a1.notaVestibular = num.nextFloat();
        
        System.out.println("Digite o curso: ");
        a1.curso = texto.nextLine();
        
        System.out.println("Digite a data da matr�cula: ");
        a1.dataMatricula = texto.nextLine();
        
        
        System.out.println("Digite o nome do Professor: ");
        p1.nome = texto.nextLine();
        
        System.out.println("Digite o rg do Professor: ");
        p1.rg = texto.nextLine();
        
        System.out.println("Digite o CPF do professor: ");
        p1.cpf = texto.nextLine();
        
        System.out.println("Digite a matr�cula do professor: ");
        p1.matriculaProfessor = num.nextInt();
        
        System.out.println("Digite a data de Admiss�o: ");
        p1.dataAdmissao = texto.nextLine();
        
        System.out.println("Digite o sal�rio/hora do professor: ");
        p1.salarioHorista = num.nextDouble();
        
        
        System.out.println("\t - Dados do Aluno RA n�: " + a1.registroAluno + "-\n" );
        System.out.println(a1.retornaDadosAluno());
        
        System.out.println("\t - Dados do Professor Matr�cula n�: " + p1.matriculaProfessor + "-\n" );
        System.out.println(p1.retornaDadosProfessor());
    }
}
