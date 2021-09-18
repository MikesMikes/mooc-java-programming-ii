/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

/**
 *
 * @author micha
 */
public class GridView {

    private Button[] buttons;
    private int player;
    private Label turn;
    private boolean finished;

    public GridView(int player, Label label) {
        buttons = new Button[9];
        this.player = player;
        this.turn = label;
        finished = false;
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

        button.setOnMouseClicked((event) -> {

            if (button.getText().equals(" ")) {
                if (player % 2 == 0) {
                    button.setText("O");
                } else {
                    button.setText("X");
                }
                System.out.println("player: " + player);
                this.getState();
                this.player++;
                turn.setText("Turn: " + this.getPlayer());
            }
        });

        return button;
    }

    public String getPlayer() {
        if (this.player % 2 == 0) {
            return "O";
        }
        return "X";
    }

    public Button[] getButtons() {
        return this.buttons;
    }

    public boolean getState() {
        String[][] array = new String[3][3];
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
//                if (array[i][j] == null) {
//                    array[i][j] = " ";
//                }
                array[i][j] = buttons[index].getText();
                System.out.println(Arrays.deepToString(array));
                index++;
            }
        }
        if (this.hasVerticalLine(array) || this.hasHorizontalLine(array) || this.hasDiagonalLine(array)) {
            this.finished = true;
        }
        return false;
    }
    
    /**
     * Add 3 vertical nodes to a list and check if all the same
     * @param String[3][3]
     * @return boolean if there's a line
     */
    private boolean hasVerticalLine(String[][] array) {
        ArrayList<String> line = new ArrayList<>(); 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                line.add(array[i][j]);
            }
            if (hasLine(line)) {
                System.out.println("has Line! " + line.get(i));
            }
            line.clear();
        }
        return false;
    }

    private boolean hasHorizontalLine(String[][] array) {

        return false;
    }

    private boolean hasDiagonalLine(String[][] array) {

        return false;
    }

    private boolean hasLine(ArrayList<String> array) {
        if(array.contains(" ")){
            return false;
        }
        
        for (String i : array) {
            if (!i.equals(array.get(0))) {
                return false;
            }
        }
        return true;
    }
}
