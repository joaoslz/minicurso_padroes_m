package p01.strategy;

public class COFINS implements Imposto {

  @Override
  public double calcula(Orcamento orcamento) {

      return orcamento.getValor() * 0.02;
  }
 
}
