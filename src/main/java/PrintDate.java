public class PrintDate {

    public void printCurrentDate() {
        String line = calendar.today().toString();
        printer.printLine(line);
    }

}
