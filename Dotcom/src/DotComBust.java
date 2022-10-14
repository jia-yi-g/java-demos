import java.util.ArrayList;

public class  DotComBust{
    GameHelper helper=new GameHelper();
    ArrayList<DotCom> dotComList=new ArrayList<DotCom>();
    int numOfGuess=0;

    private void setUpGame(){
        DotCom one=new DotCom();
        one.setName("1.com");

         DotCom two=new DotCom();
        one.setName("2.com");
         DotCom three=new DotCom();
        one.setName("3.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);
        System.out.println("Your goal is to sink three dot coms");

        for(DotCom dotComSet : dotComList){
            ArrayList<String> newLocation =helper.placeDotCom(3);
            dotComSet.setLocationCells(newLocation);
        }

    }
    private void startPlaying() {
        while (!dotComList.isEmpty()){
            String userGuess=helper.getUserInput("Enter a guess");
      checkUserGuess(userGuess);
        }
        finishGame();
    }
    private void checkUserGuess(String userGuess) {
        numOfGuess++;
        String result="miss";

        for(DotCom dotComToTest : dotComList){
            result=dotComToTest.checkYourself(userGuess);
            if(result.equals("hit")){
                break;
            }
            if(result.equals("kill")){
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }
    private void finishGame(){

    }
    public static void main(String[] args){
      DotComBust game = new DotComBust();
      game.setUpGame();
      game.startPlaying();  
    }
}
