public class PagamentoPix implements  Pagamento{
    @Override
    public String calcular(double dinheiro) {
        return "Pagamento de R$"+ dinheiro + " transferido com sucesso!";
    }
}
