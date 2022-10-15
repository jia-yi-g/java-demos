import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> localtionCells;
    public void setLocationCells(ArrayList<String> loc){
        localtionCells =loc;
    }

    private String name;
    public void setName(String string) {
        name=string;
    }
    public String checkYourself(String userInput){
        String result="miss";
        int index=localtionCells.indexOf(userInput);
        if(index>=0){
            localtionCells.remove(index);
            if(localtionCells.isEmpty()){
                result="kill";
            }
            else{
                result="hit";
            }
        }
    
    return result;
}
}
