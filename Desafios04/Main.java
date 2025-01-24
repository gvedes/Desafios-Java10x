package NivelIntermediario.DesafioFiasco4;

public class Main {
    public static void main(String[] args) {

        NinjaBasico Naruto = new NinjaBasico("Naruto", 20, "Uzumaki", "Modo Sabio");
        Naruto.mostrarInfo();
        Naruto.executarHabilidade();

        NinjaBasico.TipoHabilidade NarutoHab = NinjaBasico.TipoHabilidade.NINJUTSU;
        System.out.println("Tipo de habilidade: " + NarutoHab);


        NinjaAvancado Obito = new NinjaAvancado("Obito", 35, "Uchiha", "Sharingan", "Mangekyo Sharingan");
        Obito.mostrarInfo();
        Obito.executarHabilidade();

        NinjaBasico.TipoHabilidade ObitoHab = NinjaBasico.TipoHabilidade.RINNENGAN;
        System.out.println("Tipo de habilidade: " + ObitoHab);
    }
}
