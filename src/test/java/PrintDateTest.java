import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.time.LocalDate;
import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class PrintDateTest {
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

	@Test
	public void give_me_a_good_name_please_x() {
		LocalDate date = LocalDate.now();
		PrintDate printDate = new PrintDate();
		printDate.printCurrentDate();
		assertEquals(date.toString(), new ByteArrayOutputStream().toString());
	}
}
