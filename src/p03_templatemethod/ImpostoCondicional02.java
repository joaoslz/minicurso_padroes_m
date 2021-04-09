package p03_templatemethod;

public class ImpostoCondicional02 extends TemplateDeImpostoCondicional {

    @Override
    protected boolean deveAplicarOMaiorDesconto(Orcamento orcamento) {
        return (orcamento.getValor() > 500 &&
                temItemMaiorQue100ReaisNo(orcamento));
    }

    @Override
    protected double aplicaOMaiorDesconto(Orcamento orcamento) {
        return orcamento.getValor() * 0.10;
    }

    @Override
    protected double aplicaOMenorDesconto(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
        for(Item item : orcamento.getItens()) {
            if(item.getValor() > 100) return true;
        }

        return false;
    }
    /*    public double calcula(Orcamento orcamento) {

        if(orcamento.getValor() > 500 &&
                temItemMaiorQue100ReaisNo(orcamento)) {
            return orcamento.getValor() * 0.10;
        } else {
            return orcamento.getValor() * 0.06;
        }
    }*/

}
