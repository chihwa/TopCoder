import java.util.*;

/**
 * Created by Chihwa on 1/20/2016.
 */

class Result implements Comparable{
    public String teamName;
    public int won;

    public Result(String teamName, int won) {
        this.teamName = teamName;
        this.won = won;
    }

    @Override
    public int compareTo(Object o) {
        Result r = (Result)o;
        return this.teamName.compareTo(r.teamName);
    }
}

class Score implements Comparable{
    public String teamName;
    public int point;
    public int time;

    public Score(String teamName, int point, int time) {
        this.teamName = teamName;
        this.point = point;
        this.time = time;
    }

    @Override
    public int compareTo(Object o) {
        Score s = (Score)o;
        return this.time - s.time;
    }
}

public class ContestScoreboard {
    public int[] findWinner(String[] scores){

        List<Score> l = new ArrayList<>();
        List<String> rl = new ArrayList<>();
        for (int i = 0; i < scores.length; i++){
            String[] oneScore = scores[i].split(" ");
            String teamName = oneScore[0];
            rl.add(teamName);
            for (int j = 1; j < oneScore.length; j++) {
                String os[] = oneScore[j].split("/");
                l.add(new Score(teamName, Integer.valueOf(os[0]), Integer.valueOf(os[1])));
            }
        }

        Collections.sort(l);
        List<Result> nl = new ArrayList<>(rl);
        Collections.sort(nl);
        Map<String, Integer> rm = new HashMap<>();
        for(String tn: rl){
            rm.put(tn, 0);
        }

        String twn = nl.get(0).teamName;
        int tws = 0;

        for (int i = 0; i < l.size(); i++) {
            Score s = l.get(0);
            String cwn = s.teamName;
            int cws = s.point;
            if()

        }

        return null;
    }

    public static void main(String[] args) {
        new ContestScoreboard().findWinner(new String[]{"TVG 1/1 1/2 1/3", "AJI 1/4 1/5 1/6"});
    }
}
