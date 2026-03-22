package AtividadeSobrecargaDeMetodos.src;

import java.sql.Date;

public class Funcionario2 {
    private String nome;
    private Date dataAdmissao;
    private double salario;
    private int identificador;

    private static int proximoId = 1;

    public Funcionario2() {
        this.identificador = proximoId;
        proximoId++;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataAdmissao() {
        return this.dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        Date hoje = new Date(System.currentTimeMillis());

        if (dataAdmissao.after(hoje)) {
            throw new IllegalArgumentException("Data de admissão não pode ser futura");
        }
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        if (salario < 1100) {
            throw new IllegalArgumentException("Salário deve ser no mínimo R$ 1.100,00");
        }
        this.salario = salario;
    }

    public int getIndentificador(){
        return identificador;
    }

    public void tirarFerias(){
        tirarFerias(30);
    }

    public void tirarFerias(int dias){
        System.out.println("o funcionario" + this.getNome() + "vai tirar " + dias + " dias de férias");
    }

}

