
package ec.edu.uagraria.finca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ParcelaCastilloTest {

    @Test
    void dosHectareasSonVeinteMilMetros() {
        Parcela parcela = new Parcela("P-20", 2.0);

        assertEquals(20_000.0,
                parcela.areaEnMetrosCuadrados(), 0.001);
    }
}
