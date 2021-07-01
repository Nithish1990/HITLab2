package Exersice;

public class UniversalRemote {
	public static void main(String[] args) {
		System.out.println("Demonstration of Remote...");
		Tv tv=new Tv();
		SetUpBox setTopBox=new SetUpBox();
		NetFlix netFlix=new NetFlix();
		AudioSystem soundSystem=new AudioSystem();
		
		FatherNewsChannelCommand fncc=new FatherNewsChannelCommand(tv, setTopBox, soundSystem, netFlix);
		MotherSerialCommand msc=new MotherSerialCommand(tv, setTopBox, soundSystem, netFlix);
		MotherOldMoviesCommand momc=new MotherOldMoviesCommand(tv, setTopBox, soundSystem, netFlix);
		
		Remote universalRemote=new Remote();
		universalRemote.executeCommands(1);
		universalRemote.setCommand(fncc, 0);
		universalRemote.setCommand(momc, 1);
		universalRemote.setCommand(msc, 2);
		
		System.out.println("My Father wants to see news channell...");
		universalRemote.executeCommands(0);

}
class Tv{
	public void av1() {
		System.out.println("Switched to Av mode...");
		
	}
	public void SwitchOn(){
		System.out.println("Switched On...");		
	}
	public void SwitchOff() {
		System.out.println("Switch Off..."); 
	}
	
}
class SetUpBox{
	public void NewsChannels() {
		System.out.println("News Channel Started...");
	}
	public void SerialChannel() {
		System.out.println("Serial Channel Started");
	}
}
class AudioSystem{
	public void DecreaseSound() {
		System.out.println("Sound Volume Decrease...");
	}
	public void IncreaseSound() {
		System.out.println("Sound Volumne Increase...");
	}
}
class NetFlix{
	public void OldMovies() {
		System.out.println("Old Movies Started...");
	}
}
interface Commands{
	public void execute();
	
}
class FatherNewsChannelCommand implements Commands{
	Tv tv; SetUpBox setupbox;AudioSystem audioSystem;NetFlix netFlix;
	
	
	public FatherNewsChannelCommand(Tv tv, SetUpBox setupbox, AudioSystem audioSystem, NetFlix netFlix) {
		this.tv = tv;
		this.setupbox = setupbox;
		this.audioSystem = audioSystem;
		this.netFlix = netFlix;
	}


	@Override
	public void execute() {
		System.out.println("Father Command Started...");
		tv.SwitchOn();
		tv.av1();
		audioSystem.DecreaseSound();
		setupbox.NewsChannels();
		System.out.println("Dad Enjoys News Channel");
	}
}
class MotherOldMoviesCommand implements Commands{
	Tv tv; SetUpBox setupbox;AudioSystem audioSystem;NetFlix netFlix;
	
	public MotherOldMoviesCommand(Tv tv, SetUpBox setupbox, AudioSystem audioSystem, NetFlix netFlix) {
		this.tv = tv;
		this.setupbox = setupbox;
		this.audioSystem = audioSystem;
		this.netFlix = netFlix;
	}

	@Override
	public void execute() {
		System.out.println("Mother Command Started...");
		tv.SwitchOn();
		tv.av1();
		audioSystem.DecreaseSound();
		netFlix.OldMovies();
		System.out.println("Mom Enjoy Watching Old Movies");
		
		
	}
}
class MotherSerialCommand implements Commands{
	Tv tv; SetUpBox setupbox;AudioSystem audioSystem;NetFlix netFlix;
	
	public MotherSerialCommand(Tv tv, SetUpBox setupbox, AudioSystem audioSystem, NetFlix netFlix) {
		this.tv = tv;
		this.setupbox = setupbox;
		this.audioSystem = audioSystem;
		this.netFlix = netFlix;
	}

	@Override
	public void execute() {
		System.out.println("Mother Command Started...");
		tv.SwitchOn();
		tv.av1();
		audioSystem.DecreaseSound();
		setupbox.SerialChannel();
		System.out.println("Mom Enjoy Watching Serials");
		
		
	}
}
class DummyCommand implements Commands{
	@Override
	public void execute() {
		System.out.println("Im Dummy Button");
	}
}
class Remote{
	Commands commands[]=new Commands[5];
	public Remote() {
		for(int i=0;i<commands.length;i++) {
			commands[i]=new DummyCommand();
		}
	}
	public void setCommand(Commands commands,int slot) {
		this.commands[slot]=commands;
	}
	public void executeCommands(int slot) {
		commands[slot].execute();
	}
	}
}