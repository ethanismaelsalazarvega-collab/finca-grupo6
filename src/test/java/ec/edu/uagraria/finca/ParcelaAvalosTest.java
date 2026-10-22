
package ec.edu.uagraria.finca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ParcelaAvalosTest {

    @Test
    void tresHectareasSonTreintaMilMetros() {
        Parcela parcela = new Parcela("P-40", 3.0);

        assertEquals(30_000.0,
                parcela.areaEnMetrosCuadrados(), 0.001);
    }
}
