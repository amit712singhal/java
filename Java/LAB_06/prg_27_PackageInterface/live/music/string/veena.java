package LAB_06.prg_27_PackageInterface.live.music.string;

import LAB_06.prg_27_PackageInterface.live.music.playable;

public class veena implements playable {
    String name;

    public veena(String n) {
        this.name = n;
    }

    @Override
    public void play() {
        System.out.println(name + "can play veena well!");
    }

    public static void main(String[] args) {
        playable p = new veena("Amit ");
        p.play();
    }
}
