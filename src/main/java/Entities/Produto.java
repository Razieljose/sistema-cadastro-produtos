package Entities;

public class Produto {
    private String nomeProduto;
    private String descricaoProduto;
    private Integer quantidadeProduto;

    public Produto() {

    }

    public Produto(String nomeProduto, String descricaoProduto, Integer quantidadeProduto) {
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Integer getQuantidadeProduto() {
        return quantidadeProduto;
    }

    @Override
    public String toString() {
        return "Produto --> " +
                "Nome do produto: '" + nomeProduto + '\'' +
                ", Decrição do produto: '" + descricaoProduto + '\'' +
                ", Quantidade do produto: " + quantidadeProduto;
    }
}

