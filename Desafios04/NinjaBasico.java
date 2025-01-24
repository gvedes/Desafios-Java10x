package NivelIntermediario.DesafioFiasco4;

public class NinjaBasico implements Ninja {

    String nome;
    int idade;
    String cla;
    String habilidade;

    public enum TipoHabilidade {
        TAIJUTSU, NINJUTSU, GENJUTSU, KATON, RINNENGAN
    }

    public NinjaBasico(String nome, int idade, String cla, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.cla = cla;
        this.habilidade = habilidade;
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + this.nome + "\nIdade: " + this.idade + "\nClasse: " + this.cla);
    }

    public void executarHabilidade() {
        System.out.println("Minha habilidade é " + this.habilidade);
    }


}