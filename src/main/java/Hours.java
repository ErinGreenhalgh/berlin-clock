
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

    void fillRowsFromNumber(int num){
        if (num % 5 == 0) {
            fillRow(num, getTopRow(), 5);
        } else if (num <= 4 ) {
            fillRow(num, getBottomRow(), 1);
        } else if (num % 5 != 0) {
            int remainder = num % 5;
            int newNumber = num - remainder;
            fillRowsFromNumber(remainder);
            fillRowsFromNumber(newNumber);
        }

    }

    String[] fillRow(int number, String[] row, int hoursPerLight){
        int numberOfLights = number / hoursPerLight;
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
