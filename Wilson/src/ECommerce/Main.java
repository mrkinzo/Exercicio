package ECommerce;

public class Main {
public static void main(String[] args) {
    Comprador cliente1 = new Comprador("Alice", null);
    Produto produto1 = new Produto("Smartphone", "TechStore");
    Pedido pedido1 = new Pedido("Pedido001", null);
    pedido1.getProdutos().add(produto1);
    cliente1.getPedidos().add(pedido1);
        System.out.println("Comprador: " + cliente1.getNome());
        for (Pedido pedido : cliente1.getPedidos()) {
            System.out.println("Pedido: " + pedido.getPedido());
            for (Object produto : pedido.getProdutos()) {
                if (produto instanceof Produto) {
                    Produto p = (Produto) produto;
                    System.out.println("- Produto: " + p.getFornecedor() + " - " + p.getFornecedor());
                }
            }
        }
}
}
