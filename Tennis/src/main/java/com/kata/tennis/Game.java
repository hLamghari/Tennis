/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kata.tennis;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author hlamghari
 */
public class Game {
    private Player player1;
    private Player player2;
    private List<String> scores = Arrays.asList("love", "fifteen", "thirty", "forty");
    
    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    
    public String score(){
        if(player1.getScore()==3 && player2.getScore()==3){
            return "deuce";
        }
        return scores.get(player1.getScore())+"-"+scores.get(player2.getScore());
    }
}
