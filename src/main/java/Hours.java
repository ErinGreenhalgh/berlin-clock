
public class Hours {
    int number;
    String[] topRow = new String[4];
    String[] bottomRow = new String[4];

    public Hours(int numberOfHours){
        number = numberOfHours;
    }

    int getNumber(){
        return number;
    }

    void setTopRow(){
        String off = Symbols.getOff();
        topRow[0] = off;
        topRow[1] = off;
        topRow[2] = off;
        topRow[3] = off;
    }

    void setBottomRow(){
        String off = Symbols.getOff();
        bottomRow[0] = off;
        bottomRow[1] = off;
        bottomRow[2] = off;
        bottomRow[3] = off;
    }
    

    String[] getTopRow(){
        return topRow;
    }

    String[] getBottomRow(){
        return bottomRow;
    }


}
