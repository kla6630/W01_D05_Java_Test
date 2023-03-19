package W1_D5_TEST;

public class Audio extends PlayableMedia {

	public Audio(String t, int v, int d) {
		super(t, v, d); // t= title, v=volume d=duration

	}

	public void play() {

		String title = this.getTitle();
		title = title.concat(" ");
		for (int i = 0; i < this.getVolume(); i++) {
			title = title.concat("!");
		}
		for (int i = 0; i < this.getDuration(); i++) {
			System.out.println(title);
		}
	}

}
