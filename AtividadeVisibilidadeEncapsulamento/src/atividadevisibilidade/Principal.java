package AtividadeVisibilidadeEncapsulamento.src.atividadevisibilidade;

import java.sql.Date;

public class Principal {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        Funcionario f3 = new Funcionario();

        f1.setNome("antonio");
        f1.setDataAdmissao(Date.valueOf("2020-04-10"));
        f1.setSalario(4567.39);

        f2.setNome("maria");
        f2.setDataAdmissao(Date.valueOf("2021-05-20"));
        f2.setSalario(2409.90);

        f3.setNome("jose");
        f3.setDataAdmissao(Date.valueOf("2023-03-15"));
        f3.setSalario(3800.0);

        System.out.println("Funcionário 1:");
        System.out.println("nome:" + f1.getNome() + " - indenticador: " + f1.getIndentificador());
        System.out.println("data de adimissão:" + f1.getDataAdmissao());
        System.out.println("salario: " + f1.getSalario());

        System.out.println("\nFuncionário 2:");
        System.out.println("nome:" + f2.getNome()+ " - indenticador: " + f2.getIndentificador());
        System.out.println("data de adimissão:" + f2.getDataAdmissao());
        System.out.println("salario: " +f2.getSalario());

        System.out.println("\nFuncionário 3:");
        System.out.println("nome:" + f3.getNome()+ " - indenticador: " + f3.getIndentificador());
        System.out.println("data de adimissão:" + f3.getDataAdmissao());
        System.out.println("salario: " +f3.getSalario());
    }
}
