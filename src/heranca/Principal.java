package heranca;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Aluno a1 = new Aluno(); //instânciando a classe aluno
        Professor p1 = new Professor(); //instânciando a classe professor
        Scanner texto = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        a1.setNome(texto.nextLine());
        
        System.out.println("Digite o RG do aluno: ");
        a1.setRg(texto.nextLine());
        
        System.out.println("Digite o CPF do aluno: ");
        a1.setCpf(texto.nextLine());
        
        System.out.println("Digite o endereço do aluno: ");
        a1.setEndereco(texto.nextLine());
        
        System.out.println("Digite o Registro do Aluno: ");
        a1.setRegistroAluno(num.nextInt());
        
        System.out.println("Digite a nota do Vestibular: ");
        a1.setNotaVestibular(num.nextFloat());
        
        System.out.println("Digite o curso: ");
        a1.setCurso(texto.nextLine());
        
        System.out.println("Digite a data da matrícula: ");
        a1.setDataMatricula(texto.nextLine());
        
        
        System.out.println("Digite o nome do Professor: ");
        p1.setNome(texto.nextLine());
        
        System.out.println("Digite o rg do Professor: ");
        p1.setRg(texto.nextLine());
        
        System.out.println("Digite o CPF do professor: ");
        p1.setCpf(texto.nextLine());
        
        System.out.println("Digite o endereço do professor: ");
        p1.setEndereco(texto.nextLine());
        
        System.out.println("Digite a matrícula do professor: ");
        p1.setMatriculaProfessor(num.nextInt());
        
        System.out.println("Digite a data de Admissão: ");
        p1.setDataAdmissao(texto.nextLine());
        
        System.out.println("Digite o salário/hora do professor: ");
        p1.setSalarioHorista(num.nextDouble());
        
        
        System.out.println("\t - Dados do Aluno RA nº: " + a1.getRegistroAluno() + "-\n" );
        System.out.println(a1.retornaDadosAluno());
        
        System.out.println("\t - Dados do Professor Matrícula nº: " + p1.getMatriculaProfessor() + "-\n" );
        System.out.println(p1.retornaDadosProfessor());
    }
}
