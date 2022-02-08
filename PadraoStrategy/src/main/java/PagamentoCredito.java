public class PagamentoCredito implements  Pagamento{
    @Override
    public String calcular(double dinheiro) {
        return "Pagamento de credito Realizado R$"+ dinheiro + " será debitado proximo mes.";
    }
}
