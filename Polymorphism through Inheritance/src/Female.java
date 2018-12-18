
public class Female extends Human {
	String player = null;
	void sayHi()
	{
		IPlayer windows = new WindowsMedia();
		windows.play(player);
	}
}
