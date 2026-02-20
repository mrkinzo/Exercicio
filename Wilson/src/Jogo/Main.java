package Jogo;

import java.util.Scanner;

public class Main {
    final static Scanner LER = new Scanner(System.in);
public static void main(String[] args) {
    Guilda guilda = new Guilda();
    Player player1 = new Player();
    player1.setNome("Wilson");
    Itens item1 = new Itens("Espada");
    item1.setEquipado(true);
    guilda.getMembros().add(player1);

    switch(LER.nextInt()){
        case 1:
            System.out.println("Inventário do jogador: " + player1.getNome());
            for (Itens item : Player.getInventario()) {
                System.out.println("- " + item.getNome() + (item.isEquipado() ? " (Equipado)" : ""));
            }
            break;
        case 2:
            System.out.println("Membros da guilda:");
            for (Player membro : guilda.getMembros()) {
                System.out.println("- " + membro.getNome());
            }
            break;
        default:
            System.out.println("Opção inválida.");
    }
}
}
