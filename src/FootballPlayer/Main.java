package FootballPlayer;

public class Main {
    public static void main(String[] args){
        FootballPlayer ronaldo = new FootballPlayer();

        ronaldo.no = 9;
        ronaldo.name = "Cristiano Ronaldo";
        ronaldo.inPlay = false;
        ronaldo.numberOfGoals = 0;

        System.out.println("Ronaldo have Score of Goals totally " + ronaldo.numberOfGoals);
        System.out.println("Ronaldo played Totally " + ronaldo.minutesInGame);

        ronaldo.play(50);
        ronaldo.score();

        System.out.println("Ronaldo have Score of Goals totally " + ronaldo.numberOfGoals);
        System.out.println("Ronaldo played Totally " + ronaldo.minutesInGame);



        System.out.println("****************");

        FootballPlayer pele = new FootballPlayer();

        pele.no = 9;
        pele.name = "Cristiano Ronaldo";
        pele.inPlay = false;
        pele.numberOfGoals = 0;

        System.out.println("Pele have Score of Goals totally " + pele.numberOfGoals);
        System.out.println("Pele played Totally " + pele.minutesInGame);

        pele.play(50);
        pele.score();
        pele.score();
        pele.play(10);
        pele.score();

        System.out.println("Pele have Score of Goals totally " + pele.numberOfGoals);
        System.out.println("Pele played Totally " + pele.minutesInGame);
    }
}
