import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class PrintDateTest {
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
/*
	@Test
	public void give_me_a_good_name_please() {
		LocalDate date = LocalDate.now();
		Calendar calendar = mock(Calendar.class);
		when(calendar.today()).thenReturn(date);

		Printer printer = mock(Printer.class);

		PrintDate printDate = new PrintDate();
		printDate.printCurrentDate();

		verify(printer).printLine(date.toString());
	}*/

	@BeforeEach
	public void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@Test
	public void should_print_a_date() {
		LocalDate date = LocalDate.now();
		PrintDate printDate = new PrintDate();
		printDate.printCurrentDate();
		assertEquals(date.toString(), outputStreamCaptor.toString().trim());
	}
}
