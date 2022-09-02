package com.company;

public class Main implements IGame{

    private char[][] gameField;
    private int steps;
    private long gameTime;
    private Gametimer timer;

    public static void main(String[] args) {

    }

    public void Start() {
        gameField = new char[3][3];
        steps = 0;
        timer = new Gametimer();
        timer.start();
    }

    @Override
    public void End() {
        gameTime = timer.end();
    }

    @Override
    public boolean IsWinner() {
        //horizontal and vertical checking
        for(int i = 0;i<3;i++)
        {
            if(gameField[i][0] == gameField[i][1] && gameField[i][1] == gameField[i][2])
                return true;
            if(gameField[0][i] == gameField[1][i] && gameField[1][i] == gameField[2][i])
                return true;
        }
        // another checking(2)
        if(gameField[0][0] == gameField[1][1] && gameField[1][1] == gameField[2][2])
            return true;
        if(gameField[0][2] == gameField[1][1] && gameField[1][1] == gameField[2][0])
            return true;
        return false;
    }

    @Override
    public void NextStep() {
        steps++;
    }
}
