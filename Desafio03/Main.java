package NivelIntermediario.DesafiosFiasco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner caixaDeTexto = new Scanner(System.in);


        // objeto Naruto
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 16;
        Naruto.missao = "socorrer o Jiraya";
        Naruto.nivelDificuldade = "D";
        Naruto.statusMissao = "Não concluída";
        Naruto.habilidadeEspecial = "Modo Sabio"; //metodo de habilidade
        Naruto.mostrarHabilidadeEspecial();

        // objeto Sasuke
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.missao = "resgatar o Kakashi";
        Sasuke.nivelDificuldade = "C";
        Sasuke.statusMissao = "Concluída";
        Sasuke.habilidadeEspecial = "Sharingan"; //metodo de habilidade
        Sasuke.mostrarHabilidadeEspecial();


        // menu de informações
        System.out.println("_____________MENU DE INFORMAÇÕES_____________");
        System.out.println("1- Lista de Ninjas presente no sistema.");
        System.out.println("2- Informações de um Ninja.");
        System.out.println("3- Adicionar um novo Ninja.");
        System.out.println("4- Atualizar habilidade especial de um Ninja.");
        System.out.println("5- Sair.");
        System.out.println("_______________________________________________");
        System.out.print("Escolha uma opção: ");
        int escolhaDoUsuario = caixaDeTexto.nextInt();
        System.out.println("O usuário escolheu a opção: " + escolhaDoUsuario);

        String entrada = caixaDeTexto.nextLine();

        // funcionamento do Menu
        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("Lista de Ninjas:");
                System.out.println(Sasuke.nome + "\n" + Naruto.nome);
                break;
            case 2:
                System.out.println("De qual Ninja vocé deseja saber as informações? ");
                System.out.println("1- Sasuke Uchiha\n2- Naruto Uzumaki");
                int escolhaDoNinja = caixaDeTexto.nextInt();
                System.out.println("O usuário escolheu a opção: " + escolhaDoNinja);
                entrada = caixaDeTexto.nextLine();
                switch (escolhaDoNinja) {
                    case 1:
                        Sasuke.mostrarInformacoes();
                        break;
                    case 2:
                        Naruto.mostrarInformacoes();
                        break;
                    default:
                        System.out.println("Opção invalida!");
                }
                break;
            case 3:
                System.out.println("_______Adicionar um novo Ninja:_______");
                Ninja NovoNinja = new Ninja();

                System.out.println("Digite as informações do Ninja abaixo. ");
                System.out.println("Qual o nome do Ninja? ");
                NovoNinja.nome = caixaDeTexto.nextLine();
                entrada = caixaDeTexto.nextLine();

                System.out.println("Qual a idade do Ninja? ");
                NovoNinja.idade = caixaDeTexto.nextInt();
                entrada = caixaDeTexto.nextLine();

                System.out.println("Qual a missão do Ninja? ");
                NovoNinja.missao = caixaDeTexto.nextLine();
                entrada = caixaDeTexto.nextLine();

                System.out.println("Qual o nível da missão do Ninja? ");
                NovoNinja.nivelDificuldade = caixaDeTexto.nextLine();
                entrada = caixaDeTexto.nextLine();

                System.out.println("Qual o status da missão do Ninja? ");
                NovoNinja.statusMissao = caixaDeTexto.nextLine();
                entrada = caixaDeTexto.nextLine();
                NovoNinja.mostrarInformacoes();

                break;
            case 4:
                System.out.println("_______Atualizar habilidade especial de um Ninja_______");
                System.out.println("Qual ninja você deseja atualizar a habilidade especial? ");
                System.out.println("1- Sasuke Uchiha\n2- Naruto Uzumaki");
                System.out.println("Escolha uma opção: ");
                int escolhaDoNinjaParaAtualizarHabilidade = caixaDeTexto.nextInt();
                switch (escolhaDoNinjaParaAtualizarHabilidade) {
                    case 1:
                        System.out.println("Você escolheu o Sasuke, qual será sua nova habilidade?");
                        entrada = caixaDeTexto.nextLine();
                        Sasuke.habilidadeEspecial = caixaDeTexto.nextLine();
                        System.out.println("A nova habilidade especial de Sasuke é: " + Sasuke.habilidadeEspecial);
                        break;
                    case 2:
                        System.out.println("Você escolheu o Sasuke, qual será sua nova habilidade?");
                        entrada = caixaDeTexto.nextLine();
                        Naruto.habilidadeEspecial = caixaDeTexto.nextLine();
                        System.out.println("A nova habilidade especial de Naruto é: " + Naruto.habilidadeEspecial);
                        break;
                    default:
                        System.out.println("Opção invalida!");
                }
                break;
            case 5:
                System.out.println("Saindo........");
                break;
            default:
                System.out.println("Opção invalida!");


                caixaDeTexto.close();
        }
    }
}