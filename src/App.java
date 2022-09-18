import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        Paciente paciente1 = new Paciente();
        System.out.println("Nome: ");
        paciente1.nome = in.nextLine();
        System.out.println("RG: ");
        paciente1.rg = in.nextLine();
        System.out.println("Endereço: ");
        paciente1.endereco = in.nextLine();
        System.out.println("Telefone: ");
        paciente1.telefone = in.nextLine();
        System.out.println("Ano de nascimento: ");
        paciente1.anoNascimento = in.nextInt();
        in.nextLine();
        System.out.println("Profissão: ");
        paciente1.profissao = in.nextLine();

        paciente1.cadastraDados();

        paciente1.imprimeDados();

        System.out.println("Idade: "+ paciente1.calculaIdade());

        System.out.println("Nome: ");
        String nome = in.nextLine();
        Paciente paciente2 = new Paciente(nome);
        System.out.println("RG: ");
        paciente2.rg = in.nextLine();
        System.out.println("Endereço: ");
        paciente2.endereco = in.nextLine();
        System.out.println("Telefone: ");
        paciente2.telefone = in.nextLine();
        System.out.println("Ano de nascimento: ");
        paciente2.anoNascimento = in.nextInt();
        in.nextLine();
        System.out.println("Profissão: ");
        paciente2.profissao = in.nextLine();

        paciente2.cadastraDados();

        paciente2.imprimeDados();

        System.out.println("Idade: "+ paciente2.calculaIdade());

        in.close();
    }
}
