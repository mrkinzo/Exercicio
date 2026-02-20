package ECommerce;

import java.util.List;

public class Pedido {
    private String pedido;
    private List<Object> produtos;

    public Pedido(String pedido, List<Object> produtos) {
        this.pedido = pedido;
        this.produtos = produtos;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public List<Object> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Object> produtos) {
        this.produtos = produtos;
    }
}
