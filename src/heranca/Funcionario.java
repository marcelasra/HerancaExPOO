package heranca;

public class Funcionario extends Pessoa {

    private int matriculaFuncionario;
    private String dataAdmissaoF;
    private double salarioMensal;

    public String retornaDadosFuncionario() {
        String dados;

        dados = super.retornaDados();
        
        dados += "Matrí­cula do Funcionário: " + getMatriculaFuncionario() + "\n";
        dados += "Data da Admissão: " + getDataAdmissaoF() + "\n";
        dados += "Salário Mensal: " + getSalarioMensal() + "\n";

        
        return dados;

    }

    public int getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario(int matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public String getDataAdmissaoF() {
        return dataAdmissaoF;
    }

    public void setDataAdmissaoF(String dataAdmissaoF) {
        this.dataAdmissaoF = dataAdmissaoF;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
