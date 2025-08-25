package org.example;

public class Fatura {
    //atributos
    private Integer numero = 0;
    private String descricao = " ";
    private Integer quantidade = 0;
    private Double precoPorItem = 0.0;

    //construtor
    Fatura(Integer numero, String descricao, Integer quantidade, Double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoPorItem = precoPorItem;
    }

    //métodos getters
    Integer getNumero() {
        return this.numero;
    }

    String getDescricao() {
        return this.descricao;
    }

    Integer getQuantidade() {
        return this.quantidade;
    }

    Double getPrecoPorItem() {
        return this.precoPorItem;
    }

  //métodos setters
    void setNumero(Integer numero) {
            this.numero = numero;
    }

    void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    void setPrecoPorItem(Double precoPorItem) {
        this.precoPorItem = precoPorItem;
    }

 //metodo
 void getTotalFatura() {
    if (this.quantidade < 0 || this.precoPorItem < 0) {
        this.quantidade = 0;
        this.precoPorItem = 0.0;
    }

    return this.quantidade * this.precoPorItem;
 }

}
