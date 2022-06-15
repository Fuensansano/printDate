import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class PrintDateTest {
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@Test
	public void give_me_a_good_name_please() {
		LocalDate date = LocalDate.now();
		Calendar calendar = mock(Calendar.class);
		when(calendar.randomDay()).thenReturn(date);

		PrintDate printDate = new PrintDate();
		printDate.printDate(calendar,new Printer());

		assertEquals(date.toString(), outputStreamCaptor.toString().trim());
	}

	@BeforeEach
	public void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}

}
