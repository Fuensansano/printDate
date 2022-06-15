import java.time.LocalDate;

public class PrintDate {
    public void printDate(Calendar date, Printer print) {
        String line = date.randomDay().toString();
        print.printLine(line);
    }

}
