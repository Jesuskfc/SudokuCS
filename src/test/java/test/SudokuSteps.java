/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import com.grupo6.Sudoku.model.Game;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;
 
import cucumber.api.PendingException;
 
public class SudokuSteps {
    private Game game;
    private int number;
    private int row;
    private int column;
    
  @Given("^i've chosen to store number (\\d+) in my Sudoku$")
  public void number_is_chosen(int arg1) throws Throwable {
    game = new Game();
    number = arg1;
  }
  
  @Given("^i've chosen row (\\d+)$")
  public void row_is_chosen(int arg1) throws Throwable {
    row = arg1;
  }
  
  @Given("^column (\\d+)$")
  public void column_is_chosen(int arg1) throws Throwable {
    column = arg1;
  }
 
  @When("^i save the value$")
  public void value_stored() throws Throwable {
    game.setNumber(row, column, number);
  } 
  
  @Then("^number stored in chosen position must be (\\d+)$")
  public void number_stored_is(int arg1) throws Throwable {
    assertEquals(number,game.getNumber(row,column));
  }

}