public class Apartamento extends Casa {
    private boolean escadaria;
    private boolean elevador;
    private String bloco;
    private int noApart;
    public Apartamento(String corDaParede, int noQuartos, String nomeProprietario, boolean escadaria, boolean elevador, String bloco, int noApart) {
        super(corDaParede, noQuartos, nomeProprietario);
        this.escadaria = escadaria;
        this.elevador = elevador;
        this.bloco = bloco;
        this.noApart = noApart;
    }

    public boolean isEscadaria() {
        return escadaria;
    }

    public void setEscadaria(boolean escadaria) {
        this.escadaria = escadaria;
    }

    public boolean isElevador() {
        return elevador;
    }

    public void setElevador(boolean elevador) {
        this.elevador = elevador;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public int getNoApart() {
        return noApart;
    }

    public void setNoApart(int noApart) {
        this.noApart = noApart;
    }

    // public String getCorDaParede() {
    //     return "Hahaha! Não sei!";
    // }
}
