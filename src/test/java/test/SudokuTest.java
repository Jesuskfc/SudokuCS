package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
import com.grupo6.Sudoku.model.Game;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class SudokuTest {
    private Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void setNumber() {
        game.setNumber(1,1,5);
        assertEquals(5,game.getNumber(1,1));
    }
    
    @After
    public void tearDown() {
        game = null;
    }
}