/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.brickbreaker;

import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author maiju
 */
public class BrickBreaker {

    public static void main(String[] args) {
       JFrame obj = new JFrame();
       obj.setTitle("                                                                    Brick Breaker Game");
       obj.setSize(700, 600);
       obj.setLocationRelativeTo(null);
       obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
       obj.setVisible(true);
       obj.setResizable(false);
       
       GamePlay gamePlay=new GamePlay();
       obj.add(gamePlay);
       
                
    }
}
