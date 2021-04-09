package p03_templatemethod;

public class TesteCalculoImposto {

    public static void main(String[] args) {
        Imposto imposto1 = new ImpostoCondicional01();

        Orcamento orcamento = new Orcamento(100);

        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

        calculadorDeImpostos.realizaCalculo(orcamento, imposto1);


    }


}
