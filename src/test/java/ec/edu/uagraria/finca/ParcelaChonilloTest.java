
package ec.edu.uagraria.finca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ParcelaChonilloTest {

    @Test
    void tresCuartosDeHectareaSonSieteMilQuinientosMetros() {
        Parcela parcela = new Parcela("P-30", 0.75);

        assertEquals(7_500.0,
                parcela.areaEnMetrosCuadrados(), 0.001);
    }
}
