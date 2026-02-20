package ECommerce;
import java.util.List;

public class Comprador {
 private String nome;
 private List<Pedido> pedidos;

    public Comprador(String nome, List<Pedido> pedidos) {
        this.nome = nome;
        this.pedidos = pedidos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
