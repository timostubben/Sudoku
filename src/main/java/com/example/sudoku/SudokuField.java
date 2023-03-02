package com.example.sudoku;

import javafx.scene.control.Label;

public class SudokuField extends Label {
    private int x;
    private int y;

    public SudokuField(){
        super();
        x = 0;
        y = 0;

    }
    public SudokuField(String text){
        super();
        super.setText(text);
        x = 0;
        y = 0;

    }
}
