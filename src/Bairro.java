public class Bairro {
    public static void main(String[] args) {
        Apartamento mcmv = new Apartamento("Vermelho", 2, "Seu Barriga", true, true, "B", 12);
        System.out.println(mcmv.getBloco());
        System.out.println(mcmv.getNoApart());
        System.out.println(mcmv.getCorDaParede());
        System.out.println("Número de Quartos: " + mcmv.getNoQuartos());
        System.out.println("Nome do Proprietário: " + mcmv.getNomeProprietario());

        Casa casaDeCampo = new Casa("Amarela", 5, "Isaac Silva");
        // casaDeCampo.setCorDaParede("Amarela");
        // casaDeCampo.setNoQuartos(5);
        System.out.println(casaDeCampo.getCorDaParede());
        System.out.println("Número de Quartos: " + casaDeCampo.getNoQuartos());
        System.out.println("Nome do Proprietário: " + casaDeCampo.getNomeProprietario());

        Casa casaDeVeraneio = new Casa("Azul", 6, "Sandra Marques");
        // casaDeVeraneio.setCorDaParede("Azul");
        // casaDeVeraneio.setNoQuartos(6);
        System.out.println(casaDeVeraneio.getCorDaParede());
        System.out.println("Número de Quartos: " + casaDeVeraneio.getNoQuartos());
        System.out.println("Nome do Proprietário: " + casaDeVeraneio.getNomeProprietario());

        Casa casaTosca = new Casa("Verde", 0, "Thiago Sobral");
        // casaTosca.setNoQuartos(0);
        System.out.println(casaTosca.getCorDaParede());
        System.out.println("Número de Quartos: " + casaTosca.getNoQuartos());
        System.out.println("Nome do Proprietário: " + casaTosca.getNomeProprietario());
    }
}