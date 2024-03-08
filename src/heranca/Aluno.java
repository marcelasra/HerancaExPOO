package heranca;

public class Aluno extends Pessoa{ //extends indica extensão de classe

    private int registroAluno;
    private float notaVestibular;
    private String curso;
    private String dataMatricula;
    
    public String retornaDadosAluno(){
        String dados;
        
        dados = super.retornaDados();
        
        dados += "RA: " + getRegistroAluno() + "\n";
        dados += "Nota do vestibular: " + getNotaVestibular() + "\n";
        dados += "Curso: " + getCurso() + "\n";
        dados += "Data Matrícula: " + getDataMatricula() + "\n";
        
        return dados;
    }

    public int getRegistroAluno() {
        return registroAluno;
    }

    public void setRegistroAluno(int registroAluno) {
        this.registroAluno = registroAluno;
    }

    public float getNotaVestibular() {
        return notaVestibular;
    }

    public void setNotaVestibular(float notaVestibular) {
        this.notaVestibular = notaVestibular;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
        
        
}
