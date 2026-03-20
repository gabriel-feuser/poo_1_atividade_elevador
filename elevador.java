public class elevador {

    private int andarAtual;
    private final int totalAndares;
    private boolean portaAberta;

    public elevador(int totalAndares) {
        this.totalAndares = totalAndares;
        this.andarAtual = 0; // térreo
        this.portaAberta = false;
    }

    public void subir() {
        if (portaAberta) {
            System.out.println("Não é possível subir com a porta aberta.");
        } else if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subiu para o andar " + andarAtual);
        } else {
            System.out.println("O elevador já está no último andar.");
        }
    }

    public void descer() {
        if (portaAberta) {
            System.out.println("Não é possível descer com a porta aberta.");
        } else if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Desceu para o andar " + andarAtual);
        } else {
            System.out.println("O elevador já está no térreo.");
        }
    }

    public void abrirPorta() {
        portaAberta = true;
        System.out.println("Porta aberta.");
    }

    public void fecharPorta() {
        portaAberta = false;
        System.out.println("Porta fechada.");
    }

    public void mostrarAndarAtual() {
        System.out.println("Andar atual: " + andarAtual);
    }

    public void mostrarEstadoPorta() {
        if (portaAberta) {
            System.out.println("A porta está aberta.");
        } else {
            System.out.println("A porta está fechada.");
        }
    }
}