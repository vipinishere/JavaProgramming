public class RecurssionBasics {

    // print number in decreasing order
    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    // print number in increasing order
    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    // find factorial of a number n
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fn = n * fact(n-1);
        return fn;
    }

    // find Nth fibonacci number
    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1  = fibo(n-1);
        int fnm2 = fibo(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    // sum of all n natural numbers
    public static int sumNaturalNumbers(int n) {
        if (n == 0) {
            return 0;
        }
        int sum = n + sumNaturalNumbers(n-1);
        return sum;
    }

    // check is a given array is sorted or not ?
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length -1) {
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }

    // find the first occurence of an element in an array 
    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    // print last occurence  of a element in a array
    public static int lastOccurence(int arr[], int key, int i) {
        // Base Case
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        // kaam
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;

    }

    // print X^n
    public static int power(int x, int n) {
        // Base Case
        if (n == 1) {
            return x;
        }
        // kaam
        return x * power(x,n-1);
    }

    // calculate power of x in O(logn);
    public static int optimisedPower(int x ,int n) {
        // Base Case
        if (n == 1) {
            return x;
        }
        int halfPower = optimisedPower(x, n/2);
        int halfPowerSq = (int) Math.pow(halfPower, 2);
        if (n % 2 != 0) {
            return x * halfPowerSq;
        }
        return halfPowerSq;
    }

    // Tiling problem
    /*
        given a "2 * n" board(floor) and tiles of size "2*1" count the number of ways to tile the board using the "2*1" tiles
        (a tile can either be placed horizontally or vertically)
    */
    public static int tilingProblem(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // // vertical choice 
        // int fnm1 = tilingProblem(n-1);
        // // horizontally choice 
        // int fnm2 = tilingProblem(n-2);

        // int totalWays = fnm1 + fnm2;
        // return totalWays;
               //or
        return tilingProblem(n-1) + tilingProblem(n-2);
    }

    // Remove duplicate latters from a string 
    public static void removeDuplicates(String str, StringBuilder newStr, int i, boolean map[]) {
        // base case
        if (i == str.length()) {
            System.out.println(newStr);
            return;   
        }
        char currChar = str.charAt(i);
        if (map[currChar-'a'] == true ) {
            removeDuplicates(str, newStr, i+1, map);
        } else {
            map[currChar-'a'] = true;
            removeDuplicates(str, newStr.append(currChar), i+1, map);
        }
    }

    // Friens pairing problem 
    public static int friendPairing(int n) {
        // base case 
        if (n == 1 || n == 2) {
            return n;
        }
        // single
        int fnm1 = friendPairing(n-1);

        // pair
        int fnm2 = friendPairing(n-2);
        int pairWays = (n-1) * fnm2;

        // totalways
        int totalWays = fnm1 + pairWays;
        return totalWays;
        // return friendPairing(n-1) + ((n-1) * friendPairing(n-2));
    }

    // Binary String Problem
    // print all binary strings of size n without consecution
    public static void printBinary(int n, int  lastPlace, String str) {
        // Base Case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // kamm
        
        // if(lastPlace == 1) {
        //     printBinary(n-1, 0, str+"0");
        // }
        // printBinary(n-1, 1, str+"1");
        if (lastPlace == 1) {
            printBinary(n-1, 0, str+"0");
        } else {
            printBinary(n-1, 0, str+"0");
            printBinary(n-1, 1, str+"1");
        }
    }


    public static void main(String[] args) {
        // int n = 10;
        // printDec(n);
        // System.out.println();
        // printInc(n);
        // System.out.println();
        // System.out.println(fact(6));
        // System.out.println(fibo(6));
        // System.out.println(sumNaturalNumbers(10));
        // int[] arr = {1,2,3,4,5};
        // System.out.println(isSorted(arr, 0));
        // isSorted(arr, 0);
        // int[] arr = {8,3,6,9,5,10,2,5,3};
        // System.out.println(firstOccurence(arr, 5, 0));
        // System.out.println(lastOccurence(arr, 10, 0));
        // System.out.println(power(10,2));
        // System.out.println(optimisedPower(2, 5));
        // String str = "apnacollege";
        // StringBuilder newStr = new StringBuilder();
        // boolean map[] = new boolean[26];
        // removeDuplicates(str, newStr, 0, map);
        String str = "";
        printBinary(3, 0, str);
    }
}