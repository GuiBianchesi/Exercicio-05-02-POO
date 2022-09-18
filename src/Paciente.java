import java.time.Year;

public class Paciente {
    String nome;
    String rg;
    String endereco;
    String telefone;
    int anoNascimento;
    String profissao;

public Paciente(){
}

public Paciente(String n){
    nome = n;
}

void cadastraDados(){
    System.out.println("Dados cadastrados!");
}

void imprimeDados(){
    System.out.println("Nome: "+ nome); 
    System.out.println("RG: "+ rg); 
    System.out.println("Endereço: "+ endereco); 
    System.out.println("Telefone: "+ telefone); 
    System.out.println("Ano de Nascimento: "+ anoNascimento); 
    System.out.println("Profissão: "+ profissao); 
}

int calculaIdade(){
    int anoAtual = Year.now().getValue();
    return anoAtual - anoNascimento;
}

}
