
package ec.edu.uagraria.finca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ParcelaSalazarTest {

    @Test
    void unaYUnCuartoHectareasSonDoceMilQuinientosMetros() {
        Parcela parcela = new Parcela("P-15", 1.25);

        assertEquals(
                12_500.0,
                parcela.areaEnMetrosCuadrados(),
                0.001
        );
    }
}
