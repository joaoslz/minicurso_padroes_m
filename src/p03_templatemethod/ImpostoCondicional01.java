package p03_templatemethod;

public class ImpostoCondicional01 extends TemplateDeImpostoCondicional {

    @Override
    protected boolean deveAplicarOMaiorDesconto(Orcamento orcamento) {
        return (orcamento.getValor() > 500);
    }

    @Override
    protected double aplicaOMaiorDesconto(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

    @Override
    protected double aplicaOMenorDesconto(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }

    /*
    public double calcula(Orcamento orcamento) {

        if(orcamento.getValor() > 500) {
            return orcamento.getValor() * 0.07;
        } else {

        }
    }*/


}

