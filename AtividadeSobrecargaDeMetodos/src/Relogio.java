package AtividadeSobrecargaDeMetodos.src;

public class Relogio {
    private int hora;
    private int min;
    private int sec;

    public void inicializar(int hora, int min, int sec){
        this.hora = hora;
        this.min = min;
        this.sec = sec;
    }

    public void inicializar(int hora,int min){
        inicializar(hora, min, 1);
    }

    public void inicializar(int hora){
        inicializar(hora, 1, 1);
    }

    public void mostrarhora(){
        System.out.println(hora+ ":" + min + ":" + sec);
    }
}
