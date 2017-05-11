/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku.puzzle.solver.ui.prototype.pkg1;
import java.lang.String;
import static java.lang.System.out;
/**
 *
 * @author luskeyg
 */

public class Board {
    //redundant arrays assorted differently
    private static Cell[][] Columns = new Cell[Prototype.size][Prototype.size];
    private static Cell[][] Rows = new Cell[Prototype.size][Prototype.size];
    private static Cell[][] Boxs = new Cell[Prototype.size][Prototype.size]; //3x3 squares
    private static Cell last;
    private int tmpTotal;
    //TODO use this as output file or just return a string of the data
    private class Unsolvable extends Exception {
        public Unsolvable () {
            super("Unsolvable Puzzle");
        }
    }
    //board constructor; Gets the string generated from board or from file
    public Board(String input) {
        //throws exeption if the input string does not fill or fills too many cells on the board
        if(input.length() != Prototype.size*Prototype.size){
            //throw new Exception("Input Error");
        }
        int inc = 0;
        for(int i = 0; i < Prototype.size; i++){
            for(int j = 0; j < Prototype.size; j++){
                //System.out.print(Character.getNumericValue(input.charAt(inc)));
                Cell newCell = new Cell(Character.getNumericValue(input.charAt(inc)));
                //go through each of the characters in the string; i*j is the length times width of the current cell.
                
                Rows[i][j] = newCell;
                Columns[j][i] = newCell;
                inc++;
            }
        }
        SetSquares();
    }
    //converts rows format to squares format
    private void SetSquares() {
        for(int i = 0; i < Rows.length; i++){
            for (int j = 0; j < Rows[i].length; j++){
                if (i < 3){
                    Boxs[(j/3)][j%3+((i)*3)] = Rows[i][j];
                    //System.out.println((j/3) + " " + (j%3+((i)*3)));
                } else if(i < 6){
                    Boxs[(j/3+3)][(j%3+((i-3)*3))] = Rows[i][j];
                    //System.out.println((j/3+3) + " " + (j%3+((i-3)*3)));
                } else if (i < 9) {
                    Boxs[(j/3+6)][(j%3+((i-6)*3))] = Rows[i][j];
                    //System.out.println((j/3+6) + " " + (j%3+((i-6)*3)));
                }
                
    
            }
        }
    }
    //TODO break out of or pause recursion
    /*
    public Cell[][] Step(){
        tmpTotal = Cell.total;
        if(last == null)
        for(int i = 0; i < Prototype.size; i++){
            for(int j = 0; j < Prototype.size; j++){
                if(Rows[i][j].IsSolved()){
                    
                    last = Rows[i][j];
                    RemovePossability(last, last.SolvedNumber());
                    break;
                }
                if(tmpTotal != Cell.total)
                    break;
            }
            if(tmpTotal != Cell.total)
                break;
        }
    
            
        
        return Boxs;
    }
*/
    //Solves entire puzzle
    public Cell[][] Start(){
        //loops through rows until board is solved/no moves left
        for(int i = 0; i < Prototype.size; i++){
            for(int j = 0; j < Prototype.size; j++){
                if(Rows[i][j].IsSolved()){
                    RemovePossability(Rows[i][j],Rows[i][j].SolvedNumber());
                }
            }
        }
        //TODO test if this loop is neccisary, could be redundant
        for(int i = 0; i < Prototype.size; i++){
            for(int j = 0; j < Prototype.size; j++){
                if(Columns[i][j].IsSolved()){
                    RemovePossability(Columns[i][j],Columns[i][j].SolvedNumber());
                }
            }
        }
        //TODO test if this loop is neccisary, could be redundant
        for(int i = 0; i < Prototype.size; i++){
            for(int j = 0; j < Prototype.size; j++){
                if(Boxs[i][j].IsSolved()){
                    RemovePossability(Boxs[i][j],Boxs[i][j].SolvedNumber());
                }
            }
        }
        return Boxs;
    }
    //removes a possivility from the cells in the row, column, and box that the passed cell is in.
    public void RemovePossability(Cell c, int poss){
        rowcolumnloop:
        for(int i = 0; i < Rows.length; i++){
            for (int j = 0; j < Rows[i].length; j++){
                //finds row and column the passed cell is in
                if (Rows[i][j].equals(c)){
                    RemoveRow(i, poss);
                    RemoveColumn(j, poss);
                    break rowcolumnloop;
                }
                
            }
        }
        boxloop:
        for(int i = 0; i < Boxs.length; i++){
            for (int j = 0; j < Boxs[i].length; j++){
                //finds box the passed cell is in
                if (Boxs[i][j].equals(c)){
                    RemoveBox(i, poss);
                    break boxloop;
                }
            }
        }
    }
    public void RemoveRow(int x, int poss){
        //removes the possibility passed from all cells except the cell at x
        for(int i = 0; i < Rows[x].length; i++){
            if(!Rows[x][i].IsSolved()){
                Rows[x][i].RemoveNumber(poss, this);
            }
        }
    }
    public void RemoveColumn(int x, int poss){
        //removes the possibility passed from all cells except the cell at x
        for(int i = 0; i < Rows[x].length; i++){
            if(!Columns[x][i].IsSolved()){
                Columns[x][i].RemoveNumber(poss, this);
            }
        }
    }
    public void RemoveBox(int x, int poss){
        //removes the possibility passed from all cells except the cell at x
        for(int i = 0; i < Boxs[x].length; i++){
            if(!Boxs[x][i].IsSolved()){
                Boxs[x][i].RemoveNumber(poss, this);
            }
                }
        
    }
    //prints input format string from boxs and rows
    public void DebugPrint(){
        System.out.println();
        System.out.print("Boxs: ");
        //Prints out the boxs array
        for (Cell[] Box : Boxs) {
            for (Cell x : Box) {
                try{
                    System.out.print(x.SolvedNumber());
                } catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println();
        System.out.print("Rows: ");
        for(int i = 0; i < 9; i++){
         for(int j = 0; j < 9; j++){
            
            System.out.print(Rows[i][j].SolvedNumber());
         }
        }
    }
    //simple function to return boxs
    public Cell[][] GetBoxs(){
     return Boxs;
    }
            
            
}

