package AtividadeSobrecargaDeMetodos.src;

public class Principal {
    public static void main(String[] args) {
        Funcionario2 f1 = new Funcionario2();
        f1.setNome("Antonio Lucas");

        f1.tirarFerias(10);
        f1.tirarFerias();
    }
}
