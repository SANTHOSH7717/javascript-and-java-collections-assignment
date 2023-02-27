package Ex;

import java.util.ArrayList;
import java.util.List;
public class ParticipantTester {
    public static void main(String[] args) {
        ParticipantColl[] finalists1 = {new ParticipantColl("Hazel", "Singing", 91.2),
                new ParticipantColl("Ben", "Instrumental", 95.7),
                new ParticipantColl("John", "Singing", 94.5),
                new ParticipantColl("Bravo", "Singing", 97.6)};

        List<ParticipantColl> finalists1List = generateListOfFinalists(finalists1);

        System.out.println("All Finalists:");
        for (ParticipantColl finalist : finalists1List) {
            System.out.println(finalist.toString());
        }

        List<ParticipantColl> singingFinalists = getFinalistsByTalent(finalists1List, "Singing");

        System.out.println("\nSinging Finalists:");
        for (ParticipantColl finalist : singingFinalists) {
            System.out.println(finalist.toString());
        }

        ParticipantColl[] finalists2 = {new ParticipantColl("Mark", "Instrumental", 81.2),
                new ParticipantColl("Ella", "Instrumental", 65.7),
                new ParticipantColl("Lily", "Singing", 86.5)};

        List<ParticipantColl> finalists2List = generateListOfFinalists(finalists2);

        System.out.println("\nAll Finalists:");
        for (ParticipantColl finalist : finalists2List) {
            System.out.println(finalist.toString());
        }

        List<ParticipantColl> instrumentalFinalists = getFinalistsByTalent(finalists2List, "Instrumental");

        System.out.println("\nInstrumental Finalists:");
        for (ParticipantColl finalist : instrumentalFinalists) {
            System.out.println(finalist.toString());
        }
    }

    public static List<ParticipantColl> generateListOfFinalists(ParticipantColl[] finalists) {
        List<ParticipantColl> finalistList = new ArrayList<>();
        for (ParticipantColl finalist : finalists) {
            finalistList.add(finalist);
        }
        return finalistList;
    }

    public static List<ParticipantColl> getFinalistsByTalent(List<ParticipantColl> finalists, String talent) {
        List<ParticipantColl> filteredList = new ArrayList<>();
        for (ParticipantColl finalist : finalists) {
            if (finalist.getParticipantTalent().equals(talent)) {
                filteredList.add(finalist);
            }
        }
        return filteredList;
    }
}