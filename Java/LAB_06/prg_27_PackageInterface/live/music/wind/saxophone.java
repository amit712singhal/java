package LAB_06.prg_27_PackageInterface.live.music.wind;

import LAB_06.prg_27_PackageInterface.live.music.playable;

public class saxophone implements playable {
    String name;

    public saxophone(String n) {
        this.name = n;
    }

    @Override
    public void play() {
        System.out.println(name + "can play saxophone well!");
    }

    public static void main(String[] args) {
        playable p = new saxophone("Amit ");
        p.play();
    }
}
