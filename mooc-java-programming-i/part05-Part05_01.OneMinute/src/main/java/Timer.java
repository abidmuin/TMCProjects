public class Timer {
    String printSeconds = "";
    String printOneHundredthSeconds = "";
    private int seconds;
    private int oneHundredthSeconds;

    public Timer() {
        this.seconds = 0;
        this.oneHundredthSeconds = 0;
    }

    public void advance() {
        this.oneHundredthSeconds++;

        if (this.oneHundredthSeconds == 100) {
            this.oneHundredthSeconds = 0;
            this.seconds++;
        }

        if (this.seconds == 60) {
            this.seconds = 0;
        }
    }

    public String toString() {
        if (this.seconds < 10) {
            printSeconds = "0" + this.seconds;
        } else {
            printSeconds = String.valueOf(this.seconds);
        }

        if (this.oneHundredthSeconds < 10) {
            printOneHundredthSeconds = "0" + this.oneHundredthSeconds;
        } else {
            printOneHundredthSeconds = String.valueOf(this.oneHundredthSeconds);
        }

        return (printSeconds + ":" + printOneHundredthSeconds);
    }
}
