public class TempConverter {
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double fahrenheitToKelvin(double f) {
        return (f - 32) * 5 / 9 + 273.15;
    }
}
