package com.me;

public class Main {

    /*public static void main(String[] args) {

        //arraylist example shown before generics example
        //step 1 variables, note Integer, diamonds
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        //can't put this in, error occurs
        //b/c trying to add a string to an arraylist object
        //items.add("Patrick");
        items.add(3);
        items.add(4);
        items.add(5);

        //sttep 2 calling the method
        printDoubled(items);

    }

        //step 3 method
    private static void printDoubled(ArrayList<Integer> n){

        for(int i : n){

            System.out.println(i * 2);

            //step 4 run this
            *//*
            results;
            2
            4
            6
            8
            10
             *//*

        }

    }*/

    public static void main(String[] args) {

        //step 24 instances for players
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer ("Beckham");

        //step 25 instances for teams
        //Team adelaideCrows = new Team("Adelaide Crows");

        //step 33 change the above
        Team <FootballPlayer>adelaideCrows = new Team<>("Adelaide Crows");

        //step 26 calling method to add player to team
        adelaideCrows.addPlayer(joe);
        //commented out for step 34
        /*adelaideCrows.addPlayer(pat);
        adelaideCrows.addPlayer(beckham);*/

        //step 27 print
        System.out.println(adelaideCrows.numPlayers());
        /*
        results;
            Joe picked for team Adelaide Crows
            Pat picked for team Adelaide Crows
            Beckham picked for team Adelaide Crows
            3*/
        //problem is we need a check for type of player goes on
        // right kind of team
        //solution - generics, modify team to be a generic class

        //step 28 go to team class

        //step 34 add a baseball team class
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        //step 35 validation
        //Team<String> brokenTeam = new Team<>("this won't work");
        //brokenTeam.addPlayer("no-one");
        //step 37 change above to....
        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer(beckham);

        //step 38 calls for adding and results
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordan");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorne = new Team<>("Hawthorne");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorne.matchResult(fremantle, 1, 0);
        hawthorne.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
        //adelaideCrows.matchResult(baseballTeam, 2, 1);
        //step 44 comment above out because we get error on baseballTeam

        //step 45 print rankings
        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorne.getName() + ": " + hawthorne.ranking());
        //step 46 run

        //step 47 back to team for comparing

        //step 50 back from team
        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorne));
        System.out.println(hawthorne.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));
        //step 51 run and done...finally!!!

        //step 39 run

        //step 40 put message in team class in matchResult method

        //step 42 run, back from team step 41

        //step 43 back to team to code for matching teams for playing each other

        //step 36 got to team class

    }

}


/*
final results;
Joe picked for team Adelaide Crows
1
Pat picked for team Chicago Cubs
Beckham picked for team this won't work
Gordan picked for team Melbourne
Hawthorne beat Fremantle
Hawthorne lost to Adelaide Crows
Adelaide Crows beat Fremantle
Rankings
Adelaide Crows: 4
Melbourne: 0
Fremantle: 0
Hawthorne: 2
-1
-1
1
0
 */

