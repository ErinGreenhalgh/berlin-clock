public class Clock {
    public static void main(String[] args){
        //read in a number of hours from the command line
        String numberOfHours = args[0];
        Hours hoursCalculator = new Hours();

        //pass that number to Hours class to get a representation
        String[][] hours = hoursCalculator.display(Integer.parseInt(numberOfHours));

        //print out the representation
        RowConverter converter = new RowConverter();
        for (String[] row: hours) {
            String displayData = converter.convert(row);
            System.out.println(displayData);
        }
    }
}
