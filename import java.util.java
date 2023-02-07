import java.util.Scanner;

public class CurrencyConverter {
  private static final String[] CURRENCY_CODES = {"USD", "EUR", "GBP", "INR", "AUD", "CAD"};
  private static final String[] CURRENCY_NAMES = {"Dólar estadounidense", "Euro", "Libra esterlina", "Rupia india", "Dólar australiano", "Dólar canadiense"};

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bienvenido al conversor de monedas");
    System.out.println("Las monedas disponibles son:");
    for (int i = 0; i < CURRENCY_CODES.length; i++) {
      System.out.println(CURRENCY_CODES[i] + " - " + CURRENCY_NAMES[i]);
    }

    System.out.print("Ingresa la cantidad de dinero a convertir: ");
    double amount = scanner.nextDouble();
    scanner.nextLine();

    System.out.print("Ingresa la moneda original (código): ");
    String originalCurrency = scanner.nextLine();
    int originalIndex = -1;
    for (int i = 0; i < CURRENCY_CODES.length; i++) {
      if (CURRENCY_CODES[i].equalsIgnoreCase(originalCurrency)) {
        originalIndex = i;
        break;
      }
    }
    if (originalIndex == -1) {
      System.out.println("Lo siento, no reconozco esa moneda");
      return;
    }

    System.out.print("Ingresa la moneda de destino (código): ");
    String targetCurrency = scanner.nextLine();
    int targetIndex = -1;
    for (int i = 0; i < CURRENCY_CODES.length; i++) {
      if (CURRENCY_CODES[i].equalsIgnoreCase(targetCurrency)) {
        targetIndex = i;
        break;
      }
    }
    if (targetIndex == -1) {
      System.out.println("Lo siento, no reconozco esa moneda");
      return;
    }

    double conversionRate = getConversionRate(originalCurrency, targetCurrency);
    double convertedAmount = amount * conversionRate;
    System.out.println("La cantidad convertida es: " + convertedAmount + " " + targetCurrency);
  }

  private static double getConversionRate(String from, String to) {
    // En este ejemplo, asumimos una tasa fija de conversión entre todas las monedas.
    // En una aplicación real, deberías buscar las tasas de conversión actuales en línea.
    return 1.0;
  }
}
