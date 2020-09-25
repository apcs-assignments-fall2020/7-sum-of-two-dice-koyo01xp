import java.util.Scanner;

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        // REPLACE YOUR CODE HERE
        int a = (int)(Math.random()*6) + 1;
        return a;
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        int [] first = new int[n];
        int [] second = new int[n];
        for (int i = 0; i < n ; i++){ //arrays for the first and second dice 
            first[i] = rollDie();
            second[i] = rollDie();
        }
        int [] sum = new int[n];
        for (int a = 0; a < n ; a++){ //arrays for the sum
            sum[a] = first[a] + second[a];
        }
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;
        int counter7 = 0;
        int counter8 = 0;
        int counter9 = 0;
        int counter10 = 0;
        int counter11 = 0;
        int counter12 = 0;
        for (int b = 0; b < n ; b++) {
            if (sum[b] == 2) {
                counter2++;
            }
            if (sum[b] == 3) {
                counter3++;
            }
            if (sum[b] == 4) {
                counter4++;
            }
            if (sum[b] == 5) {
                counter5++; 
            }
            if (sum[b] == 6) {
                counter6++; 
            }
            if (sum[b] == 7) {
                counter7++; 
            }
            if (sum[b] == 8) {
                counter8++; 
            }
            if (sum[b] == 9) {
                counter9++; 
            }
            if (sum[b] == 10) {
                counter10++; 
            }
            if (sum[b] == 11) {
                counter11++; 
            }
            if (sum[b] == 12) {
                counter12++; 
            }
        }
        int[] output = {counter2, counter3, counter4,counter5,counter6,counter7,counter8,counter9,counter10,counter11,counter12};
        return output;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pair of dice would you like to roll?");
        int answer = scan.nextInt();
        scan.close();

        System.out.println(answer);
        int [] a = sumOfTwoDice(answer);
        int counterTotal = 0;
        for (int i = 0;i <11;i++) {
            counterTotal+= a[i];
        }
        for (int i = 0;i <11;i++) {
            double z = (a[i] / (double)counterTotal)*100;
            System.out.println("% of rolls where sum == " + (i + 2) + ": " + z);
        }
    }
}
