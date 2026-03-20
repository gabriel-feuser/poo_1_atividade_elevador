public class main {
    public static void main(String[] args) {

        elevador elevador = new elevador(3);

        elevador.mostrarEstadoPorta();
        elevador.mostrarAndarAtual();
        elevador.descer();

        elevador.abrirPorta();
        elevador.subir();

        elevador.fecharPorta();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();

        elevador.abrirPorta();
        elevador.descer();

        elevador.mostrarAndarAtual();

        elevador.mostrarEstadoPorta();

        elevador.fecharPorta();
        elevador.descer();
        elevador.descer();
        elevador.descer();
        elevador.descer();
        elevador.abrirPorta();
    }
}