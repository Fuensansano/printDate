import java.time.LocalDate;

public class Calendar {
    public static LocalDate today() {
        return createRandomDate();
    }

    private static int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    private static LocalDate createRandomDate() {
        int day = createRandomIntBetween(1, 28);
        int month = createRandomIntBetween(1, 12);
        int year = createRandomIntBetween(1900, 2000);
        return LocalDate.of(year, month, day);
    }
}
