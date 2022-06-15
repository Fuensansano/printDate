import java.time.LocalDate;

public class PrintDate {
    public void printCurrentDate() {
        String line = Calendar.today().toString();
        Printer.printLine(line);
    }

}
