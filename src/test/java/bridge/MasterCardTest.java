package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MasterCardTest {

    @Test
    void deveRetornarTarifaMasterCardNoDebito() {
        TipoPagamento tipoPagamento = new Debito();
        MasterCard masterCard = new MasterCard(1000.0f);
        masterCard.setTipoPagamento(tipoPagamento);
        assertEquals(1000.0f, masterCard.calcularTarifa(), 0.0f);
    }

    @Test
    void deveRetornarTarifaMasterCardNoCredito() {
        TipoPagamento tipoPagamento = new Credito();
        MasterCard masterCard = new MasterCard(1000.0f);
        masterCard.setTipoPagamento(tipoPagamento);
        assertEquals(1000.0f, masterCard.calcularTarifa(), 0.05f);
    }

}
