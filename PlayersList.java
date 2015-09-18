import java.util.*;

public class PlayersList
{
  public static final int MINIMUM_PLAYER_COUNT = 2;
  public static final int MAXIMUM_PLAYER_COUNT = 4;
  private static int totalPlayerNumber; //final player count

  //constructor
  public PlayersList(){
  }





  //asks for a number of players and checks between min and max
  public static int countingPlayers(){
    Scanner keyboardIn = new Scanner(System.in);
    System.out.println("How many players? (between " + MINIMUM_PLAYER_COUNT + " and " + MAXIMUM_PLAYER_COUNT + ")");
    try{
      setTotalPlayers(Integer.parseInt(keyboardIn.nextLine()));
    }
    catch(Exception e){
      System.out.println("That was not even a whole number... try again");
      return countingPlayers();
    }
    if (totalPlayerNumber < MINIMUM_PLAYER_COUNT || totalPlayerNumber > MAXIMUM_PLAYER_COUNT){
      System.out.println("That was not between " + MINIMUM_PLAYER_COUNT + " and " + MAXIMUM_PLAYER_COUNT + "... try again (between " + MINIMUM_PLAYER_COUNT + " and " + MAXIMUM_PLAYER_COUNT + ")");
      return countingPlayers();
      }
    else {
      return totalPlayerNumber;
      }
    }

  //asks for an inputed number and then checks to see if its an integer

  public static void setTotalPlayers(int totalP){
        totalPlayerNumber = totalP;
    }
  public int getTotalPlayers()
  {
    return totalPlayerNumber;
  }

}
