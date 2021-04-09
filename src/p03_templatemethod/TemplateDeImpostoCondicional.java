package p03_templatemethod;

abstract class TemplateDeImpostoCondicional implements Imposto {

    @Override
    public final double calcula(Orcamento orcamento) {

        if( deveAplicarOMaiorDesconto(orcamento) ) {
            // ...
            return aplicaOMaiorDesconto(orcamento);
        } else {
            // ...
            return aplicaOMenorDesconto(orcamento);
        }
    }

    protected abstract boolean deveAplicarOMaiorDesconto(Orcamento orcamento);

    protected abstract double aplicaOMaiorDesconto(Orcamento orcamento);

    protected abstract double aplicaOMenorDesconto(Orcamento orcamento);
}

