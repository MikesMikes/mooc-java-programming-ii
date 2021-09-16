/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

import java.util.HashMap;
import java.util.Map;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

/**
 *
 * @author micha
 */
public class GridView {

    private Button[] buttons;
    private int player;

    public GridView(int player) {
        buttons = new Button[9];
        this.player = player;
        init();
    }

    public void init() {
        for (int i = 0; i < 9; i++) {
            buttons[i] = createButton(i);
        }
    }

    public Parent getView() {
        /**
         * for loop 1-9 create buttons method with styling layout. add
         * button[i], for i 0-3 , for j 0-3
         */
        GridPane layout = new GridPane();

        layout.add(buttons[0], 0, 0);
        layout.add(buttons[1], 0, 1);
        layout.add(buttons[2], 0, 2);
        layout.add(buttons[3], 1, 0);
        layout.add(buttons[4], 1, 1);
        layout.add(buttons[5], 1, 2);
        layout.add(buttons[6], 2, 0);
        layout.add(buttons[7], 2, 1);
        layout.add(buttons[8], 2, 2);

        return layout;
    }

    public Button createButton(int i) {
        Button button = new Button(" ");
        button.setFont(Font.font("Monospaced", 40));

        button.setOnMouseClicked((event) ->{
            System.out.println("player: " + player);
            if(player % 2 == 0){
                button.setText("O");
            } else {
                button.setText("X");
            }
            this.player++;
        });

        return button;
    }
}
