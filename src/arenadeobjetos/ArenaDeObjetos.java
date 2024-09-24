package arenadeobjetos;

import java.util.ArrayList;
import java.util.Scanner;

import model.Guerreiro;
import model.Ladrao;
import model.Pessoa;
import servicos.GuerreiroServicos;
import servicos.LadraoServicos;
import servicos.ServicosFactory;
import servicos.VitimaServicos;
import view.Principal;

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
        /*System.out.println(".:Arena de Objetos:.");
        do {
            menuP();
            subMenuP(opMP);
        } while (opMP != 0);*/
        Principal janelaP = new Principal();
        janelaP.setVisible(true);    
        
    }

    public static void menuP() {// menu principal
        String menu = "1 - Criar Personagens"
                + "\n2 - Listar Vitimas"
                + "\n3 - Listar Guerreiro"
                + "\n4 - Listar Ladrão"
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
                System.out.println(pessoas.toString());
                System.out.println("Lista Bonita");
                for (Pessoa p : pessoas) {
                    System.out.println(p.getNome());
                    System.out.println("\t" + p.getPontosDeVida());// \t tabulação
                }
                System.out.println("--- Vítimas RAM ---");
                System.out.println(pessoas.toString());
                System.out.println("--- Vitimas do Banco de Dados ---");
                VitimaServicos vs = ServicosFactory.getVitimaServicos();
                System.out.println(vs.listaVitimas().toString());

                System.out.println("-- Teste de Busca por nome --");
                System.out.println(vs.buscaVitimaByNome("%Lula%").toString());

                // teste de update
                // busca vitima
                Pessoa vUp = vs.buscaVitimaByNome("%Lula%");
                // Atualiza cor do cabelo
                vUp.setCabelo("Nao possui");
                // Executa atualizacao no banco
                vs.atualizaVitima(vUp);

                System.out.println("-- Vitima atualizada --");
                System.out.println(vs.buscaVitimaByNome("%Lula%").toString());

                // Teste de Delete
                System.out.println("-- Deletar vitima lula --");
                int id = vs.buscaVitimaByNome("%Lula%").getId();
                // Executa atualização no banco
                if (vs.deletarVitima(id)) {
                    System.out.println("Vitima deletada!");
                } else {
                    System.out.println("Vitima não deletada");
                }
                break;
            case 3:
                System.out.println(".:Lista de Guerreiros:.");
                System.out.println(guerreiros.toString());
                System.out.println("Lista Bonita");
                for (Guerreiro g : guerreiros) {
                    System.out.println(g.getNome());
                    System.out.println("\t" + g.getArmamento());// \t tabulação
                    System.out.println("\t" + g.getPontosDeVida());// \t tabulação
                }
                System.out.println("--- Guerreiros RAM ---");
                System.out.println(guerreiros.toString());
                System.out.println("--- Guerreiros do Banco de Dados ---");
                GuerreiroServicos gs = ServicosFactory.getGuerreiroServicos();
                System.out.println(gs.listaGuerreiros().toString());

                System.out.println("-- Teste de Busca por nome --");
                System.out.println(gs.buscaGuerreiroByNome("%Aleandre%").toString());

                // teste de update
                // busca vitima
                Guerreiro gUp = gs.buscaGuerreiroByNome("%Aleandre%");
                // Atualiza cor do cabelo
                gUp.setCabelo("Peruca");
                // Executa atualizacao no banco
                gs.atualizaGuerreiro(gUp);

                System.out.println("-- Guerreiro atualizado --");
                System.out.println(gs.buscaGuerreiroByNome("%Aleandre%").toString());

                // Teste de Delete
                System.out.println("-- Deletar guerreiro Aleandre --");
                int gid = gs.buscaGuerreiroByNome("%Aleandre%").getId();
                // Executa atualização no banco
                if (gs.deletarGuerreiro(gid)) {
                    System.out.println("Guerreiro deletado!");
                } else {
                    System.out.println("Guerreiro não deletado");
                }
                break;
            case 4:
                System.out.println(".:Lista de Ladroes:.");
                System.out.println(ladroes.toString());
                System.out.println("Lista Bonita");
                for (Ladrao l : ladroes) {
                    System.out.println(l.getNome());
                    System.out.println("\t" + l.getPlanoDeFuga());// \t tabulação
                    System.out.println("\t" + l.getPontosDeVida());// \t tabulação
                }
                System.out.println("--- Ladrao RAM ---");
                System.out.println(ladroes.toString());
                System.out.println("--- Ladrao do Banco de Dados ---");
                LadraoServicos ls = ServicosFactory.getLadraoServicos();
                System.out.println(ls.listaLadroes().toString());

                System.out.println("-- Teste de Busca por nome --");
                System.out.println(ls.buscaLadraoByNome("%Janja%").toString());

                // teste de update
                // busca vitima
                Ladrao lUp = ls.buscaLadraoByNome("%Janja%");
                // Atualiza cor do cabelo
                lUp.setCabelo("Vermelho");
                // Executa atualizacao no banco
                ls.atualizarLadrao(lUp);

                System.out.println("-- Ladrao atualizado --");
                System.out.println(ls.buscaLadraoByNome("%Janja%").toString());

                // Teste de Delete
                System.out.println("-- Deletar ladrao Janja --");
                int lid = ls.buscaLadraoByNome("%Janja%").getId();
                // Executa atualização no banco
                if (ls.deletarLadrao(lid)) {
                    System.out.println("Ladrao deletado!");
                } else {
                    System.out.println("Ladrao não deletado");
                }
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
                GuerreiroServicos gs = ServicosFactory.getGuerreiroServicos();
                // envia para o Banco
                gs.cadastrarGuerreiro(g);
                break;
            case 2:
                System.out.println(".:Criar Ladrão:.");
                Ladrao l = new Ladrao();

                System.out.print("Digite o nome do Ladrão: ");
                l.setNome(ler.nextLine());

                System.out.print("Digite a cor do olho: ");
                l.setOlho(ler.nextLine());

                System.out.print("Digite a cor do cabelo: ");
                l.setCabelo(ler.nextLine());

                System.out.print("Digite a cor da pele: ");
                l.setPele(ler.nextLine());

                System.out.print("Digite o sexo: "
                        + "\n0 - Feminino"
                        + "\n1 - Masculino: ");
                int sexoIntL = lerInt();
                boolean sexoL = false;
                if (sexoIntL == 1) {
                    sexoL = true;// masculino
                }
                l.setSexo(sexoL);
                System.out.print("Digite o plano de fuga: ");
                l.setPlanoDeFuga(ler.nextLine());

                ladroes.add(l);
                LadraoServicos ls = ServicosFactory.getLadraoServicos();
                // envia para o Banco
                ls.cadastrarLadrao(l);
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
