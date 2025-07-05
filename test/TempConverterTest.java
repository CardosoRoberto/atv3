import org.junit.Assert;
import org.junit.Test;

public class TempConverterTest {

    @Test
    public void testFtoC() {
        Assert.assertEquals(0, TempConverter.fahrenheitToCelsius(32), 0.01);
    }

    @Test
    public void testFtoK() {
        Assert.assertEquals(273.15, TempConverter.fahrenheitToKelvin(32), 0.01);
    }
}
