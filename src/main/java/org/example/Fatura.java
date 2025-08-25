package org.example;

public class Fatura {
    //atributos
    private String numero;
    private String descricao;
    private Integer quantidade;
    private Double precoPorItem;

    //construtor
    Fatura(String numero, String descricao, Integer quantidade, Double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoPorItem = precoPorItem;
    }

    //métodos getters
    public String getNumero() {
        return this.numero;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    public Double getPrecoPorItem() {
        return this.precoPorItem;
    }

  //métodos setters
    public void setNumero(String numero) {
            this.numero = numero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setPrecoPorItem(Double precoPorItem) {
        this.precoPorItem = precoPorItem;
    }

 //metodo
 public Double getTotalFatura() {
     Integer qtde = this.quantidade;
     Double preco = this.precoPorItem;

     if (this.quantidade < 0 || this.precoPorItem < 0) {
        qtde = 0;
        preco = 0.0;
     }

     return qtde * preco;
 }
}
