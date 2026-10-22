
package ec.edu.uagraria.finca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ParcelaWashingtonTest {

    @Test
    void unCuartoDeHectareaSonDosMilQuinientosMetros() {
        Parcela parcela = new Parcela("P-50", 0.25);

        assertEquals(2_500.0,
                parcela.areaEnMetrosCuadrados(), 0.001);
    }
}
