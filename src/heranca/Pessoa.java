package heranca;

public class Pessoa {

    String nome, rg, cpf;

    public String retornaDados() { //método
        String dados = "";

        dados += "Nome: " + nome + "\n"; //concatenação para strings (valores numéricos são diferentes
        dados += "RG: " + rg + "\n";
        dados += "CPF: " + cpf + "\n";
        
        return dados; //retorno da variável que guardou as informações em String
    }
}
