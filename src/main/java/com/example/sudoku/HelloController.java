package com.example.sudoku;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class HelloController {

    @FXML
    private GridPane grid;
    @FXML
    private Button b_One, b_Two, b_Three, b_Four, b_Five, b_Six, b_Seven, b_Eight, b_Nine;
    private Button[] numButtons;

    @FXML
    private SudokuField
            label_0_0, label_0_1 ,label_0_2 ,label_0_3 ,label_0_4 ,label_0_5 ,label_0_6 ,label_0_7 ,label_0_8 ,
            label_1_0 ,label_1_1 ,label_1_2 ,label_1_3 ,label_1_4 ,label_1_5 ,label_1_6 ,label_1_7 ,label_1_8 ,
            label_2_0 ,label_2_1 ,label_2_2 ,label_2_3 ,label_2_4 ,label_2_5 ,label_2_6 ,label_2_7 ,label_2_8 ,
            label_3_0 ,label_3_1 ,label_3_2 ,label_3_3 ,label_3_4 ,label_3_5 ,label_3_6 ,label_3_7 ,label_3_8 ,
            label_4_0 ,label_4_1 ,label_4_2 ,label_4_3 ,label_4_4 ,label_4_5 ,label_4_6 ,label_4_7 ,label_4_8 ,
            label_5_0 ,label_5_1 ,label_5_2 ,label_5_3 ,label_5_4 ,label_5_5 ,label_5_6 ,label_5_7 ,label_5_8 ,
            label_6_0 ,label_6_1 ,label_6_2 ,label_6_3 ,label_6_4 ,label_6_5 ,label_6_6 ,label_6_7 ,label_6_8 ,
            label_7_0 ,label_7_1 ,label_7_2 ,label_7_3 ,label_7_4 ,label_7_5 ,label_7_6 ,label_7_7 ,label_7_8 ,
            label_8_0 ,label_8_1 ,label_8_2 ,label_8_3 ,label_8_4 ,label_8_5 ,label_8_6 ,label_8_7 ,label_8_8 ;

    private SudokuField[][] allSudokuFields;
    private SudokuField selectedSudokuField;

    @FXML private Label test;

    protected void setNumber(String num){
        selectedSudokuField.setText(num);
    }

    protected void setSelectedSudokuField(SudokuField clicked){
        selectedSudokuField = clicked;
    }
    public void initialize(){
        selectedSudokuField = new SudokuField("Timo der KEK");

        numButtons = new Button[]{b_One, b_Two, b_Three, b_Four, b_Five, b_Six, b_Seven, b_Eight, b_Nine};
        for (Button b : numButtons){
            b.setOnAction(event -> setNumber(b.getText()));
        }
        allSudokuFields = new SudokuField[][]{{
                label_0_0, label_0_1 ,label_0_2 ,label_0_3 ,label_0_4 ,label_0_5 ,label_0_6 ,label_0_7 ,label_0_8
            },{
                label_1_0 ,label_1_1 ,label_1_2 ,label_1_3 ,label_1_4 ,label_1_5 ,label_1_6 ,label_1_7 ,label_1_8
            },{
                label_2_0 ,label_2_1 ,label_2_2 ,label_2_3 ,label_2_4 ,label_2_5 ,label_2_6 ,label_2_7 ,label_2_8
            },{
                label_3_0 ,label_3_1 ,label_3_2 ,label_3_3 ,label_3_4 ,label_3_5 ,label_3_6 ,label_3_7 ,label_3_8
            },{
                label_4_0 ,label_4_1 ,label_4_2 ,label_4_3 ,label_4_4 ,label_4_5 ,label_4_6 ,label_4_7 ,label_4_8
            },{
                label_5_0 ,label_5_1 ,label_5_2 ,label_5_3 ,label_5_4 ,label_5_5 ,label_5_6 ,label_5_7 ,label_5_8
            },{
                label_6_0 ,label_6_1 ,label_6_2 ,label_6_3 ,label_6_4 ,label_6_5 ,label_6_6 ,label_6_7 ,label_6_8
            },{
                label_7_0 ,label_7_1 ,label_7_2 ,label_7_3 ,label_7_4 ,label_7_5 ,label_7_6 ,label_7_7 ,label_7_8
            },{
                label_8_0 ,label_8_1 ,label_8_2 ,label_8_3 ,label_8_4 ,label_8_5 ,label_8_6 ,label_8_7 ,label_8_8
            }
        };
        for (SudokuField[] sArray : allSudokuFields){
            for(SudokuField s : sArray){
                s.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
                    setSelectedSudokuField(s);
                });
            }
        }
    }
}