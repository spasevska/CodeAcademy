package dayNine;

public abstract class LightBulbSwitcher {
public static void turnAllLightbulbs(Lightbulb[] bulds) {
	for (Lightbulb lightbulb : bulds) {
		lightbulb.turnOn();
	}
}
}
