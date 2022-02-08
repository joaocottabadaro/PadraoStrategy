public class Cliente {

    private Double pagamento;

private String mensagemPagamento;

    public String getMensagemPagamento() {
        return mensagemPagamento;
    }

    public double getPagamento() {
        return pagamento;
    }


    public void pagarComDinheiro(double dinheiro){
Maquina maquina = new Maquina(dinheiro);
this.mensagemPagamento = maquina.calcular(new PagamentoDinheiro());

    }

    public void pagarComCedito(double dinheiro){
        Maquina maquina = new Maquina(dinheiro);
        this.mensagemPagamento = maquina.calcular(new PagamentoCredito());

    }

    public void pagarComDebito(double dinheiro){
        Maquina maquina = new Maquina(dinheiro);
        this.mensagemPagamento = maquina.calcular(new PagamentoDebito());


    }
    public void pagarComPix(double dinheiro){
        Maquina maquina = new Maquina(dinheiro);
        this.mensagemPagamento = maquina.calcular(new PagamentoPix());


    }


}
