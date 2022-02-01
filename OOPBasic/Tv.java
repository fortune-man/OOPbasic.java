package OOPBasic;

public class Tv {

    boolean power;
    int channel;

    void power(){power = !power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}
}

class SubtitleTv extends Television {
    String text;
    void Subtitle(){}
}