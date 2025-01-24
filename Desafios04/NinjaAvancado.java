package NivelIntermediario.DesafioFiasco4;

public class NinjaAvancado implements Ninja{

        String nome;
        int idade;
        String cla;
        String habilidade;
        String especiliadade;

    public enum TipoHabilidade {
        TAIJUTSU, NINJUTSU, GENJUTSU, KATON, RINNENGAN
    }

    public NinjaAvancado(String nome, int idade, String cla, String habilidade, String especiliadade) {
        this.nome = nome;
        this.idade = idade;
        this.cla = cla;
        this.habilidade = habilidade;
        this.especiliadade = especiliadade;
    }

    public void mostrarInfo() {
            System.out.println("Nome: " + this.nome + "\nIdade: " + this.idade + "\nClasse: " + this.cla);
        }

        @Override
        public void executarHabilidade() {
            System.out.println("Minha habilidade é " + this.habilidade + " e minha especialidade é " + this.especiliadade);
        }
    }

