package NivelIntermediario.DesafiosFiasco;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void mostrarInformacoes(){
        System.out.println("Me chamo: " + nome + "\nTenho " + idade + " anos de idade.\nMinha missão é " + missao + " do nivel " + nivelDificuldade + " com o Status: " + statusMissao);
    }
}