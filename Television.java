/**
 *The purpose of this class is to model a television
 * Heran Kassaye sep 29 - 2021
 */
public class Television {
    private String  strMANUFACTURER; // manufacture attribute of the tv
    private int SCREEN_SIZE;// the screen size of the television
    private boolean powerOn; // to turn the tv on or off
    private int channel; // to change the channel of the tv
    private int volume; // volume of the tv to increase and decrease
//Task #2 Writing a Constructor
    //
    public Television(String tvName ,int screen) {
        strMANUFACTURER = tvName;
        SCREEN_SIZE = screen;
        powerOn = false;
        volume = 20;
        channel = 2;
    }
        // Task #3 Methods

    /**
     * gets volume
     * @return volume
     */
    public int getVolume() {
        return this.volume;
    }

    /**
     *  gets the channel
     * @return channel
     */
    public int getChannel() {
        return this.channel;
    }

    /**
     * returns the manufacutrer
     * @return strManuFacturer
     */
    public String getManufacturer() {
        return this.strMANUFACTURER;
    }

    /**
     * gets screen size
     * @return SCREEN_SIZE
     */
    public int getScreenSize() {
        return this.SCREEN_SIZE;
    }

    /**
     * set the channel
     * @param channel
     */
    public void setChannel(int channel){
        this.channel = channel;
    }

    /**
     * if power is on turn it off and if off turn it on
     */
    public void power(){
        powerOn = !powerOn;
    }

    /**
     * increases the volume by 1
     */
    public void increaseVolume() {
        volume+=1;
    }

    /**
     * decreases the volume by 1
     */
    public void decreaseVolume(){
        volume -= 1;
    }

}
