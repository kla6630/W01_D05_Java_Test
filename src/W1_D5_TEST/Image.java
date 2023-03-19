package W1_D5_TEST;

public class Image extends MediaElement implements Interface_Brightness {

	private int brightness;

	public Image(String t, int b) { // t= title, b=brightness
		super(t);
		this.setBrightness(b);

	}

	public void show() {
		String title = this.getTitle();
		title = title.concat(" ");
		for (int i = 0; i < this.getBrightness(); i++) {
			title = title.concat("*");
		}
		System.out.println(title);
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
	public int getBrightness() {
		return brightness;
	}

	@Override
	public void setBrightness(int bgt) {
		this.brightness = bgt;
	}

}
