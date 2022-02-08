public class PagamentoDinheiro implements  Pagamento{
    @Override
    public String calcular(double dinheiro) {
        return "Pagamento de R$"+ dinheiro + " aceito pela maquina seu troco será dado pelo atendente.";
    }
}
