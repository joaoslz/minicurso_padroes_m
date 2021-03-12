package p01.strategy;

public class CalculadorDeImpostos {
 
 public void realizaCalculo(Orcamento orcamento, Imposto imposto){
     double valorImposto = imposto.calcula(orcamento);
     System.out.println(valorImposto);
  }
}
