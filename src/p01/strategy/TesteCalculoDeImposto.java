package p01.strategy;

public class TesteCalculoDeImposto {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(100);

        Imposto icms = new ICMS();
        Imposto iss = new ISS();
        Imposto cofins = new COFINS();

        CalculadorDeImpostos calculadora = new CalculadorDeImpostos();

        calculadora.realizaCalculo(orcamento, cofins );

    }
}
