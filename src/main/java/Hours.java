
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

    void fillRowsFromNumber(){
        int num = getNumber();
        if (num % 5 == 0) {
            fillTopRow(num);
        }
        if (num <=4 ){
            fillBottomRow(num);
        }

    }

    String[] fillTopRow(int hours){
        int hoursPerLight = 5;
        int numberOfLights = hours / hoursPerLight;
        String red = Symbols.getRed();
        String[] row = getTopRow();
        for (int i = 0; i < numberOfLights; i ++){
            row[i] = red;
        }
        return row;
    }

    String[] fillBottomRow(int hours) {
        String[] row = getBottomRow();
        int hoursPerLight = 1;
        int numberOfLights = row.length;
        String red = Symbols.getRed();
        for (int i = 0; i < numberOfLights; i++){
            row[i] = red;
        }
        return row;
    }

    String[] getTopRow(){
        return topRow;
    }

    String[] getBottomRow(){
        return bottomRow;
    }


}
