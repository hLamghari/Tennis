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
        if(player1.getScore()>=3 && player2.getScore()>=3){
            if(player1.getScore() == player2.getScore()){
                return "deuce";
            }
            if(Math.abs(player1.getScore() - player2.getScore()) == 1){
                if(player1.getScore()>player2.getScore()){
                    return "advantage "+player1.getName();
                }else return "advantage "+player2.getName();
            }
            if(player1.getScore()>player2.getScore()){
                return player1.getName()+" wins";
            }else return player2.getName()+" wins";
        }
        if(player1.getScore() == 4 && player1.getScore() - player2.getScore() > 1){
            return player1.getName()+" wins";
        } else if(player2.getScore() == 4 && player2.getScore() - player1.getScore() > 1){
            return player2.getName()+" wins";
        }
        return scores.get(player1.getScore())+"-"+scores.get(player2.getScore());
    }
}
