package W1_D5_TEST;

public class PlayableMedia extends MediaElement implements Interface_Playable {

	private int duration;
	private int volume;

	public PlayableMedia(String t, int v, int d) {
		super(t); // title
		this.setVolume(v); // volume
		this.setDuration(d); // duration

	}

	@Override
	public void volumeUp() {

		if (this.volume < 5) {
			this.volume++;
		} else {
			System.out.println("The volume is at 100%");
		}
	}

	@Override
	public void volumeDown() {

		if (this.volume > 1) {
			this.volume--;
		} else {
			System.out.println("The volume is at 0%");
		}
	}

	@Override
	public void play() {

	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

}
