/*
Returns the bank account number parsed from specified string.

 You work for a bank, which has recently purchased an ingenious machine to assist in reading letters and faxes sent in by branch offices.
 The machine scans the paper documents, and produces a string with a bank account that looks like this:
 _     _  _     _  _  _  _  _
| |  | _| _||_||_ |_   ||_||_|
|_|  ||_  _|  | _||_|  ||_| _|
 Each string contains an account number written using pipes and underscores.
 Each account number should have at least one digit, all of which should be in the range 0-9.

 Your task is to write a function that can take bank account string and parse it into actual account numbers.
*/

import java.util.Arrays;

public class BankAccount {
    public static void main(String[] args) {
    parse(   		" _  _  _  _  _  _  _  _  _ \n"+
                    "| | _| _|| ||_ |_   ||_||_|\n"+
                    "|_||_  _||_| _||_|  ||_| _|\n");
    }
    public static long parse(final String acctNbr) {
        final String zero = "_|||_|";
        final String one = "||";
        final String two = "__||_";
        final String three = "__|_|";
        final String four = "|_||";
        final String five = "_|__|";
        final String six = "six";
        final String seven = "_||";
        final String eight = "_|_||_|";
        final String nine = "_|_|_|";
        int range = 0;

        String[] toParse = acctNbr.split("\\r?\\n");
        int[] bankAccount = new int[toParse[0].length() / 3];
        String[] number = new String[toParse[0].length() / 3];
        for (int i = 0; i < number.length; i++){
            number[i] = toParse[0].substring(range, range+3) +  toParse[1].substring(range, range+3) + toParse[2].substring(range, range+3);
            if (number[i].equals(" _ |_ |_|"))number[i] = "six";
            switch (number[i].replace(" ", "")){
                case zero:
                    bankAccount[i] = 0;
                    break;
                case one:
                    bankAccount[i] = 1;
                    break;
                case two:
                    bankAccount[i] = 2;
                    break;
                case three:
                    bankAccount[i] = 3;
                    break;
                case four:
                    bankAccount[i] = 4;
                    break;
                case five:
                    bankAccount[i] = 5;
                    break;
                case six:
                    bankAccount[i] = 6;
                    break;
                case seven:
                    bankAccount[i] = 7;
                    break;
                case eight:
                    bankAccount[i] = 8;
                    break;
                case nine:
                    bankAccount[i] = 9;
            }
            range +=3;
        }
        String toString = Arrays.toString(bankAccount).replace("[","").replace(",", "")
                .replace(" ","").replace("]", "");
        long accountNumber = Long.parseLong(toString);
        return accountNumber;
    }
