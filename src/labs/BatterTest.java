package labs;

import org.junit.Assert;
import org.junit.Test;

public class BatterTest {
	
	@Test
	public void batAvg0_1() {
		Batter batter = new Batter("Test");
		batter.setBases(0);batter.setBases(1);
		Assert.assertEquals("0.5", batter.formatNumber(batter.getBattingAverage()));
	}

}
