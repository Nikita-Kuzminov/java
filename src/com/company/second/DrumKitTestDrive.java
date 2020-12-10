class Drumkit {
    boolean topHat = true;
    boolean snare = true;

    void playSnare() {
        System.out.println("bah bah ba-bah");
    }

    void playTopHat() {
        System.out.println("din' din' di-din'");
    }
}

class DrumKitTestDrive {
    public static void main(String[] args) {
        Drumkit d = new Drumkit();

        if (d.snare == true) {
            d.playSnare();
        }
        d.playTopHat();

    }
}


