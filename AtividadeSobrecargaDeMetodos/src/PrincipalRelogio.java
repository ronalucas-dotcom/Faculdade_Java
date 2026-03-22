package AtividadeSobrecargaDeMetodos.src;

public class PrincipalRelogio {
    public static void main(String[] args) {
        Relogio r1 = new Relogio();
        Relogio r2 = new Relogio();
        Relogio r3 = new Relogio();

        r1.inicializar(1, 34, 10);

        r2.inicializar(2, 15);

        r3.inicializar(12);

        r1.mostrarhora();
        r2.mostrarhora();
        r3.mostrarhora();
    }
}
