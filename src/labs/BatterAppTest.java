package labs;

import org.junit.Assert;
import org.junit.Test;

public class BatterAppTest {

	@Test
	public void batAvg0_1() {
		Batter batter = new Batter("Test");
		batter.setBases(0);batter.setBases(1);
		Assert.assertEquals("0.500", batter.formatNumber(batter.getBattingAverage()));
	}
	
	@Test
	public void batAvg0_0() {
		Batter batter = new Batter("Test");
		batter.setBases(0);batter.setBases(0);
		Assert.assertEquals("0.000", batter.formatNumber(batter.getBattingAverage()));
	}
	
	@Test
	public void batAvg4_4_4() {
		Batter batter = new Batter("Test");
		batter.setBases(4);batter.setBases(4);batter.setBases(4);
		Assert.assertEquals("1.000", batter.formatNumber(batter.getBattingAverage()));
	}
	
	@Test
	public void batAvg0_1_2() {
		Batter batter = new Batter("Test");
		batter.setBases(0);batter.setBases(1);batter.setBases(2);
		Assert.assertEquals("0.667", batter.formatNumber(batter.getBattingAverage()));
	}
	
	@Test
	public void batAvg0_0_3_0() {
		Batter batter = new Batter("Test");
		batter.setBases(0);batter.setBases(0);batter.setBases(3);batter.setBases(0);
		Assert.assertEquals("0.250", batter.formatNumber(batter.getBattingAverage()));
	}
	
	@Test
	public void batAvg2_2_1_4() {
		Batter batter = new Batter("Test");
		batter.setBases(2);batter.setBases(2);batter.setBases(1);batter.setBases(4);
		Assert.assertEquals("1.000", batter.formatNumber(batter.getBattingAverage()));
	}
	
	@Test
	public void batAvg0_1_4_0_2_1_3_0_0() {
		Batter batter = new Batter("Test");
		batter.setBases(0);batter.setBases(1);batter.setBases(4);batter.setBases(0);
		batter.setBases(2);batter.setBases(1);batter.setBases(3);batter.setBases(0);batter.setBases(0);
		Assert.assertEquals("0.556", batter.formatNumber(batter.getBattingAverage()));
	}
	
	@Test
	public void batAvg0() {
		Batter batter = new Batter("Test");
		batter.setBases(0);
		Assert.assertEquals("0.000", batter.formatNumber(batter.getBattingAverage()));
	}
	
	@Test
	public void batAvg3() {
		Batter batter = new Batter("Test");
		batter.setBases(3);
		Assert.assertEquals("1.000", batter.formatNumber(batter.getBattingAverage()));
	}
	
	@Test
	public void slugPer0_1() {
		Batter batter = new Batter("Test");
		batter.setBases(0);batter.setBases(1);
		Assert.assertEquals("0.500", batter.formatNumber(batter.getSluggingPercentage()));
	}
	
	@Test
	public void slugPer0_0() {
		Batter batter = new Batter("Test");
		batter.setBases(0);batter.setBases(0);
		Assert.assertEquals("0.000", batter.formatNumber(batter.getSluggingPercentage()));
	}
	
	@Test
	public void slugPer4_4_4() {
		Batter batter = new Batter("Test");
		batter.setBases(4);batter.setBases(4);batter.setBases(4);
		Assert.assertEquals("4.000", batter.formatNumber(batter.getSluggingPercentage()));
	}
	
	@Test
	public void slugPer0_1_2() {
		Batter batter = new Batter("Test");
		batter.setBases(0);batter.setBases(1);batter.setBases(2);
		Assert.assertEquals("1.000", batter.formatNumber(batter.getSluggingPercentage()));
	}
	
	@Test
	public void slugPer0_0_3_0() {
		Batter batter = new Batter("Test");
		batter.setBases(0);batter.setBases(0);batter.setBases(3);batter.setBases(0);
		Assert.assertEquals("0.750", batter.formatNumber(batter.getSluggingPercentage()));
	}
	
	@Test
	public void slugPer2_2_1_4() {
		Batter batter = new Batter("Test");
		batter.setBases(2);batter.setBases(2);batter.setBases(1);batter.setBases(4);
		Assert.assertEquals("2.250", batter.formatNumber(batter.getSluggingPercentage()));
	}
	
	@Test
	public void slugPer0_1_4_0_2_1_3_0_0() {
		Batter batter = new Batter("Test");
		batter.setBases(0);batter.setBases(1);batter.setBases(4);batter.setBases(0);
		batter.setBases(2);batter.setBases(1);batter.setBases(3);batter.setBases(0);batter.setBases(0);
		Assert.assertEquals("1.222", batter.formatNumber(batter.getSluggingPercentage()));
	}
	
	@Test
	public void slugPer0() {
		Batter batter = new Batter("Test");
		batter.setBases(0);
		Assert.assertEquals("0.000", batter.formatNumber(batter.getSluggingPercentage()));
	}
	
	@Test
	public void slugPer3() {
		Batter batter = new Batter("Test");
		batter.setBases(3);
		Assert.assertEquals("3.000", batter.formatNumber(batter.getSluggingPercentage()));
	}
}
