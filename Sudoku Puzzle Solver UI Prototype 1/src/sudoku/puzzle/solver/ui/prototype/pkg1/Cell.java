/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku.puzzle.solver.ui.prototype.pkg1;
/**
 *
 * @author luskeyg
 */
public class Cell {
    private class Unsolvable extends Exception {
        public Unsolvable () {
            super("Unsolvable Puzzle");
        }
    }
    //Prototype.size is the single length or witdth of the grid
    //possibilities is a boolean array that stores the values that this cell cannot be
    private boolean[] possibilities = new boolean[Prototype.size];
    //probability is 1 divided by (the smallest amount of availible numbers int the box, row, and colums)
    private float probability;
    private int solvedNum;
    private static int total = 0;
    //creating a cell with a solved number or 0 as input
    public Cell(int in){
        //checks if in is between 1 and 9
        if(in >= 1 && in < 10){
            //System.out.print(in);
            //solves this cell with in
            this.Set(in);
        }
        //TODO trow exception if input is invalid
        else if(in != 0){
            //throw new Exception("Input Error");
        }
        //sets all possibilities to true if 0
        for (int i = 0; i < possibilities.length; i++){
            possibilities[i] = true;
        }
    }
    //returns how many possible numbers the cell can be
    public int GetCount(){
        int x = 0;
        for(int i = 0; i < possibilities.length; i++){
            if(possibilities[i] == true){
                x++;
            }
        }
        return x;
    }
    //Returns probability of this cell
    public float GetProbability(){
        //TODO either get the column, row, and box array from the board class or calculate the probability in the board class
        return probability;
    }
    //removes a possibility from this cell
    public void RemoveNumber(int x, Board board){
        //removes a number from the possible numbers; x-1 to compensate for array index
        if(x < 1){
            return;
        }
        //checks if the possibility is still available to prevent deadlock and avoid removing solved possibilities
        if(possibilities[x - 1] == true){
            
            possibilities[x - 1] = false;
            //checks if all cells are unsolved
            if(total < 81){    
                if (IsSolved()){
                    total++;
                    for(int i = 0; i < Prototype.size; i++){
                        if(possibilities[i] == true){
                            solvedNum = i + 1;
                        }
                    }
                    board.RemovePossability(this, this.solvedNum);
                    
                }
            }
        }
    }
    //returns if there is only 1 possibility
    public boolean IsSolved() {
        if(GetCount() == 1){
            //if there is only one possibility the cell has a gaurenteed answer
            
            return true;
        }
        else if(GetCount() == 0){
            //if there are no possibilites than this cell cannot be solved therefore the board cannot be solved
            try{
            throw new Unsolvable();
            } catch (Unsolvable e){}
        }
        return false;
    }
    //returns the solved number
    public int SolvedNumber(){
        if(IsSolved()){
            return solvedNum;
        }
        else { return 0; }
    }
    //removes every possibility except x
    public void Set(int x){
        //allows the cell to be set as solved by removing every possibility but the one provided; namely x
        for(int i = 0; i < Prototype.size; i++){
            if(i + 1 != x){
                possibilities[i] = false;
            }
        }
        total++;
        solvedNum = x;
    }
}

