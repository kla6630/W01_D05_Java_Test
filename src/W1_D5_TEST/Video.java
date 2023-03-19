package W1_D5_TEST;

public class Video extends PlayableMedia implements Interface_Brightness {

	private int brightness;

	public Video(String t, int v, int d, int b) {
		super(t, v, d); // (title, volume, duration)
		this.setBrightness(b); // (brightness)

	}

	@Override
	public int getBrightness() {
		return brightness;
	}

	@Override
	public void setBrightness(int b) {
		this.brightness = b;
	}

	@Override
	public void brightnessUp() {

		this.brightness++;

	}

	@Override
	public void brightnessDown() {

		this.brightness--;
	}

	@Override
	public void play() {

		String title = this.getTitle();
		title = title.concat(" ");
		for (int i = 0; i < this.getVolume(); i++) {
			title = title.concat("!");
		}
		title = title.concat(" ");
		for (int i = 0; i < this.getBrightness(); i++) {
			title = title.concat("*");
		}
		for (int i = 0; i < this.getDuration(); i++) {
			System.out.println(title);
		}
	}

}
