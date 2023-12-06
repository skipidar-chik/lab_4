public class Main {
    public static void main(String[] args) {
        // Створення масиву морських човнів
        MaritimeVessel[] vessels = {
                new MaritimeVessel("German Submarine Type VII", 150, 25, 2005, true),
                new MaritimeVessel("USS Gerald R Ford", 200, 30, 1998, false),
                new MaritimeVessel("Скіпджек", 180, 20, 2010, true),
                new MaritimeVessel("Ross", 250, 35, 2000, false)
        };

        // Сортування за роком будівництва (за зростанням)
        MaritimeVessel.sortByYearBuiltAscending(vessels);
        // Виведення відсортованого масиву в консоль
        MaritimeVessel.printSortedArray(vessels, "Рік будівництва");

        // Сортування за максимальною швидкістю (за спаданням)
        MaritimeVessel.sortByMaxSpeedDescending(vessels);
        // Виведення відсортованого масиву в консоль
        MaritimeVessel.printSortedArray(vessels, "Максимальна швидкість");
    }
}