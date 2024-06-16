/*
Write an interface "playable" with a method void "play()", let this Interface be placed in a package called "music".
Write a class "Veena" which implement the "playable" interface, let this class be placed in a package called "music.string". 
Write a class "saxophone" which implement the "playable" interface, let this class be placed in a package called "music.wind".
Write another class "test" in package "live". Then ->
(i) create an instance of "Veena" and call the "play()" method
(ii) create an instance of "saxophone" and Call the "play()" method
(iii) place the above instances in a variable of type "playable" and then call "play())"
*/

package LAB_06.prg_27_PackageInterface.live;

import LAB_06.prg_27_PackageInterface.live.music.playable;
import LAB_06.prg_27_PackageInterface.live.music.string.veena;
import LAB_06.prg_27_PackageInterface.live.music.wind.saxophone;

public class test {
    public static void main(String[] args) {
        System.out.print("Instance of Veena Class : ");
        veena v = new veena("Shaswat ");
        v.play();
        System.out.print("Instance of Saxophone Class : ");
        saxophone s = new saxophone("Yash ");
        s.play();
        System.out.println("Instance of Playable Interface ->");
        playable p = new veena("Divyam ");
        p.play();
        p = new saxophone("Amit ");
        p.play();
    }
}
