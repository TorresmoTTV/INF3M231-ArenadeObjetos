package arenadeobjetos;

import java.util.ArrayList;
import java.util.Scanner;

import model.Guerreiro;
import model.Ladrao;
import model.Pessoa;
import servicos.ServicosFactory;
import servicos.VitimaServicos;

public class ArenaDeObjetos {
    // escopo Global
    static Scanner ler = new Scanner(System.in);
    static int opMP;

    static ArrayList<Guerreiro> guerreiros = new ArrayList<>();
    static ArrayList<Ladrao> ladroes = new ArrayList<>();
    static ArrayList<Pessoa> pessoas = new ArrayList<>();

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
                System.out.println("Lista Bonita");
                for (Guerreiro g : guerreiros) {
                    System.out.println(g.getNome());
                    System.out.println("\t" + g.getArmamento());// \t tabulação
                    System.out.println("\t" + g.getPontosDeVida());// \t tabulação
                }
                for (Ladrao l : ladroes) {
                    System.out.println(l.getNome());
                    System.out.println("\t" + l.getPlanoDeFuga());// \t tabulação
                    System.out.println("\t" + l.getPontosDeVida());// \t tabulação
                }
                for (Pessoa p : pessoas) {
                    System.out.println(p.getNome());
                    System.out.println("\t" + p.getPontosDeVida());// \t tabulação
                }
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
                int sexoIntG = lerInt();
                boolean sexoG = false;
                if (sexoIntG == 1) {
                    sexoG = true;// masculino
                }
                g.setSexo(sexoG);

                System.out.print("Digite o armamento: ");
                g.setArmamento(ler.nextLine());

                guerreiros.add(g);
                break;
            case 2:
                System.out.println(".:Criar Ladrão:.");
                Ladrao ladrao = new Ladrao();

                System.out.print("Digite o nome do Ladrão: ");
                ladrao.setNome(ler.nextLine());

                System.out.print("Digite a cor do olho: ");
                ladrao.setOlho(ler.nextLine());

                System.out.print("Digite a cor do cabelo: ");
                ladrao.setCabelo(ler.nextLine());

                System.out.print("Digite a cor da pele: ");
                ladrao.setPele(ler.nextLine());

                System.out.print("Digite o sexo: "
                        + "\n0 - Feminino"
                        + "\n1 - Masculino: ");
                int sexoIntL = lerInt();
                boolean sexoL = false;
                if (sexoIntL == 1) {
                    sexoL = true;// masculino
                }
                ladrao.setSexo(sexoL);
                System.out.print("Digite o plano de fuga: ");
                ladrao.setPlanoDeFuga(ler.nextLine());

                ladroes.add(ladrao);
                break;
            case 3:
                System.out.println(".:Criar Vítima:.");
                Pessoa v = new Pessoa();

                System.out.print("Digite o nome da Vítima: ");
                v.setNome(ler.nextLine());

                System.out.print("Digite a cor do olho: ");
                v.setOlho(ler.nextLine());

                System.out.print("Digite a cor do cabelo: ");
                v.setCabelo(ler.nextLine());

                System.out.print("Digite a cor da pele: ");
                v.setPele(ler.nextLine());

                System.out.print("Digite o sexo: "
                        + "\n0 - Feminino"
                        + "\n1 - Masculino: ");
                int sexoIntV = lerInt();
                boolean sexoV = false;
                if (sexoIntV == 1) {
                    sexoV = true;// masculino
                }
                v.setSexo(sexoV);
                pessoas.add(v);// add Vitima no ArrayList
                // Instanciar Vitima Serviços
                VitimaServicos vs = ServicosFactory.getVitimaServicos();
                // envia para o Banco
                vs.cadastrarVitima(v);
                break;
            default:
                System.out.println("Opção inválida, tente novamente!");
                subMenuP(opMP);
                break;
        }
    }
}
