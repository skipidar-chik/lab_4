import java.util.Arrays;
import java.util.Comparator;

/**
 * Клас, що представляє морський човен.
 */
class MaritimeVessel {
    private String name;         // Назва морського човна
    private int length;          // Довжина морського човна
    private int maxSpeed;        // Максимальна швидкість морського човна
    private int yearBuilt;       // Рік будівництва морського човна
    private boolean isSubmarine; // Прапорець, що вказує, чи є човен підводним

    /**
     * Конструктор класу MaritimeVessel.
     */
    public MaritimeVessel(String name, int length, int maxSpeed, int yearBuilt, boolean isSubmarine) {
        this.name = name;
        this.length = length;
        this.maxSpeed = maxSpeed;
        this.yearBuilt = yearBuilt;
        this.isSubmarine = isSubmarine;
    }

    // Гетери для доступу до полів

    public String getName() {
        return name;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Статичний метод для сортування масиву морських човнів за роком будівництва (за зростанням).
     */
    public static void sortByYearBuiltAscending(MaritimeVessel[] vessels) {
        Arrays.sort(vessels, Comparator.comparingInt(vessel -> vessel.yearBuilt));
    }

    /**
     * Статичний метод для сортування масиву морських човнів за максимальною швидкістю (за спаданням).
     */
    public static void sortByMaxSpeedDescending(MaritimeVessel[] vessels) {
        Arrays.sort(vessels, Comparator.comparingInt((MaritimeVessel vessel) -> vessel.maxSpeed).reversed());
    }

    /**
     * Статичний метод для виведення відсортованого масиву в консоль.
     */
    public static void printSortedArray(MaritimeVessel[] vessels, String sortBy) {
        System.out.println("Масив відсортовано за " + sortBy + ":");
        for (MaritimeVessel vessel : vessels) {
            // Виведення інформації про кожний морський човен
            System.out.println(vessel.getName() + " - " + sortBy + ": " +
                    (sortBy.equals("Рік будівництва") ? vessel.getYearBuilt() : vessel.getMaxSpeed()));
        }
        System.out.println();
    }
}
