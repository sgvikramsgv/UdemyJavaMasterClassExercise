import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("------------CheckNumber------------");
//        checkNumber(10);
//        System.out.println("------------printConversion------------");
//        printConversion(-10.0);
//        System.out.println("------------printMegaBytesAndKiloBytes------------");
//        printMegaBytesAndKiloBytes(0);
//        System.out.println(shouldWakeUp(true, 1));
//        System.out.println(shouldWakeUp(false, 2));
//        System.out.println(shouldWakeUp(true, 8));
//        System.out.println(shouldWakeUp(true, -1));
//        System.out.println("------------isLeapYear------------");
//        System.out.println(isLeapYear(1800));
//        System.out.println(isLeapYear(1800));
//        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
//        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
//        System.out.println(hasTeen(9, 99, 19));
//        System.out.println(hasTeen(22, 23, 34));
//        printYearsAndDays(525600);
//        printYearsAndDays(561600);
//        System.out.println(getDaysInMonth(1, 2020));
//        System.out.println(getDaysInMonth(2, 2020));
//        System.out.println(getDaysInMonth(2, 2018));
//        System.out.println(getDaysInMonth(-1, 2020));
//        System.out.println(getDaysInMonth(1, -2020));
//        System.out.println(sumOdd(1, 100));
//        System.out.println(isPalindrome(121));
//        System.out.println(isPalindrome(2345432));
//        System.out.println(sumFirstAndLastDigit(-5));
//        System.out.println(sumFirstAndLastDigit(10));
//        System.out.println(getEvenDigitSum(123456789));
//        System.out.println(getEvenDigitSum(2000));
//        System.out.println(hasSharedDigit(12, 23));
//        System.out.println(hasSharedDigit(9, 99));
//        System.out.println(hasSharedDigit(15, 55));
//        System.out.println(hasSharedDigit(10, 34));
//        System.out.println(hasSharedDigit(100, 10));
//        System.out.println(hasSharedDigit(12, 13));
//        System.out.println(hasSameLastDigit (41, 22, 71));
//        System.out.println(hasSameLastDigit (23, 32, 42));
//        System.out.println(hasSameLastDigit (9, 99, 999));
//        printFactors(6);
//        printFactors(32);
//        printFactors(10);
//        printFactors(-1);
//        System.out.println(getGreatestCommonDivisor(25, 15));
//        System.out.println(getGreatestCommonDivisor(12, 30));
//        System.out.println(getGreatestCommonDivisor(9, 18));
//        System.out.println(getGreatestCommonDivisor(81, 153));
//        numberToWords(1234);
//        System.out.println();
//        numberToWords(-1234);
//        System.out.println();
//        numberToWords(100);
//        System.out.println(canPack (1, 0, 4)); //false
//        System.out.println(canPack (1, 0, 5)); //true
//        System.out.println(canPack (0, 5, 4)); //true
//        System.out.println(canPack (2, 2, 11)); //true
//        System.out.println(canPack (-3, 2, 12)); //false
//        System.out.println(getLargestPrime (21));
//        System.out.println(getLargestPrime (217));
//        System.out.println(getLargestPrime (0));
//        System.out.println(getLargestPrime (45));
//        System.out.println(getLargestPrime (-1));
//        System.out.println(getLargestPrime (7));
//        System.out.println(getLargestPrime (16));
//        printSquareStar(8);
//        inputThenPrintSumAndAverage();
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));

    }

    public static void checkNumber(int number){
        if(number > 0){
            System.out.println("positive");
        }
        if(number < 0){
            System.out.println("negative");
        }
        if(number == 0){
            System.out.println("zero");
        }
    }
    public static void printConversion(double kilometersPerHour){
        long result = toMilesPerHour(kilometersPerHour);
        if (result < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + result + " mi/h");
        }
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour == 0.0){
            return 0;
        } else if(kilometersPerHour < 0) {
            return -1;
        }
        return Math.round((kilometersPerHour / 1.609));
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int oneKb = 1024;
            int mbValue = kiloBytes / oneKb;
            int kbValue = (kiloBytes % oneKb);
            System.out.println(kiloBytes + " KB = " + mbValue + " MB and " + kbValue + " KB");
        }
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(barking){
            if(((hourOfDay < 8) || (hourOfDay > 22)) && ((hourOfDay >= 0) && (hourOfDay <= 23))){
                return true;
            }
        }

        return false;
    }

    public static boolean isLeapYear(int year){
        if((year >= 1) && (year <= 9999)){
            if((year % 100) != 0){
                if(year % 4 == 0){
                    return true;
                }
            } else {
                if(year % 400 == 0){
                    return true;
                }
            }

        }
        return false;
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        long n1 = (long)(num1*1000);
        long n2 = (long)(num2*1000);
        if(n1 != n2){
            return false;
        }
        return true;
    }
    public static boolean hasEqualSum(int n1, int n2, int n3){
        if((n1 + n2) == n3){
            return true;
        }
        return false;
    }
    public static boolean hasTeen(int nr1, int nr2, int nr3){
        return isTeen(nr1) || isTeen(nr2) || isTeen(nr3);
    }
    public static boolean isTeen(int nr1){
        return (nr1 >= 13 && nr1 <= 19);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes >= 0){

            int numOfDays = (int)(minutes / 60 / 24);
            int minuteInYear = numOfDays / 365;
            int minuteinDays = numOfDays % 365;
            System.out.println(minutes + " min = " + minuteInYear + " y and " + minuteinDays + " d");

        } else {
            System.out.println("Invalid Value");
        }
    }
    public static void printEqual(int n1, int n2, int n3){
        if((n1 < 0) || (n2 < 0) || (n3 < 0)){
            System.out.println("Invalid Value");
        } else {
            if((n1 == n2) && (n2 == n3)){
                System.out.println("All numbers are equal");
            } else if ((n1 == n2) || (n2 == n3) || (n1 == n3)){
                System.out.println("Neither all are equal or different");
            } else {
                System.out.println("All numbers are different");
            }
        }

    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer){
            if((temperature >= 25) && (temperature <= 45)){
                return true;
            }
        } else {
            if((temperature >= 25) && (temperature <= 35)){
                return true;
            }
        }
        return false;
    }
    public static void printNumberInWord(int number){
        switch (number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");

        }
    }
    public static int getDaysInMonth(int month, int year){
        if((year < 1) || (year > 9999)){
            return -1;
        }
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                if(isLeapYear(year)){
                    return 29;
                } else {
                    return 28;
                }
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return -1;
        }

    }
    public static boolean isOdd(int num){
        if(num < 0){
            return false;
        }
        if((num % 2) != 0){
            return true;
        }
        return false;
    }
    public static int sumOdd(int start, int end){
        if((start > end) || (start <= 0) || (end <= 0)){
            return -1;
        }
        int sum = 0;
        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }
    public static boolean isPalindrome(int num){
        int tempNum = num;
        int revNum = 0;
        while ((num / 10) != 0){
            revNum = revNum * 10 + (num % 10);
            num = num / 10;
        }
        revNum = (revNum * 10) + num;
        if(tempNum == revNum){
            return true;
        } else {
            return false;
        }
    }
    public static int sumFirstAndLastDigit(int num){
        if(num < 0){
            return -1;
        } else {
            int sum = 0;
            sum += num % 10;
            while ((num / 10) != 0){
                num = num / 10;
            }
            sum += num;
            return sum;
        }
    }
    public static int getEvenDigitSum(int num){
        if(num < 0){
            return -1;
        } else {
            int sum = 0;
            while((num / 10) != 0){
                int tempNum = num % 10;
                if((tempNum % 2) == 0){
                    sum += tempNum;
                }
                num = num / 10;
            }
            if((num % 2) == 0){
                sum += num;
            }
            return sum;
        }
    }
    public static boolean hasSharedDigit(int num1, int num2){
        if((num1 < 10) || (num1 > 99)){
            return false;
        }
        if((num2 < 10) || (num2 > 99)){
            return false;
        }
        while((num1) != 0){
            int tempNum1 = num1 % 10;
            int tempNum2 = num2;
            while((tempNum2) != 0){
                if(tempNum1 == (tempNum2 % 10)){
                    return true;
                }
                tempNum2 = tempNum2 / 10;
            }
            num1 = num1 / 10;
        }

        return false;
    }
    public static boolean hasSameLastDigit(int n1, int n2, int n3){
        if((isValid(n1) && isValid(n2) && isValid(n3))){
            int ln1 = n1 % 10;
            int ln2 = n2 % 10;
            int ln3 = n3 % 10;
            if((ln1 == ln2) || (ln1 == ln3) || (ln2 == ln3)){
                return true;
            }
        }
        return false;
    }
    public static boolean isValid(int n1) {
        if((n1 >= 10) && (n1 <= 1000)){
            return true;
        } else {
            return false;
        }
    }
    public static void printFactors(int num){
        if(num < 1){
            System.out.println("Invalid Value");
        } else {
            for(int i = 1; i <= num; i++){
                if((num % i) == 0){
                    System.out.print(i + " ");
                }
            }
        }
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if((first < 10) || (second < 10)){
            return -1;
        } else {
            if(first == second){
                return first;
            } else if (first < second){
                for(int i = first; i >= 1; i--){
                    if(((first % i) == 0) && ((second % i) == 0)){
                        return i;
                    }
                }
            } else {
                for(int i = second; i >= 1; i--){
                    if(((first % i) == 0) && ((second % i) == 0)){
                        return i;
                    }
                }
            }
        }
        return 1;
    }
    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }
        int sum = 0;
        for(int i = 1; i < number; i++){
            if((number % i) == 0){
                sum += i;
            }
        }
        if(sum == number){
            return true;
        } else {
            return false;
        }
    }
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        } else {
            int tempNum = reverse(number);
            int numDigits = getDigitCount(number);
            while((tempNum != 0) || (numDigits > 0)){
                int tempNum1 = tempNum % 10;
                switch (tempNum1){
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                    default:
                        System.out.print("Zero ");
                }
                numDigits--;
                tempNum = tempNum / 10;
            }
        }
    }
    public static int reverse(int num){
        int tempNum = 0;
        while(num != 0){
            tempNum = (tempNum * 10) + (num % 10);
            num = num / 10;
        }
        return tempNum;
    }
    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        if(number == 0){
            return 1;
        }
        int numDigits = 0;
        while(number != 0){
            numDigits++;
            number = number / 10;
        }
        return numDigits;
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if((bigCount < 0) || (smallCount < 0) || (goal < 0)){
            return false;
        } else {
            for(int i = 0; i <= bigCount; i++){
                if((goal <= smallCount)){
                    return true;
                } else {
                    if(((i * 5) <= goal) && ((i * 5) + smallCount) >= goal){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static int getLargestPrime(int number){
        if(number < 2){
            return -1;
        }
        int largestPrime = -1;
        boolean prime = false;
        for(int i = number; i > 1; i--){
            if((number % i) == 0){
                prime = true;
                for(int j = 2; j <= i / 2; j++){
                    if((i % j) == 0){
                        prime = false;
                        break;
                    }
                }
                if(prime){
                    return i;
                }
            }
        }

        return largestPrime;
    }
    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
        } else {
            for(int i = 0; i < number; i++){
                for(int j = 0; j < number; j++){
                    if((i == 0) || (i == number -1) || (j == 0) || (j == number -1)){
                        System.out.print("*");
                    } else if((i == j) || (j == number - i - 1)){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        int count = 0;
        while(true){
            try {
                String temp = scanner.nextLine();
                int num = Integer.parseInt(temp);
                sum += num;
                count++;
            } catch (NumberFormatException nfe){
                break;
            }
        }
        avg = (int)Math.round((double)((double)sum / (double)count));
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)){
            return -1;
        }
        if((width * height) <= (extraBuckets * areaPerBucket)){
            return 0;
        } else {
            double totalArea = width * height;
            double requiredArea = totalArea - (extraBuckets * areaPerBucket);

            double numBuckets = Math.ceil(requiredArea / areaPerBucket);
            return (int)numBuckets;
        }
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if((width < 0) || (height < 0) || (areaPerBucket < 0)){
            return -1;
        }
        int extraBuckets = 0;
        if((width * height) <= (extraBuckets * areaPerBucket)){
            return 0;
        } else {
            double totalArea = width * height;
            double requiredArea = totalArea - (extraBuckets * areaPerBucket);

            double numBuckets = Math.ceil(requiredArea / areaPerBucket);
            return (int)numBuckets;
        }
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if((area <= 0) || (areaPerBucket < 0)){
            return -1;
        }
        int extraBuckets = 0;
        if((area) <= (extraBuckets * areaPerBucket)){
            return 0;
        } else {
            double totalArea = area;
            double requiredArea = totalArea - (extraBuckets * areaPerBucket);

            double numBuckets = Math.ceil(requiredArea / areaPerBucket);
            return (int)numBuckets;
        }
    }
}
