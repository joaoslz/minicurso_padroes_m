package p04_builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NotaFiscalBuilder {

    private String razaoSocial;
    private String cnpj;
    private LocalDate dataDeEmissao;
    private double valorBruto;
    private double impostos;
    public List<Item> itens = new ArrayList<>();
    public String observacoes;


    public NotaFiscalBuilder paraEmpresa(String razaoSocial ) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NotaFiscalBuilder comCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuilder comItem(Item item) {
        this.itens.add(item );
        return  this;
    }

    public NotaFiscalBuilder naDataAtual() {
        this.dataDeEmissao = LocalDate.now();
        return this;
    }

    public NotaFiscalBuilder comObservacoes(String observacoes ) {
        this.observacoes = observacoes;
        return this;
    }

    public NotaFiscal constroi() {
        double valorTotal = 0;

        for(Item item : itens) {
            valorTotal = valorTotal +  item.getValor();
        }
        double impostos = valorTotal * 0.05;

        return new NotaFiscal(razaoSocial, cnpj, dataDeEmissao,
                              valorTotal, impostos, itens, observacoes );
    }
}

