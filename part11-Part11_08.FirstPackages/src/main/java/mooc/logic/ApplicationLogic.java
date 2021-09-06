/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;

import mooc.ui.UserInterface;
/**
 *
 * @author micha
 */
public class ApplicationLogic {
    
    private UserInterface text;

    public ApplicationLogic(UserInterface ui) {
        this.text = ui;
    }

    public void execute(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Applicatio logic is working");
            this.text.update();
        }
    }
}
