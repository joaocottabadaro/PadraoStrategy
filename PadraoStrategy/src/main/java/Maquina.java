public class Maquina {


    private double dinheiro;


    public Maquina(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public String calcular(Pagamento pagamento){return pagamento.calcular(dinheiro);}
}
