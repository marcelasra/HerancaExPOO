package heranca;

public class Professor extends Pessoa { //extends indica a extenção de classe (herança)

private int matriculaProfessor;
private String dataAdmissao;
private double salarioHorista;

public String retornaDadosProfessor(){
  String dados;
  
  dados = super.retornaDados(); //
  
  dados += "Matrícula do Professor: " + getMatriculaProfessor() + "\n";
  dados += "Data Admissão: " + getDataAdmissao() + "\n";
  dados += "Salário Horista: " + getSalarioHorista() + "\n";
  
  return dados;
}

    public int getMatriculaProfessor() {
        return matriculaProfessor;
    }

    public void setMatriculaProfessor(int matriculaProfessor) {
        this.matriculaProfessor = matriculaProfessor;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalarioHorista() {
        return salarioHorista;
    }

    public void setSalarioHorista(double salarioHorista) {
        this.salarioHorista = salarioHorista;
    }


}
