public class internal{
    public static void main(String[] args) {
        System.out.println("This is an internal Java class.");
    }
}

class Excersise_1{
    //method to print hello world
    public void printHelloWorld() {
        System.out.println("Hello, World!");
    }
    //method to swap two number without using third variable
    public void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    //method to find the largest of three numbers using switch case
    public void largestOfThree(int x, int y, int z) {
        int largest;
        switch (Integer.compare(x, y)) {
            case 1:
                largest = (x > z) ? x : z;
                break;
            case -1:
                largest = (y > z) ? y : z;
                break;
            default:
                largest = (x > z) ? x : z;
        }
        System.out.println("Largest of three numbers is: " + largest);
    }
    //method to convert Celsius to Fahrenheit
    public void celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
    }
    //method to print ascii value of a character entered by user
    public void asciiValue(char character) {
        int ascii = (int) character;
        System.out.println("ASCII value of '" + character + "' is: " + ascii);
    }

    //method to run everything together
    public void runAll() {
        printHelloWorld();
        swap(5, 10);
        largestOfThree(10, 20, 15);
        celsiusToFahrenheit(25);
        asciiValue('A');
    }
}

class Excersise_2 {
    //method to check if a number is even or odd
    public void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
    //method to find the largest of three numbers using if-else
    public void largestOfThree(int x, int y, int z) {
        int largest = x;
        if (y > largest) {
            largest = y;
        }else if (z > largest) {
            largest = z;
        }
        System.out.println("Largest of three numbers is: " + largest);
    }
    //method to check if a year is a leap year
    public void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
    //calculator program using switch case
    public void calculator(int a, int b, char operator) {
        int result;
        switch (operator) {
            case '+':
                result = a + b;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = a - b; 
                System.out.println("Result: " + result);
                break;
            case '*':
                result = a * b;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, *, or /.");
            }   
        }
        //method to check is a character is vowel or consonant
        public void checkVowelConsonant(char character) {
            if ("AEIOUaeiou".indexOf(character) != -1) {
                System.out.println(character + " is a vowel.");
            } else if (Character.isLetter(character)) {
                System.out.println(character + " is a consonant.");
            } else {
                System.out.println(character + " is not a letter.");
            }
        }
        //method to run everything together
        public void runAll() {
            checkEvenOdd(10);
            largestOfThree(10, 20, 15);
            isLeapYear(2020);
            calculator(10, 5, '+');
            checkVowelConsonant('A');
        }
}

class Excersise_3 {
    //find the factorial of a number
    public void factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }
    //generate Fibonacci series up to n terms
    public void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
    //method to reverse a given number using a loop
    public void reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed number is: " + reversed);
    }
    //method to find the sum of digits of a number
    public void sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of digits is: " + sum);
    }
    //method to find all prime numbers from 1 to 100
    public void primeNumbers() {
        final int START = 2;
        final int END = 100;
        System.out.print("Prime numbers from " + START + " to " + END + ": ");
        for (int i = START; i <= END; i++) {
            boolean isPrime = true;
            for (int j = START; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    //merthod to run everything together
    public void runAll() {
        factorial(5);
        fibonacci(10);
        reverseNumber(12345);
        sumOfDigits(12345);
        primeNumbers();
    }
}

class Excersise_4 {
    //method to find the largest element in an array
    public void largestInArray(int[] array) {
        int largest = array[0];
        for (int num : array) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("Largest element in the array is: " + largest);
    }
    //method to sort an array in ascending order
    public void sortArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted array in ascending order: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    //method to search for an element in an array using linear search
    public void linearSearch(int[] array, int key) {
        boolean found = false;
        for (int num : array) {
            if (num == key) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Element " + key + " found in the array.");
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
    }
    //method to reverse an array
    public void reverseArray(int[] array) {
        int n = array.length;
        System.out.print("Reversed array: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
 //method to find the second largest element in an array
    public void secondLargestInArray(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        System.out.println("Second largest element in the array is: " + secondLargest);
    }
    //method to run everything together
    public void runAll() {
        int[] array = {3, 5, 1, 8, 2};
        largestInArray(array);
        sortArray(array);
        linearSearch(array, 5);
        reverseArray(array);
        secondLargestInArray(array);
    }   
}

class Excersise_5 {
    //method to check if a string is a palindrome
    public void isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
    //method to count the number of vowels in a string
    public void countVowels(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                count++;
            }
        }
        System.out.println("Number of vowels in \"" + str + "\": " + count);
    }
    //method to find the frequency of each character in a string
    public void characterFrequency(String str) {
        int[] frequency = new int[256]; // ASCII size
        for (char c : str.toCharArray()) {
            frequency[c]++;
        }
        System.out.println("Character frequency in \"" + str + "\":");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) i + ": " + frequency[i]);
            }
        }
    }
    //method to check if two strings are anagrams
    public void areAnagrams(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        if (java.util.Arrays.equals(arr1, arr2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
    //method to find the longest word in a sentence
    public void longestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println("Longest word in the sentence is: " + longest);
    }
    //method to run everything together
    public void runAll() {
        isPalindrome("madam");
        countVowels("Hello World");
        characterFrequency("hello");
        areAnagrams("listen", "silent");
        longestWord("The quick brown fox jumps over the lazy dog");
    }
}

class Excersise_6 {

}

class Excersise_7 {

}

class Excersise_8{
    
}