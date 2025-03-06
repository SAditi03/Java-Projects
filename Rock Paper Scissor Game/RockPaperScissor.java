//backend

import java.util.Random;

public class RockPaperScissor {
    //all the choices that a computer can choose
    private static final String[] computerChoices = {"Rock","Paper","Scissor"};

    public String getComputerChoice(){
        return computerChoice;
    }

    public int getComputerScore(){
        return computerScore;
    }

    public int getPlayerScore(){
        return playerScore;
    }


    //store the computer choice so that we can retrieve the value and display it to the frontend
    private String computerChoice;

    //store the scores so that we can retrieve the value and display it to the frontend
    private int computerScore,playerScore;

    //use to generate a random number to randomly choose an option for the computer
    private Random random;

    //constructor - to initialize random object
    public RockPaperScissor(){
        random = new Random();
    }

    //call this method to begin playing rock paper scissor
    //playerChoise - is the choice made by the player(eg. rock,paper,scissor)
    public String playRockPaperScissor(String playerChoice){
        //generate computer choice
        computerChoice = computerChoices[random.nextInt(computerChoices.length)];

        //will contain the returning message indicating the result of the game
        String result;

        //evaluate the winner
        if(computerChoice.equals("Rock")){
            if(playerChoice.equals("Paper")){
                result ="Player Wins.";
                playerScore++;
            }else if(playerChoice.equals("Scissor")){
                result ="Computer Wins.";
                computerScore++;
            }else{
                result ="Draw.";
            }
        }else if(computerChoice.equals("Paper")){
            if(playerChoice.equals("Scissor")){
                result ="Player Wins.";
                playerScore++;
            }else if(playerChoice.equals("Rock")){
                result ="Computer Wins.";
                computerScore++;
            }else{
                result ="Draw.";
            }
        }else{
            if(playerChoice.equals("Rock")){
                result ="Player Wins.";
                playerScore++;
            }else if(playerChoice.equals("Paper")){
                result ="Computer Wins.";
                computerScore++;
            }else{
                result ="Draw.";
            }
        }
        return result;
    }
    
}
