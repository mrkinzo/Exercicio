 package Jogo;
 import java.util.*;
public class Player {
    Itens item;
    static List<Itens> inventario;
    public static void main(String[] args) {
        Itens item =new Itens("cajado");
        Itens item2=new Itens("Wilson");
        inventario.add(item2);
        inventario.add(item);
        
    }
}
