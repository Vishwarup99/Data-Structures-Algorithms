public class Entertainment{
    private int startTime;
    private int endTime;
    private int position;

    Entertainment(int sTime, int eTime, int pos){
        this.startTime = sTime;
        this.endTime = eTime;
        this.position = pos;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "Entertainment{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", position=" + position +
                '}';
    }
}