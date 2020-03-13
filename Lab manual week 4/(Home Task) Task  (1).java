/******************************************************************************
Home Tasks

Task 1

Hitachi ltd. has hired you to program the television sets they manufacture. Each TV has a channel,
volumeLevel, and a state(on/off. The state should be true if television is on and false if it is off). In the
same way, every TV set can perform a few functions that are turnOn() to turn the television on,
turnoff() to switch it off, setChannel(newChannel) that provides a specific channel to set,
setVolume(newVolumeLevel) to set a specified volume, channelUp() to go up by one channel,
channelDown() to go one channel down, volumeUp() in order to increase volume level by one and
volumeDown() to decrease volume level by one. Design a class TV with appropriate instance variables,
methods, constructors, getters and setters according to the information given above. Write a Java app to test
your TV class.

*******************************************************************************/
class Hitachi_ltd{
  public int channel;
  public int volumeLevel;
  public boolean state;
  
  Hitachi_ltd(){
    channel = 0;
    state = false;
    volumeLevel = 20;
    System.out.println("Your TV state is OFF\n Your volumeLevel is "+volumeLevel+"\n  Your channel is "+channel);
  }
  
  public String switchTVOnOff(boolean mode){
    String turn = !mode ? " ON ":" OFF "; 
    return "TV is Succesfully Turn" + turn;
  }
  
  public String setChannel(int newChannel){
    channel = newChannel;
  
    return "Your channel is Succesfully Set to "+newChannel;
  }
  
  public String setVolume(int newVolumeLevel){
    volumeLevel = newVolumeLevel;
  
    return "Your volume Level is Succesfully Set to "+newVolumeLevel;
  }
  
  public String channel(boolean go){
    
    String temp = go ? "channel Up to "+(++channel) : "channel Down to "+(--channel);
    
    return "Your "+temp+" Succesfully done";
  }
  
  public String volume(boolean go){
    
    String temp = go ? "volume Up to "+(++volumeLevel) : "volume Down to "+(--volumeLevel);
    
    return "Your "+temp+" Succesfully done";
  }
  
  
}


public class Main
{
	public static void main(String[] args) {
  
    Hitachi_ltd TV = new Hitachi_ltd();
    
    System.out.println(TV.switchTVOnOff(TV.state));
    System.out.println(TV.setChannel(25));
    System.out.println(TV.setVolume(35));
    System.out.println(TV.channel(false));
    System.out.println(TV.volume(!false));
    
    
	}
}
