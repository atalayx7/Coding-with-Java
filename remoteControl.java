public class remoteControl {
	boolean On = false;
	private int volume = 0;
	private int channel = 1;

	public remoteControl() {

	}

	public boolean turnOn() {
		return On = true;
	}

	public boolean turnOff() {
		return On = false;
	}

	public void setVolume(int volume) {
		if (0 < volume && volume < 25 && On)
			this.volume = volume;
	}

	public void setChannel(int channel) {
		if (channel < 120 && channel > 0 && On)
			this.channel = channel;
	}

	public void volumeUp() {
		if (On && volume < 25)
			this.volume++;
	}

	public void volumeDown() {
		if (On && volume < 0)
			this.volume--;
	}

	public void channelUp() {
		if (On && channel < 120)
			this.channel++;
	}

	public void channelDown() {
		if (On && volume > 0)
			this.channel--;
	}

	public int getVolume() {
		return volume;
	}

	public int getChannel() {
		return channel;
	}

}
