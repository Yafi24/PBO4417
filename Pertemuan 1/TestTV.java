public class TestTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.nyalakan();
        tv1.setChannel(13);
        tv1.setChannel(19);
        tv1.setVolume(4);
        tv1.matikan();
        
        TV tv2 = new TV();
        tv2.nyalakan();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeKecil();
        tv2.matikan();

        System.out.println(" tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        System.out.println(" on/off " + tv1.on);
        System.out.println(" tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
        System.out.println(" on/off " + tv2.on);
    }
}