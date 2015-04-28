Feature: add number
  In order to continue with my Sudoku
  As a player
  I want to store a numeric value

  Scenario Outline: Store a number
    Given i've chosen to store number <entrada_1> in my Sudoku
    And i've chosen row <entrada_2>
    And column <entrada_3>
    When i save the value
    Then number stored in chosen position must be <resultado>

    Examples: 
      | entrada_1 | entrada_2 | entrada_3 | resultado |
      | 1         | 2         | 3         | 1         |
      | 5         | 6         | 4         | 5         |
      | 9         | 1         | 5         | 9         |
