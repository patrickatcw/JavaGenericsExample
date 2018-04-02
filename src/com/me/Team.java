package com.me;


//T is type

import java.util.ArrayList;

//step 15 create this class
//public class Team {

//step 28 modify team class
//public class Team<T>{

//step 36 extends Player, then change back steps 31 and 32 below, then back to main step 37
//public class Team<T extends Player>{

//step 47 change for comparing teams, then step 48 comparable method below
public class Team<T extends Player> implements Comparable<Team<T>> {

    //variables
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    //step 16 field
    private String name;

    //step 17 create an arraylist using generics
    //for our player object
    //private ArrayList<Player> members = new ArrayList<>();

    //step 29 modify above
    private ArrayList<T> members = new ArrayList<>();

    //step 18 constructor
    public Team(String name) {
        this.name = name;
    }

    //step 19 getter
    public String getName() {
        return name;
    }

    //step 20 method to add player
    //public boolean addPlayer(Player player) {

    //step 30 Player to T
    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
            //step 31 change getName because we get an error
            //System.out.println(((Player)(player)).getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            //step 32 change getName because we get an error
            //System.out.println(((Player)(player)).getName() + " picked for team " + this.name);
            //step 33 go back to main method

            return true;
        }

    }

    //step 21 method to return size of arraylist
    public int numPlayers() {
        return this.members.size();

    }

    //step 22 method to get result of games
    //public void matchResult(Team opponent, int ourScore, int theirScore) {

    //step 43 change the above for generic type
    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        //step 44 back to main

        //step 40 message
        String message;

        if (ourScore > theirScore) {
            won++;
            //step 40 message
            message = " beat ";
        } else if (ourScore==theirScore) {
            tied++;
            //step 40 message
            message = " drew with ";
        } else {
            lost++;
            //step 40 message
            message = " lost to ";
        }
        played++;
        if (opponent!=null) {
            //step 41 add the sout below
            System.out.println(this.getName() + message + opponent.getName());
            //step 42 back to main to run
            opponent.matchResult(null, theirScore, ourScore);
        }

    }

    //step 23 method for ranking
    public int ranking() {
        return (won * 2) + tied;


        //step 24 to main method

    }

    //step 48 compare method, implement method
    @Override
    public int compareTo(Team<T> team) {
        //step 49
        if(this.ranking() > team.ranking()){
            return -1;
        }else if(this.ranking() < team.ranking()){
            return 1;
        }else {
            return 0;

            //step 50 back to main

        }
    }
}



