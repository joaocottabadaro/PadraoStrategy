public class PagamentoDebito implements  Pagamento{
    @Override
    public String calcular(double dinheiro) {
        return "Pagamento de débito Realizado R$"+ dinheiro + " Foi debitado.";
    }
}
