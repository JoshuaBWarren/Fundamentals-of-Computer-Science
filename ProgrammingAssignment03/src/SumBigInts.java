// This program reads an input file that contains sequences of integers to
// be added together.  The program reads them as Strings so that it can
// process large integers.  Reset the constant DIGITS to allow it to handle
// larger integers.

import java.io.*;
import java.util.*;

public class SumBigInts {
    public static final int MAX_DIGITS = 25;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("sum.txt"));
        processFile(input);
    } 

// more methods follow for i/o and add and .....

}