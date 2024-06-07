public class SmartTv {
    boolean Power = false;
    int channel = 1;
    int volume = 20;

    public void changeChannel( int newChannel){
        channel = newChannel;
    }

    public void PowerOn(){
        Power = true;
    }
    public void PowerOff(){
        Power = false;
    }
}
