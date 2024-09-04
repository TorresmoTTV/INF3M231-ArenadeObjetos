package arenadeobjetos;

import java.util.Scanner;

public class ArenaDeObjetos {
    static Scanner ler = new Scanner(System.in);

    public static int lerInt() {
        Scanner ler = new Scanner(System.in);
        int num = 99;
        try {// o que pode dar erro
            num = ler.nextInt();
        } catch (Exception e) {// tratar erro
            System.out.print("Tente novamente: ");
            lerInt();
        }
        ler.close();
        return num;
    }

    public static void main(String[] args) {

    }

    public static void menuP() {// menu principal
        String menu = "1 - Criar Personagens"
                + "\n2 - Listar Personagens"
                + "\n3 - Batalha"
                + "\n0 - Sair do Jogo"
                + "\nDigite a opção que deseja: ";

        System.out.print(menu);
    }

    public static void subMenuP(int omP) {
        String subMenu;

        switch (omP) {
            case 1:

                break;

            case 2:

                break;
            case 3:

                break;
            default:
                break;
        }
        System.out.print(omP);
    }
}
