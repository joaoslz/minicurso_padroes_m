package p02.chainofresponsability;

public interface Desconto {
    double desconta(Orcamento orcamento);
    void setProximo(Desconto proximo);
}
