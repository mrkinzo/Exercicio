package ECommerce;

public class Produto {
    private String nome;
    private String fornecedor;

    public Produto(String nome, String fornecedor) {
        this.nome = nome;
        this.fornecedor = fornecedor;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
}
