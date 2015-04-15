package com.hackbulgaria.corejava;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class Problems2Impl implements Problems2 {

    @Override
    public boolean isOdd(int number) {
        
        return (Math.abs(number) % 2) !=0;
    }

    @Override
    public boolean isPrime(int number) {
        // TODO Auto-generated method stub
        
        for (int i = 2; 2*i < number; i++) {
            if (number % i == 0)
                return false;
        }
            
        return true;
    }

    @Override
    public int min(int... array) {
        // TODO Auto-generated method stub
        
        int minValue = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++){
            if(minValue>array[i]) minValue=array[i];
        }
        if(array.length>0) return minValue;
        else return 0;
    }

    @Override
    public int kthMin(int k, int[] array) {
        // TODO Auto-generated method stub
        
        Arrays.sort(array);
        if(array.length>=k){
            return array[k-1];
        } else               
        return 0;
    }

    @Override
    public float getAverage(int[] array) {
//        5. Find the average(средно аритметично) of the elements of an array
//
//        int getAverage(int[] array);

        float sum = 0.0f;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }

    @Override
    public long getSmallestMultiple(int upperBound) {
//        long getSmallestMultiple(int upperBound);
//
//        Find the smallest (positive) number, that can be divided by each of the numbers from 1 to upperBound.
        
        List<Integer> list = new ArrayList<>();
        List<Integer> listDeviders = new ArrayList<>();
        long result = 1L;
        
        for (int i = 0; i < upperBound; i++) {
            list.add(i + 1);
        }
        
        int devider = 0;
        List<Integer> listResult;
        
        while(list.size() > 0) {
            Collections.sort(list);
            int position = 0;
            while((devider = list.get(position))==1){
                position++;
                if (position > list.size() - 1) {
                    devider = -1;
                    break;
                }
            }
            
            if (devider == -1) {
                break;
            }
            
            listResult = new ArrayList<>();
            System.out.println(devider);
            
            for (Integer in : list) {
                if ((in % devider) == 0) {
                    listResult.add(in / devider);
                } else {
                    if (in > 1 ) {
                        listResult.add(in);
                    }
                }
            }
            listDeviders.add(devider);
            list = listResult;
        }
        
        for (Integer in : listDeviders) {
            result *= in;
        }
            
        return result;
    }

    @Override
    public long getLargestPalindrome(long N) {
        
        class Palindrome {
        boolean isPalindrome(long x) {
            if (x < 0) return false;
            int div = 1;
            while (x / div >= 10) {
              div *= 10;
            }        
            while (x != 0) {
              long l = x / div;
              long r = x % 10;
              if (l != r) return false;
              x = (x % div) / 10;
              div /= 100;
            }
            return true;
          }
        }
        
        
        while(!new Palindrome().isPalindrome(N)){
            N--;
        }
                    
        return N;
    }

    @Override
    public int[] histogram(short[][] image) {
        // TODO Auto-generated method stub
        
        int[] array = new int[256];
        
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                int value = (int) image[i][j];
                array[value]++; // = array[value] + 1;
            }
        }
        
        return array;
    }

    @Override
    public long doubleFac(int n) {
        // TODO Auto-generated method stub

        class Factorial {
            private long factorial(int f) {
                long result = 1;
                for (int i = 1; i <= f; i++) {
                    result = result * i;
                }
                return result;
            }
        }

        return new Factorial().factorial((int) new Factorial().factorial(n));
    }

    @Override
    public long kthFac(int k, int n) {

        long result = 1;
        
        if (k<=0) { 
            System.out.println("k has to be > 0");
            return 0;
        }
        
        for (int i = 1; i <= k; i++) {

            while (n >= 1) {
                
                result = result * n;
                n--;
                
                if (k > 1 && n == 0) {
                    n = (int) result;
                    result = 1;
                    k--;
                }
            }
        }
        return result;
    }

    @Override
    public int getOddOccurrence(int[] array) {

//12. Find the only number, that occurs odd times in an array
//
//int getOddOccurrence(int... array)
//
//Every element in array will occur an even ammount of times. There will be exactly one element Example: {1,2,2,1,3,4,3,4,4,6,5,6,5} => 4 occurs only an odd number of times.

        List<Integer> list = new ArrayList<>();
        
        for (int i : array) {
            if (!list.contains(i)) {
                list.add(i);
            } else {
                list.remove(list.indexOf(i));
            }
        }
        
        return list.get(0);
    }

    @Override
    public long pow(int a, int b) {

        long result = 1;
        while (b != 0) {
            if ((b & 1) == 1)
                result *= a;
            b >>= 1;
            a *= a;
        }

        return result;
    }

    @Override
    public long maximalScalarSum(int[] a, int[] b) {
        // 13. Maximal scalar product
        // long maximalScalarSum(int[] a, int[] b) You are given two vectors, a
        // and b. Let a be {a1,a2,a3} and b be {b1,b2,b3}. The scalar product of
        // vectors a and b is the number a1*b1 + a2*b2 + a3*b3
        // Find a permutation of a, and a permutation of b, for which their
        // scalar product is the largest possible.

        long result = 0L;
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            result += a[i] * b[i];
        }

        return result;
    }

    @Override
    public int maxSpan(int[] array) {
        // 14. Max span
        //
        // int maxSpan(int[] numbers) Consider the leftmost and righmost
        // appearances of some value in an array. We'll say that the "span" is
        // the number of elements between the two inclusive. A single value has
        // a span of 1. Returns the largest span found in the given array.
        //
        // maxSpan({1, 2, 1, 1, 3}) → 4 maxSpan({1, 4, 2, 1, 4, 1, 4}) → 6
        // maxSpan({1, 4, 2, 1, 4, 4, 4}) → 6

        Set<Integer> values = new HashSet<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i <= array.length - 1; i++) {
            values.add(array[i]);
        }

        for (Integer intValue : values) {
            int i = 0;
            int leftToken = -1;
            int rightToken = -1;

            while (leftToken == -1 && i <= (array.length - 1)) {
                if (intValue == array[i]) {
                    leftToken = i;
                } else {
                    i++;
                }
            }

            i = array.length - 1;
            while (rightToken == -1 && i >= 0) {
                if (intValue == array[i]) {
                    rightToken = i;
                } else {
                    i--;
                }
            }

            map.put((rightToken - leftToken + 1), intValue);
        }

        Entry<Integer, Integer> lastEntry = map.lastEntry();

        return lastEntry.getKey();
    }

    @Override
    public boolean canBalance(int[] array) {
        // 15. Can balance?
        //
        // boolean canBalance(int[] numbers)
        //
        // canBalance({1, 1, 1, 2, 1}) → true canBalance({2, 1, 1, 2, 1}) →
        // false canBalance({10, 10}) → true
        //
        // Return true if there is an element in the array, where you can split
        // the array in half and the sum of left side would be equal to the sum
        // of the right part.

        int pointer = 1;

        while (pointer <= (array.length - 1)) {
            int i = 0;
            int leftSum = 0;
            int rightSum = 0;
            while (i <= (array.length - 1)) {
                if (i < pointer) {
                    leftSum += array[i];
                } else {
                    rightSum += array[i];
                }
                i++;
            }

            if (leftSum == rightSum) {
                return true;
            }
            pointer++;
        }

        return false;
    }

    @Override
    public int[][] rescale(int[][] original, int newWidth, int newHeight) {
        
        int[][] result = new int[newHeight][newWidth];
       
        int width = original[0].length;
        int height = original.length;
        float scaleX = (float) width / newWidth;
        float scaleY = (float) height / newHeight;
        int x = 0;
        int y = 0;
        
//        System.out.println("scaleX: " + scaleX);
//        System.out.println("scaleY: " + scaleY);

        for (int i = 0; i < newHeight; i++) {
            for (int j = 0; j < newWidth; j++) {

              if (scaleX > 1 && scaleY > 1) {   
                int m = Math.round((height / newHeight) * i);
                int mEnd = Math.round((height / newHeight) * (i + 1));
                
                int n = Math.round((width / newWidth) * j);
                int nEnd = Math.round((width / newWidth) * (j + 1));
                
                int num = 0;
                int sum = 0;
                for (int p = m; p < mEnd; p++) {
                    for (int q = n; q < nEnd; q++) {
                        sum += original[p][q];
                        num++;
                    }
                }
                result[i][j] = sum / num;
              } else {
                  int p = (int) Math.round(Math.floor(i * ((float) height / newHeight)));
                  int q = (int) Math.round(Math.floor(j * ((float) width / newWidth)));
                  result[i][j] = original[p][q];
              }
            }
        }
        return result;
    }

    @Override
    public String reverseMe(String argument) {

        int token = argument.length();
        StringBuffer strReversed = new StringBuffer();

        while (token-- > 0) {
            strReversed.append(argument.charAt(token));
        }

        return strReversed.toString();
    }

    @Override
    public String copyEveryChar(String input, int k) {

        // 18. Copy every character K times
        //
        // String copyEveryChar(String input, int k)
        //
        // copyEveryChar("tldr", 3) => "tttllldddrrr" Important Note: There is
        // an error in the unit test. If you are failing on this line:
        // assertEquals("ttt www rrr", problems2.copyEveryChar("t w r", 2)); It
        // is because is shoud be "3" instead of "2" as an argument at the end.
        // (My bad).

        StringBuffer str = new StringBuffer();

        for (int i = 0; i < input.length(); i++) {
                for (int j = 0; j < k; j++) {
                    str.append(input.charAt(i));
                }
        }
        return str.toString();
    }

    @Override
    public String reverseEveryWord(String arg) {
        // 18. Reverse each word in a String
        //
        // String reverseEveryChar(String arg)
        //
        // reverseEveryChar("What is this") => tahW si siht

        class Reverse {
            public String reverseMe(String argument) {
                int token = argument.length();
                StringBuffer strReversed = new StringBuffer();

                while (token-- > 0) {
                    strReversed.append(argument.charAt(token));
                }
                return strReversed.toString();
            }
        }

        String[] strArray = arg.split("\\s");
        StringBuilder strBuil = new StringBuilder();

        int len = strArray.length;
        for (String str : strArray) {
            if (len > 1) {
                strBuil.append(new Reverse().reverseMe(str)).append(" ");
            } else {
                strBuil.append(new Reverse().reverseMe(str));
            }
            len--;
        }

        return strBuil.toString();
    }

    @Override
    public boolean isPalindrome(String argument) {
        // 18. Is this string a palindrome
        //
        // boolean isPalindrome(String argument)

        String str = argument.replaceAll("[\\W+\\s+]", "");
        
        for (int i = 0, j = (str.length() - 1); i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j))
                return false;
        }

        return true;
    }

    @Override
    public boolean isPalindrome(int number) {
//        19. Is this number a palindrome
//
//        boolean isPalindrome(int argument)
        
        if (number < 0)
            return false;
        int div = 1;
        while (number / div >= 10) {
            div *= 10;
        }
        while (number != 0) {
            long l = number / div;
            long r = number % 10;
            if (l != r)
                return false;
            number = (number % div) / 10;
            div /= 100;
        }

        return true;
    }

    @Override
    public int getPalindromeLength(String input) {
        // 19. Check for palindrome length around '*'
        //
        // int getPalindromeLength(String input)
        //
        // getPalindromeLength("taz*zad") => 2

        int starPosition = -1;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '*')
                starPosition = i;
        }

        int leftPosition = -1;
        int rigthPosition = -1;

        if ((input.length() - starPosition) < starPosition)
            rigthPosition = input.length() - starPosition - 1;
        else
            leftPosition = starPosition;

        int k = -1;
        if (leftPosition > 0)
            k = leftPosition;
        else if (rigthPosition > 0)
            k = rigthPosition;

        int palindromeLen = 0;
        boolean stillPalindrome = true;
        for (int i = 0; i < k; i++) {
            if (input.charAt(starPosition - i - 1) == input.charAt(starPosition + i + 1) && stillPalindrome) {
                palindromeLen++;
            } else {
                stillPalindrome = false;
            }
        }

        return palindromeLen;
    }

    @Override
    public int countOcurrences(String needle, String haystack) {
        // 20. Count number of (non-overlapping) occurences
        //
        // int countOcurrences(String needle, String haystack)
        // countOcurrences("da", "daaadaadada") => 4
        //
        // Bonus Only 1 line of code allowed. No loops :)

        return haystack.split(Pattern.quote(needle), -1).length - 1;
    }

    @Override
    public String decodeURL(String input) {

        // 21. Decode an URL
        //
        // Input 'kitten%20pic.jpg' Output 'kitten pic.jpg' %20=>' ' %3A=>':'
        // %3D=>'?' %2F=>'/' String decodeUrl(String input)
        //
        // 1 line of code is allowed.

        return input.replaceAll("%20", " ").replaceAll("%3A", ":").replaceAll("%3D", "?").replaceAll("%2F", "/");
    }

    @Override
    public int sumOfNumbers(String input) {
        // 22. Sum all the numbers in a String
        //
        // int sumOfNumbers(String input)
        //
        // Sum all of the numbers in the String. Ignore the characters.
        // sumOfNumbers("abc123dd34") => 157 sumOfNumbers("12 99 1) => 112"

        int sum = 0;
        int startNumber = 0;
        int endNumber = 0;
        boolean isNumberStarted = false;
        boolean readyForCalc = false;
        boolean isNegative = false;

        for (int i = 0; i < input.length(); i++) {
            if (!isNumberStarted) {
                isNegative = false;
                if (Character.isDigit(input.charAt(i))) {
                    startNumber = i;
                    if (i > 0 && input.charAt(i-1) == '-') {
                        isNegative = true;
                    }
                    isNumberStarted = true;
                }
                if (Character.isDigit(input.charAt(i)) && i == (input.length() - 1)) {
                    endNumber = i;
                    isNumberStarted = false;
                    readyForCalc = true;
                }
            } else {
                if (i == (input.length() - 1)) {
                    endNumber = i;
                    isNumberStarted = false;
                    readyForCalc = true;
                }

                if (!Character.isDigit(input.charAt(i))) {
                    endNumber = i - 1;
                    isNumberStarted = false;
                    readyForCalc = true;
                }
            }

            if (readyForCalc) {
                // System.out.println(input.substring(startNumber,
                // endNumber+1));
                if (isNegative) {
                    sum = sum - Integer.parseInt(input.substring(startNumber, endNumber + 1));
                } else {
                    sum = sum + Integer.parseInt(input.substring(startNumber, endNumber + 1));
                }
                readyForCalc = false;
            }
        }

        return sum;
    }

    @Override
    public boolean areAnagrams(String A, String B) {
        //
        // 23. Is String A an anagram of String B?
        //
        // boolean anagram(String A, String B) See
        // http://en.wikipedia.org/wiki/Anagram
        //
        // No HashMaps, hashSets, or such stuff allowed : ) Note: The last unit
        // test is a faulty one. Delete it. (My bad).

        StringBuffer strA = new StringBuffer();
        StringBuffer strB = new StringBuffer();

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != ' ')
                strA.append(A.toLowerCase().charAt(i));
        }

        for (int i = 0; i < B.length(); i++) {
            if (B.charAt(i) != ' ')
                strB.append(B.toLowerCase().charAt(i));
        }

        if (strA.length() != strB.length()) {
            return false;
        } else {
            int index;
            for (int i = 0; i < strA.length(); i++) {
                if ((index = strB.indexOf(Character.toString(strA.charAt(i)))) != -1) {
                    strB.deleteCharAt(index);
                }
            }
            return (strB.length() == 0);
        }
    }

    @Override
    public boolean hasAnagramOf(String string, String string2) {
        // 24. Is an anagram of String A a susbstring in B?
        //
        // boolean hasAnagramOf(A,B) Return whether an anagram of String A can
        // be found in String B.
        
        char[] charArr1 = string.toCharArray();
        char[] charArr2;
        Arrays.sort(charArr1);
        
        for (int i = 0; i < (string2.length() - string.length()) + 1; i++) {
            charArr2 = string2.substring(i, string.length() + i).toCharArray();
            Arrays.sort(charArr2);
            if (Arrays.equals(charArr1, charArr2)) {
                return true;
            }
        }

        return false;
    }
    
}
