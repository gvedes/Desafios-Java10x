package NivelBasico.TiposDeDados.DesafiosFiasco;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {

        // Entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Fazer o array
        int NUMERO_MAX = 10;
        String[] ninjas = new String[NUMERO_MAX];

        int ninjasCadastrados = 0; //ninjas cadastrados
        int opcao = 0; //contador de opcao

        while(opcao != 3)
        {
            // MENU
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer:


            switch (opcao)
            {
                case 1:
                    if (ninjasCadastrados < NUMERO_MAX)
                    {
                        System.out.println("Digite o nome do ninja para cadastro: ");
                        String nomeNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso");
                    }
                    else
                    {
                        System.out.println("A lista de ninjas esta cheia. Impossivel cadastrar um novo ninja.");
                    }
                    break;

                case 2:
                    if (ninjasCadastrados == 0){
                        System.out.println("Nenhum ninja encontrado.");
                    } else {
                        System.out.println("____________Lista de ninjas____________");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                        break;
                    }

                case 3:
                    System.out.println("Estamos terminando o programa...Aguarde");
                    break;

                default:
                    System.out.println("Essa opção é invalida.");
                    break;
            }
            }
        }

    }