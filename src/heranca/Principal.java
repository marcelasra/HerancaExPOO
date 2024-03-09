package heranca;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Aluno a1 = new Aluno(); //inst�nciando a classe aluno
        Professor p1 = new Professor(); //inst�nciando a classe professor
        Funcionario f1 = new Funcionario();
        Scanner texto = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        System.out.println("Bem vindo ao cadastro do Senac!");
        System.out.println("Escolha uma op��o a seguir: \n[0]- Aluno\n[1]- Professor\n[2]- Funcion�rio\n:");
        int valor = num.nextInt();

        if (valor == 0) {
            System.out.println("Digite o nome do aluno: ");
            a1.setNome(texto.nextLine());

            System.out.println("Digite o RG do aluno: ");
            a1.setRg(texto.nextLine());

            System.out.println("Digite o CPF do aluno: ");
            a1.setCpf(texto.nextLine());

            System.out.println("Digite o endere�o do aluno: ");
            a1.setEndereco(texto.nextLine());

            System.out.println("Digite o Registro do Aluno: ");
            a1.setRegistroAluno(num.nextInt());

            System.out.println("Digite a nota do Vestibular: ");
            a1.setNotaVestibular(num.nextFloat());

            System.out.println("Digite o curso: ");
            a1.setCurso(texto.nextLine());

            System.out.println("Digite a data da matr�cula: ");
            a1.setDataMatricula(texto.nextLine());

            System.out.println("\t - Dados do Aluno RA n�: " + a1.getRegistroAluno() + "-\n");
            System.out.println(a1.retornaDadosAluno());
        }
        if (valor == 1) {

            System.out.println("Digite o nome do Professor: ");
            p1.setNome(texto.nextLine());

            System.out.println("Digite o rg do Professor: ");
            p1.setRg(texto.nextLine());

            System.out.println("Digite o CPF do professor: ");
            p1.setCpf(texto.nextLine());

            System.out.println("Digite o endere�o do professor: ");
            p1.setEndereco(texto.nextLine());

            System.out.println("Digite a matr�cula do professor: ");
            p1.setMatriculaProfessor(num.nextInt());

            System.out.println("Digite a data de Admiss�o: ");
            p1.setDataAdmissao(texto.nextLine());

            System.out.println("Digite o sal�rio/hora do professor: ");
            p1.setSalarioHorista(num.nextDouble());

            System.out.println("\t - Dados do Professor Matr�cula n�: " + p1.getMatriculaProfessor() + "-\n");
            System.out.println(p1.retornaDadosProfessor());
        }
        if (valor == 2) {

            System.out.println("Digite o nome do Funcion�rio: ");
            f1.setNome(texto.nextLine());

            System.out.println("Digite o RG do Funcion�rio: ");
            f1.setRg(texto.nextLine());

            System.out.println("Digite o CPF do Funcion�rio: ");
            f1.setCpf(texto.nextLine());

            System.out.println("Digite o endere�o do Funcion�rio: ");
            f1.setEndereco(texto.nextLine());

            System.out.println("Digite o nome do Funcion�rio: ");
            f1.setMatriculaFuncionario(num.nextInt());

            System.out.println("Digite o nome do Funcion�rio: ");
            f1.setDataAdmissaoF(texto.nextLine());

            System.out.println("Digite o sal�rio mensal do Funcion�rio: ");
            f1.setSalarioMensal(texto.nextDouble());

            System.out.println("\t - Dados do Funcionario Matr�cula n�: " + f1.getMatriculaFuncionario() + "-\n");
            System.out.println(f1.retornaDadosFuncionario());
        } else {
            System.out.println("O valor informado n�o existe, por gentileza tentar novamente!");
        }
    }
}
