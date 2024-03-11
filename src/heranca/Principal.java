package heranca;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Aluno a1 = new Aluno(); //instânciando a classe aluno
        Professor p1 = new Professor(); //instânciando a classe professor
        Funcionario f1 = new Funcionario();
        Scanner texto = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<String>();

        System.out.println("Bem vindo ao cadastro do Senac!");
        System.out.println("Gostaria de fazer o cadastro de um aluno?\nDigite: [0] - não. [1] - sim");
        int valorAluno = num.nextInt();

        if (valorAluno == 1) {
            System.out.println("Quantos alunos iram ser cadastrados?");
            int qtdAluno = num.nextInt();

            for (int i = 0; i < qtdAluno; i++) {
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

                lista.add(a1.retornaDadosAluno());
            }
        }
        System.out.println("Gostaria de fazer o cadastro de um Professor?\nDigite: [0] - não. [1] - sim");
        int valorProfessor = num.nextInt();

        if (valorProfessor == 1) {
            System.out.println("Quantos Professores iram ser cadastrados?");
            int qtdProfessor = num.nextInt();

            for (int i = 0; i < qtdProfessor; i++) {

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

                lista.add(p1.retornaDadosProfessor());
            }
        }
        System.out.println("Gostaria de fazer o cadastro de um funcionário?\nDigite: [0] - não. [1] - sim");
        int valorFuncionario = num.nextInt();

        if (valorFuncionario == 1) {
            System.out.println("Quantos funcionários iram ser cadastrados?");
            int qtdFuncionario = num.nextInt();

            for (int i = 0; i < qtdFuncionario; i++) {

                System.out.println("Digite o nome do Funcionário: ");
                f1.setNome(texto.nextLine());

                System.out.println("Digite o RG do Funcionário: ");
                f1.setRg(texto.nextLine());

                System.out.println("Digite o CPF do Funcionário: ");
                f1.setCpf(texto.nextLine());

                System.out.println("Digite o endereço do Funcionário: ");
                f1.setEndereco(texto.nextLine());

                System.out.println("Digite a matrícula do Funcionário: ");
                f1.setMatriculaFuncionario(num.nextInt());

                System.out.println("Digite a data de admissão do Funcionário: ");
                f1.setDataAdmissaoF(texto.nextLine());

                System.out.println("Digite o salário mensal do Funcionário: ");
                f1.setSalarioMensal(texto.nextDouble());

                lista.add(f1.retornaDadosFuncionario());

            }
        }
        for (String i:lista){
            System.out.println(i);
        }
        
        texto.close();
        num.close();
    }
}
