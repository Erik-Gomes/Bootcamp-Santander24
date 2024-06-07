public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv.Power);
        System.out.println(smartTv.channel);
        System.out.println(smartTv.volume);

        smartTv.PowerOn();
        System.out.println(smartTv.Power);

        smartTv.changeChannel(13);
        System.out.println(smartTv.channel);
    }
}
