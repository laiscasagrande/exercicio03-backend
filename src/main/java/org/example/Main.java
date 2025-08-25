package org.example;

public class Main {
    public static void main(String[] args) {
        Fatura fatura01 = new Fatura(
                "1",
                "teste 01",
                1,
                20.0
        );

        System.out.println(fatura01.getNumero());
        System.out.println(fatura01.getDescricao());
        System.out.println(fatura01.getQuantidade());
        System.out.println(fatura01.getPrecoPorItem());

        fatura01.setNumero("2");
        fatura01.setDescricao("fatura para teste");
        fatura01.setQuantidade(11111);
        fatura01.setPrecoPorItem(15468.0);

        System.out.println("Total Fatura 01: " + fatura01.getTotalFatura());

        /******************************************************/

        Fatura fatura02 = new Fatura(
                "5",
                "teste 02",
                1,
                21.0
        );

        System.out.println(fatura02.getNumero());
        System.out.println(fatura02.getDescricao());
        System.out.println(fatura02.getQuantidade());
        System.out.println(fatura02.getPrecoPorItem());

        fatura02.setNumero("2");
        fatura02.setDescricao("fatura para teste");
        fatura02.setQuantidade(11111);
        fatura02.setPrecoPorItem(15468.4);

        System.out.println("Total Fatura 02: " + fatura02.getTotalFatura());
     }
}
