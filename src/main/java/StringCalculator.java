import java.util.Arrays;
import java.util.List;

public class StringCalculator {
    public int add(String input) throws Exception {
        if (input.length() < 1) {
            return 0;
        }

        String delimiter = "";

        if(input.indexOf("/") > -1){
            delimiter = input.substring(2,3);
            input = input.substring(4);
        } else {
            delimiter = ",|\n";
        }

        int ifInputContainsComma = input.indexOf(",");
        int ifInputContainsNewRow = input.indexOf("\n");

        if (ifInputContainsComma > -1 || ifInputContainsNewRow > -1 || !delimiter.equals(",|\n")) {

            List<String> strList = Arrays.asList(input.split(",|\n|" + delimiter));
            int sumOfIntegers = 0;
            for (String str : strList) {
                if (Integer.parseInt(str) < 0){
                    throw new Exception("Contains negative number" + Integer.parseInt(str));
                }
                sumOfIntegers += Integer.parseInt(str);
            }
            return sumOfIntegers;
        }

        if (Integer.parseInt(input) < 0){
            throw new Exception("Contains negative number " + input);
        }
        int inputNumber = Integer.parseInt(input);
        return inputNumber;
    }
}

