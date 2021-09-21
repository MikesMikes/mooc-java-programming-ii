/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

import java.util.ArrayList;
import javafx.application.Platform;
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

    private Button[][] buttons;
    private int player;
    private Label turn;
    private boolean finished;

    public GridView(int player, Label label) {
        buttons = new Button[3][3];
        this.player = player;
        this.turn = label;
        finished = false;
        init();
    }

    public void init() {
        for (int i = 0; i < buttons[0].length; i++) {
            for (int j = 0; j < buttons[0].length; j++) {
                buttons[i][j] = createButton();
            }
        }
    }

    public Parent getView() {
        /**
         * for loop 1-9 create buttons method with styling layout. add
         * button[i], for i 0-3 , for j 0-3
         */
        GridPane layout = new GridPane();

        layout.add(buttons[0][0], 0, 0);
        layout.add(buttons[0][1], 0, 1);
        layout.add(buttons[0][2], 0, 2);
        layout.add(buttons[1][0], 1, 0);
        layout.add(buttons[1][1], 1, 1);
        layout.add(buttons[1][2], 1, 2);
        layout.add(buttons[2][0], 2, 0);
        layout.add(buttons[2][1], 2, 1);
        layout.add(buttons[2][2], 2, 2);

        return layout;
    }

    public Button createButton() {
        Button button = new Button(" ");
        button.setFont(Font.font("Monospaced", 40));

        button.setOnMouseClicked((event) -> {

            if (button.getText().equals(" ") && !finished) {
                if (player % 2 == 0) {
                    button.setText("O");
                } else {
                    button.setText("X");
                }
                System.out.println("player: " + player);
                this.getState();
                if (finished) {
                    turn.setText("The end!");
                } else {
                    this.player++;
                    turn.setText("Turn: " + this.getPlayer());
                }
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

    public boolean getState() {
        if (hasVerticalLine() || hasHorizontalLine() || hasBackwardSlash() || hasForwardSlash()) {
            this.finished = true;
            System.out.println("Finished? " + finished);
            return true;
        }
        return false;
    }

    /**
     * Add 3 vertical nodes to a list and check if all the same
     *
     * @param String[3][3]
     * @return boolean if there's a line
     */
    private boolean hasVerticalLine() {
        ArrayList<String> line = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                line.add(buttons[i][j].getText());
            }
            if (hasLine(line)) {
                System.out.println("has vertical Line! " + line.get(i));
                return true;
            }
            line.clear();
        }
        return false;
    }

    private boolean hasHorizontalLine() {
        ArrayList<String> line = new ArrayList<>();
        for (int i = 0; i < buttons[0].length; i++) {
            for (int j = 0; j < buttons[0].length; j++) {
                line.add(buttons[j][i].getText());
            }
            if (hasLine(line)) {
                System.out.println("has Horizontal line!" + line.get(i));
                return true;
            }
            line.clear();
        }
        return false;
    }

    private boolean hasBackwardSlash() {
        ArrayList<String> line = new ArrayList<>();
        for (int j = 0; j < buttons[0].length; j++) {
            line.add(buttons[j][j].getText());
        }
        if (hasLine(line)) {
            System.out.println("Has backward diagonal line!" + line.get(0));
            return true;
        }
        return false;
    }

    private boolean hasForwardSlash() {
        ArrayList<String> line = new ArrayList<>();
        for (int i = 0, j = buttons[0].length - 1; i < buttons[0].length; i++, j--) {
            line.add(buttons[i][j].getText());
        }
        if (hasLine(line)) {
            System.out.println("Has forward diagonal line!" + line.get(0));
            return true;
        }
        return false;
    }

    private boolean hasLine(ArrayList<String> array) {
        if (array.contains(" ")) {
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
