import java.time.LocalDate;

public class Calendar {
    public LocalDate randomDay() {
        return createRandomDate();
    }

    private int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    private LocalDate createRandomDate() {
        int day = createRandomIntBetween(1, 28);
        int month = createRandomIntBetween(1, 12);
        int year = createRandomIntBetween(1900, 2000);
        return LocalDate.of(year, month, day);
    }
}
