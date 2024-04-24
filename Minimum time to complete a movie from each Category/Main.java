import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        //Minimum Time to complete a single movie from Given Categories
        ArrayList<Integer> releaseTime1 = new ArrayList<>(Arrays.asList(1,4));
        ArrayList<Integer> releaseDuration1 = new ArrayList<>(Arrays.asList(3,2));
        ArrayList<Integer> releaseTime2 = new ArrayList<>(Arrays.asList(5,2));
        ArrayList<Integer> releaseDuration2 = new ArrayList<>(Arrays.asList(2,2));

        ArrayList<Entertainment> entertainmentArrayList = new ArrayList<>();

        for (int i = 0; i < releaseTime1.size(); i++) {
            entertainmentArrayList.add(new Entertainment(releaseTime1.get(i), releaseTime1.get(i) + releaseDuration1.get(i),0));
        }

        for (int j = 0; j < releaseTime2.size(); j++) {
            entertainmentArrayList.add(new Entertainment(releaseTime2.get(j), releaseTime2.get(j) + releaseDuration2.get(j),1));
        }

        Collections.sort(entertainmentArrayList,new EntertainmentComparator());

        int category = entertainmentArrayList.get(0).getPosition();
        int endTime = entertainmentArrayList.get(0).getEndTime();

        entertainmentArrayList= entertainmentArrayList.stream().filter(e->e.getPosition() != category).collect(Collectors.toCollection(ArrayList::new));

        for (Entertainment e : entertainmentArrayList) {
            if (e.getStartTime() > endTime) {
                System.out.println(e.getEndTime());
            }
        }
    }


}








