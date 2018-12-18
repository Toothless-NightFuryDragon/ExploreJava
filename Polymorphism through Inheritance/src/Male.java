
public class Male extends Human {
	String player = null;
	void sayHi()
	{
		IPlayer vlc = new VLC();
		vlc.play(player);
	}

}
