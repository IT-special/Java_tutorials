package FootballPlayer;

public class FootballPlayer {
    int no;
    String name;
    boolean inPlay;
    int minutesInGame;
    int numberOfGoals;

    void play(int minutesToPlay){
        minutesInGame = minutesInGame + minutesToPlay; // = > minutesInGame +=minutesToPlay;
    }

    void score(){
        numberOfGoals = numberOfGoals + 1 ;
    }

    /*
    *  void score (int goalScore){
    *   numberOfGoals = numberOfGoals + goalScore;
    * }
    * */

}
