public class RockPaperScissors {
    public static void main(String[] args){
        RockPaperScissorsEnum playerChoice = ValidateInput(args);
        if(playerChoice == RockPaperScissorsEnum.INVALID){
            System.out.println("Invalid input. Please run the program with the following syntax: java RockPaperScissors rock/paper/scissors");
        }
        else
        {
            int computerChoiceInt = (int)(Math.floor((1 + (Math.random() * 3)))); // Get a random integer between 1 and 3
            RockPaperScissorsEnum computerChoice = IntToRockPaperScissors(computerChoiceInt);
            if(computerChoice == playerChoice){
                System.out.println("Tie! Java picked " + computerChoice.toString() + " and you picked " + playerChoice.toString() + ".");
            }
            else if(computerChoice == RockPaperScissorsEnum.PAPER){
                if(playerChoice == RockPaperScissorsEnum.SCISSORS){
                    System.out.println("You win! Java picked " + computerChoice.toString() + " and you picked " + playerChoice.toString() + ".");
                }
                else{
                    System.out.println("You lose! Java picked " + computerChoice.toString() + " and you picked " + playerChoice.toString() + ".");
                }
            }
            else if(computerChoice == RockPaperScissorsEnum.SCISSORS){
                if(playerChoice == RockPaperScissorsEnum.PAPER){
                    System.out.println("You lose! Java picked " + computerChoice.toString() + " and you picked " + playerChoice.toString() + ".");
                }
                else{
                    System.out.println("You win! Java picked " + computerChoice.toString() + " and you picked " + playerChoice.toString() + ".");
                }
            }
            else if(computerChoice == RockPaperScissorsEnum.ROCK){
                if(playerChoice == RockPaperScissorsEnum.PAPER){
                    System.out.println("You win! Java picked " + computerChoice.toString() + " and you picked " + playerChoice.toString() + ".");
                }
                else{
                    System.out.println("You lose! Java picked " + computerChoice.toString() + " and you picked " + playerChoice.toString() + ".");
                }
            }
        }
    }
    public static RockPaperScissorsEnum ValidateInput(String[] args){
        if(args.length != 1){
            return RockPaperScissorsEnum.INVALID;
        }
        if(args[0].equals("rock")){
            return RockPaperScissorsEnum.ROCK;
        }
        if(args[0].equals("paper")){
            return RockPaperScissorsEnum.PAPER;
        }
        if(args[0].equals("scissors")){
            return RockPaperScissorsEnum.SCISSORS;
        }
        return RockPaperScissorsEnum.INVALID;
    }
    public static RockPaperScissorsEnum IntToRockPaperScissors(int number){
        return RockPaperScissorsEnum.values()[number - 1];
    }
}