package dayNine;

public class TestLightbulb {
public static void main(String[] args) {
//	Lightbulb lb1 = new Lightbulb();
//	lb1.turnOn();
	RedLightbilb rlb1 = new RedLightbilb();
	rlb1.turnOn();
	
	
	Lightbulb[] lbar = new Lightbulb[10];
	lbar[0] = new RedLightbilb();
	lbar[1] = new RedLightbilb();
	lbar[2] = new RedLightbilb();
	lbar[3] = new BlueLightbub();
	lbar[4] = new BlueLightbub();
	lbar[5] = new BlueLightbub();
	lbar[6] = new GreenLightBulb();
	lbar[7] = new GreenLightBulb();
	lbar[8] = new YelloLB();
	lbar[9] = new YelloLB();

	LightBulbSwitcher.turnAllLightbulbs(lbar);
	
}



}
