package Jogo;

import java.util.*;

public class Player {
    public Player() {
    }

    private String nome;
    private Itens item;
    static List<Itens> inventario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Itens getItem() {
        return item;
    }

    public void setItem(Itens item) {
        this.item = item;
    }

    public static List<Itens> getInventario() {
        return inventario;
    }

    public static void setInventario(List<Itens> inventario) {
        Player.inventario = inventario;
    }
}
