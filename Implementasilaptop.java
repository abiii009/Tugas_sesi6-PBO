// Class Toshiba
class Toshiba implements Laptop {
    private int volume;
    private boolean isPowerOn;

    public Toshiba() {
        this.volume = 50; // default volume
    }

    Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Toshiba menyala... Welcome to TOSHIBA");
    }

    Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Toshiba dimatikan.");
    }

    Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume < MAX_VOLUME) this.volume += 10;
            System.out.println("Volume Toshiba: " + this.getVolume());
        } else {
            System.out.println("Nyalakan Toshiba terlebih dahulu!");
        }
    }

    Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume > MIN_VOLUME) this.volume -= 10;
            System.out.println("Volume Toshiba: " + this.getVolume());
        } else {
            System.out.println("Nyalakan Toshiba terlebih dahulu!");
        }
    }

    public int getVolume() { return this.volume; }
}

// Class MacBook
class MacBook implements Laptop {
    private int volume;
    private boolean isPowerOn;

    public MacBook() {
        this.volume = 50;
    }

    Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("MacBook menyala... Hello Mac User!");
    }

    Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("MacBook dimatikan.");
    }

    Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume < MAX_VOLUME) this.volume += 5;
            System.out.println("Volume MacBook: " + this.getVolume());
        }
    }

    Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume > MIN_VOLUME) this.volume -= 5;
            System.out.println("Volume MacBook: " + this.getVolume());
        }
    }

    public int getVolume() { return this.volume; }
}