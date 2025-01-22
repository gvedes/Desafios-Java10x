package TiposDeDados.DesafiosFiasco;

public class Desafio01 {
    public static void main(String[] args) {

        // Objetivo: Criar um ninja
        // Primeiro Ninja_
        String primeiroNinja = "Naruto";
        int primeiroNinjaIdade = 16;
        String primeiroNinjaMissa = "Socorrer o Jiraya";
        char primeiraMissaoDificuldade = 'D'; //0 a 10
        String statusPrimeiraMissao = "Nao concluida";

        // Segundo Ninja_
        String segundoNinja = "Sasuke";
        int segundoNinjaIdade = 15;
        String segundoNinjaMissa = "Rasgatar o Kakashi";
        char segundaMissaoDificuldade = 'C'; //0 a 10
        String statusSegundaMissao = "Concluida";

        // Terceiro Ninja_
        String terceiroNinja = "Sakura";
        int terceiroNinjaIdade = 14;
        String terceiroNinjaMissa = "Ir ate a vila da Areia";
        char terceiraMissaoDificuldade = 'D'; //0 a 10
        String statusTerceiraMissao = "Nao concluida";

        //Mais dificuldade
        //Nivel de conclusao por idade

        //Primeiro ninja
        if (primeiroNinjaIdade >= 15) {
            System.out.println("Ninja: " + primeiroNinja + " tem idade suficiente para a missao. Portanto, a missao foi CONCLUIDA");
        } else {
            System.out.println("Ninja: " + primeiroNinja + " nao tem idade suficiente para a missao. Portanto, a missao NAO foi CONCLUIDA");
        }

        //Segundo ninja
        if (segundoNinjaIdade >= 15) {
            System.out.println("Ninja: " + segundoNinja + " tem idade suficiente para a missao. Portanto, a missao foi CONCLUIDA");
        } else {
            System.out.println("Ninja: " + segundoNinja + " nao tem idade suficiente para a missao. Portanto, a missao NAO foi CONCLUIDA");
        }

        //Terceiro Ninja
        if (terceiroNinjaIdade >= 15) {
            System.out.println("Ninja: " + terceiroNinja + " tem idade suficiente para a missao. Portanto, a missao foi CONCLUIDA");
        } else {
            System.out.println("Ninja: " + terceiroNinja + " nao tem idade suficiente para a missao. Portanto, a missao NAO foi CONCLUIDA");
        }
    }
}
