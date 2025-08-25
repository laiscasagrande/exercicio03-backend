package ex02;

import ex01.Fatura;

public class Main {
    public static void main(String[] args) {
        Empregado empregado01 = new Empregado(
                "Laís",
                "Kaminski",
                2600.00
        );

        System.out.println("Salário anual do empregado01 antes do aumento: " + empregado01.getSalarioAnual());

        Double novoSalarioMensalEmpregado01 = (empregado01.getSalarioMensal() * 0.1) + empregado01.getSalarioMensal();
        empregado01.setSalarioMensal(novoSalarioMensalEmpregado01);

        System.out.println("Salário do empregado01 depois do aumento: " + empregado01.getSalarioAnual());

        //****************************************************************************************************

        Empregado empregado02 = new Empregado(
                "Mateus",
                "Aguiar",
                10000.00
        );

        System.out.println("Salário anual do empregado02 antes do aumento: " + empregado02.getSalarioAnual());

        Double novoSalarioMensalEmpregado02 = (empregado02.getSalarioMensal() * 0.1) + empregado02.getSalarioMensal();
        empregado02.setSalarioMensal(novoSalarioMensalEmpregado02);

        System.out.println("Salário do empregado02 depois do aumento: " + empregado02.getSalarioAnual());
    }
}