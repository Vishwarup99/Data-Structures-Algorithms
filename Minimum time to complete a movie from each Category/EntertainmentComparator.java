import java.util.Comparator;

public class EntertainmentComparator implements Comparator<Entertainment> {

    @Override
    public int compare(Entertainment e1, Entertainment e2){
        if(e1.getEndTime() > e2.getEndTime()) return 1;
        else if(e1.getEndTime() < e2.getEndTime()) return -1;
        else if(e1.getPosition() > e2.getPosition()) return 1;
        return 1;
    }


}
