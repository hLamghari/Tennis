/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kata.tennis;

/**
 *
 * @author hlamghari
 */
public class Player {
    private int score = 0;

    public int getScore() {
        return score;
    }
    
    public void hasScored(){
        score++;
    }
}
