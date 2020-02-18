package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {
	
	
	@Test
	void test() {
		TimeOfDay myTimeOfDay = new TimeOfDay();
		assert myTimeOfDay.getHours() == 0;
		assert myTimeOfDay.getMinutes() == 0;
		myTimeOfDay.setHours(12);
		myTimeOfDay.setMinutes(45);
		assert myTimeOfDay.getHours() == 12;
		assert myTimeOfDay.getMinutes() == 45;
	}

}
