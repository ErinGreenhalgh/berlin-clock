public class RowConverter {
    String delimiter = " | ";

    public String convert(String[] row) {
        String result = "";
        for (int i = 0; i < row.length; i ++) {
            if ( i != (row.length - 1)) {
                result = result + row[i] + delimiter;
            } else {
                result = result + row[i];
            }
        }
        return result;
    }
}
