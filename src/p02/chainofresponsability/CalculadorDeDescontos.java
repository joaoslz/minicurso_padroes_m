package p02.chainofresponsability;

public class CalculadorDeDescontos {

  public double calcula(Orcamento orcamento) {

    DescontoPorCincoItens porCincoItens = new DescontoPorCincoItens();
    DescontoPorMaisDeQuinhentosReais porQuinhentosReais = new DescontoPorMaisDeQuinhentosReais();
    SemDesconto semDesconto = new SemDesconto();

    porCincoItens.setProximo(porQuinhentosReais );
    porQuinhentosReais.setProximo(semDesconto );

     return porCincoItens.desconta(orcamento );
  }
}
