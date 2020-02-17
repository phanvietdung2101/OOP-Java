
public class StopWatch {
    private long startTime , stopTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void endTime() {
        stopTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return stopTime - startTime;
    }


}
