
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PagamentoTest {

    @Test
    void deveRetornarPagamentoDebito(){
        Cliente cliente = new Cliente();
        cliente.pagarComDebito(500.35);
        assertEquals("Pagamento de débito Realizado R$500.35 Foi debitado.", cliente.getMensagemPagamento());
    }
    @Test
    void deveRetornarPagamentoCredito(){
        Cliente cliente = new Cliente();
        cliente.pagarComCedito(101.11);
        assertEquals("Pagamento de credito Realizado R$101.11 será debitado proximo mes.", cliente.getMensagemPagamento());
    }
    @Test
    void deveRetornarPagamentoPix(){
        Cliente cliente = new Cliente();
        cliente.pagarComPix(322.32);
        assertEquals("Pagamento de R$322.32 transferido com sucesso!", cliente.getMensagemPagamento());
    }
    @Test
    void deveRetornarPagamentoDinheiro(){
        Cliente cliente = new Cliente();
        cliente.pagarComDinheiro(299.87);
        assertEquals("Pagamento de R$299.87 aceito pela maquina seu troco será dado pelo atendente.", cliente.getMensagemPagamento());
    }
}
