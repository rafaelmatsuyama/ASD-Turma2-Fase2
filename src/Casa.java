public class Casa implements Planta {
    public static void acaoMarketing(){
        System.out.println("Venha visitar as maravilhosas casas do Bairro!");
    }
    public Casa(String corDaParede, int noQuartos, String nomeProprietario) {
        this.corDaParede = corDaParede;
        this.noQuartos = noQuartos;
        this.nomeProprietario = nomeProprietario;
    }

    private int metragem;
    private String corDaParede;
    private int noQuartos = 1;

    private String nomeProprietario;
    public final String getCorDaParede() {
        return corDaParede;
    }

    public void setCorDaParede(String corDaParede) {
        this.corDaParede = corDaParede;
    }

    public int getNoQuartos() {
        return noQuartos;
    }

    public void setNoQuartos(int noQuartos) {
        this.noQuartos = noQuartos;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    @Override
    public int getMetragem() {
        return metragem;
    }

    @Override
    public void setMetragem(int metragem) {
        this.metragem = metragem;
    }
}
