package arenadeobjetos;

import java.util.ArrayList;
import java.util.Scanner;

import model.Guerreiro;
import model.Ladrao;
import model.Pessoa;

public class ArenaDeObjetos {
    // escopo Global
    static Scanner ler = new Scanner(System.in);
    static int opMP;

    static ArrayList<Guerreiro> guerreiros = new ArrayList<>();
    static ArrayList<Ladrao> ladroes = new ArrayList<>();
    static ArrayList<Pessoa> pessoa = new ArrayList<>();

    public static int lerInt() {
        Scanner ler = new Scanner(System.in);
        int num = 99;
        try {// o que pode dar erro
            num = ler.nextInt();
        } catch (Exception e) {// tratar erro
            System.out.print("Tente novamente: ");
            lerInt();
        }
        // ler.close();
        return num;
    }

    public static void main(String[] args) {
        System.out.println(".:Arena de Objetos:.");
        do {
            menuP();
            subMenuP(opMP);
        } while (opMP != 0);
    }

    public static void menuP() {// menu principal
        String menu = "1 - Criar Personagens"
                + "\n2 - Listar Personagens"
                + "\n3 - Batalha"
                + "\n0 - Sair do Jogo"
                + "\nDigite a opção que deseja: ";

        System.out.print(menu);
        opMP = lerInt();
    }

    public static void subMenuP(int omP) {
        System.out.println(".:SubMenu:.");
        switch (omP) {
            case 1:
                System.out.print("1 - Guerreiro"
                        + "\n2 - Ladrão"
                        + "\n3 - Vitima"
                        + "\nDigite a opção: ");
                int opSM = lerInt();
                criarPersona(opSM);
                break;
            case 2:
                System.out.println(".:Lista de Personagens:.");
                System.out.println(guerreiros.toString());
                break;
            case 3:

                break;
            case 0:
                System.out.println("Arena de Objetos encerrado pelo usuário.");
                break;
            default:
                System.out.println("Opção inválida, tente novamente!");
                menuP();
                break;
        }
    }

    private static void criarPersona(int opSM) {
        switch (opSM) {
            case 1:
                System.out.println(".:Criar Guerreiro:.");
                Guerreiro g = new Guerreiro();
                System.out.print("Digite o nome do Guerreiro: ");
                g.setNome(ler.nextLine());
                System.out.print("Digite a cor do olho: ");
                g.setOlho(ler.nextLine());
                System.out.print("Digite a cor do cabelo: ");
                g.setCabelo(ler.nextLine());
                System.out.print("Digite a cor da pele: ");
                g.setPele(ler.nextLine());
                System.out.print("Digite o sexo: "
                        + "\n0 - Feminino"
                        + "\n1 - Masculino: ");
                int sexoInt = lerInt();
                boolean sexo = false;
                if (sexoInt == 1) {
                    sexo = true;// masculino
                }
                g.setSexo(sexo);
                System.out.print("Digite o armamento: ");
                g.setArmamento(ler.nextLine());
                guerreiros.add(g);
                break;
            case 2:
                System.out.println(".:Criar Ladrão:.");
                break;
            case 3:
                System.out.println(".:Criar Pessoa:.");
                break;
            default:
                System.out.println("Opção inválida, tente novamente!");
                subMenuP(opMP);
                break;
        }
    }
}
