package classandobject;

public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        d.playTophat();

        if (d.snare == true) {
            d.playSnare();
        }
    }
}
