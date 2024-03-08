package heranca;

public class Pessoa {

    private String nome;
    private String rg;
    private String cpf;
    private String endereco;

    public String retornaDados() { //método
        String dados = "";

        dados += "Nome: " + getNome() + "\n"; //concatenação para strings (valores numéricos são diferentes
        dados += "RG: " + getRg() + "\n";
        dados += "CPF: " + getCpf() + "\n";
        dados += "Endere�o: " + getEndereco() + "\n";
        
        return dados; //retorno da variável que guardou as informações em String
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
