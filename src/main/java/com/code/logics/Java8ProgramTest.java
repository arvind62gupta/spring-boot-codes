package com.code.logics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8ProgramTest {

    /* ****** find the highest Elements from Array ******* */
    public void highestElements(){
        int[] elements = {1,2,3,4,5,6,7,8,9,10};
        OptionalInt max1 = Arrays.stream(elements).max();
        System.out.println("Highest elements from array===> "+max1);

        Integer[] i = {1,1,2,1,3,4,3,3,3,3,3,5,6,6,6,7,8,9,9};
              List<Integer> list=  Arrays.asList(i);
             Integer maxElements = list.stream().max(Comparator.naturalOrder())
                     .get();
        System.out.println("Maximum elements using naturalOrder===>"+maxElements);

       Integer secondLargest = list.stream().distinct()

               .sorted(Comparator.reverseOrder())
               .skip(1).findFirst()//.get();
               . orElse(null);
             System.out.println("second largest number >>>> "+secondLargest );

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        int max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Highest Elements from List===> "+max);
    }


    /* *********** frequency of elements from array  */
    public void frequencyOfElements(){
        Integer[] i = {1,1,2,1,3,4,3,3,3,3,3,5,6,6,6,7,8,9,9};
        List<Integer> list =  Arrays.asList(i);
        Map<Integer, Long> collect = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            System.out.println("frequency of elements from array===> "+collect);
    }

/* ********** start with 2 of elements from array */
    public void startWithDigit(){
        Integer[] num = {111,2222,3333,278,287,329};
        List<Integer> list =  Arrays.asList(num);
        List<Integer> collect = list.stream().filter(i -> i.toString().charAt(0) == '2')
                .toList();
        System.out.println("start with 2 of elements from array===> "+collect);
    }

    /* **** sum and average of array of elements from array *********** */
    public void sumOfArrayOfElements(){
        int[] num = {1,2,4,3};
        int sumOfArrElements= Arrays.stream(num).sum();
        System.out.println("sum of array of elements from array===> "+sumOfArrElements);

        double average;
        average = Arrays.stream(num).average().getAsDouble();
        System.out.println("Average of array of elements from array===> "+average);

    }

/* first repeated character from string== ******* */
    public void firstRepeatedChar(){

        String str=" Concept Of The java".replaceAll("\\s+", "").toLowerCase();

      Map<String,Long> charCountmap=Arrays.stream(str.split(""))
               .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
      System.out.println("count of char==="+charCountmap);

        String firstRepeatedCharacter= charCountmap.entrySet().stream()
                .filter(i->i.getValue()>   1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        System.out.println("first ' REPEATED' character ===> "+firstRepeatedCharacter);

       List<String> list= charCountmap.entrySet().stream()
                .filter(i->i.getValue()>   1)
                .map(Map.Entry::getKey)
                        .toList();
        System.out.println("' All REPEATED' character ===> "+list);


        String lastRepeatedCharacter =list.stream().skip(list.size()-1).findFirst().get();
        System.out.println("last ' REPEATED' character ===> "+lastRepeatedCharacter);

        String firstNotRepeatChar = String.valueOf(charCountmap.entrySet().stream()
                .filter(i->i.getValue()==1)
                //.map(Map.Entry::getKey)
                .findFirst()
                .get());
        System.out.println("First 'NOT REPEATED' character >>>>>>> "+firstNotRepeatChar);

    }

    /* ******* last not repeated character from String **** */
    public void lastNotDuplicatedChar(){
        String str="Concept Of The java".replaceAll("\\s+", "").toLowerCase();
        System.out.println("String >>>>>>> "+str);

       List<String> list= Arrays.asList(str.split(""));
       List<String> res= list.stream()
            .distinct().toList();
        System.out.println("removed duplicates characters >>>>>"+res);

        /* ******* find Last not Repeated character from string **** */

        String c= res.stream().skip(res.size()-1).findFirst().get();
        System.out.println("Last not Repeated character >>>>> "+c);

    }


    /* Remove duplicates character from string ****** */
    public void removeDuplicatesCharacter() {
        String str = "java";

        List<String> list = Arrays.asList(str.split(""));
        List<String> res= list.stream().distinct().toList();
        System.out.println("removed duplicates from JAVA>>> "+res);

        /* ********************* second approach ****************** */
        String output= str.chars().mapToObj(c -> String.valueOf((char) c))
                .distinct()
                .collect(Collectors.joining());
        System.out.println("remove duplicates from 'JAVA' using mapToObj>>> "+output);

    }

/* ****** remove Duplicates Character Using Core JAVA **** */
    public void removeDuplicatesCharacterUsingCoreJAVA(){
        String str = "java";

        StringBuilder builder = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        
        char[] chars = str.toCharArray();
        for(char c : chars){
            if(set.add(c)){
                builder.append(c);
            }
        }
        System.out.println("remove duplicates from core JAVA>>>"+builder);
    }

    /* ************ reverse of String ************ **** */
    public  void reverseString(){
        String str = "java";
        String s="";
        //char c = 0;
        for(int i=0;i<str.length();i++)
        {
            s=str.charAt(i)+s;
        }
        System.out.println("reverse========> "+s);

        String reverString = new StringBuilder(str).reverse().toString();

        String reversedString = Stream.of(str).map(i->new StringBuilder(i).reverse())
                .collect(Collectors.joining());

        System.out.println("reverse of 'JAVA' using jdk8>>>>>>>>> "+reversedString);
        System.out.println("reverse of 'JAVA' using StringBuilder >>>>>>>>> "+reverString);

        String string=" Bharat is our country";
        String res = Arrays.stream(string.split(" "))
                .map(word->new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println("reverse String in one sentence >>>> " +res);
    }

    /* ************ remove duplicates digit of String ************ **** */
    public void removeDuplicatesDigit(){
        int inputNumber = 12233;
        String numberString = String.valueOf(inputNumber);

        String res=  numberString.chars().mapToObj(Character::getNumericValue)
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println("remove duplicates digit using java8 >>>>>> "+res);
        StringBuilder sb= new StringBuilder(numberString).reverse();
        System.out.println("reverse digit using StringBuilder >>>>>> "+sb);
    }
    public void sumOfDigits(){
        int inputNumber = 12233;
        String stringNumber= String.valueOf(inputNumber);
      int sumOfDigit=  stringNumber.chars().map(Character::getNumericValue)
                .sum();
      System.out.println("sum of digits =>>>> "+sumOfDigit);

    }

    /* ****** Given a list of integers, separate odd and even numbers *****/
    public void oddEvenNumber(){
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

      List<Integer> evenNumbers=  listOfIntegers.stream().filter(i->i%2==0).toList();
      System.out.println("even numbers >>>>>> : "+evenNumbers);

      Map<Boolean,List<Integer>> oddEvenNumbersMap =
              listOfIntegers.stream().collect(Collectors.partitioningBy(i->i%2==0));
      System.out.println("partitioned into odd and even numbers  >>> "+oddEvenNumbersMap);
        Set<Map.Entry<Boolean, List<Integer>>> entrySet =oddEvenNumbersMap.entrySet();
        
        for (Map.Entry<Boolean, List<Integer>> entry : entrySet) {
            System.out.println("--------------");

            if (entry.getKey())
            {
                System.out.println("Even Numbers");
            }
            else
            {
                System.out.println("Odd Numbers");
            }

            System.out.println("--------------");

            List<Integer> list = entry.getValue();

            for (int i : list)
            {
                System.out.println(i);
            }
        }
    }
// *******  calculate all digits from alphanumeric string ********
    public void addDigitsFromAlphaNumeric() {
    	
    	String str = "a12334tyz78x";
    	String input = str.replaceAll("[^\\d]", "");
    	System.out.println("remove character >>>>> " +input);
    	int output = input.chars().map(Character::getNumericValue)
    	.sum();
    	System.out.println("sum of digits from alphanumeric String >>>>> " +output);
    	
    }
    //******** convert list of string to UPPERCASE ****
    public void convertStringToUpperCase() {
    List < String > colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
    List<String> listColor=colors.stream().map(String::toUpperCase)
    .toList();
    System.out.println("convert list of string to UPPERCASE >>>>> "+listColor);
    }

    // ####### find matching elements #######
    public void matchingElements(){
        String s1= "12233344445";
        String s2 = "51";
        List<String> list2= Arrays.asList(s2.split(""));
        List<String> list1= Arrays.asList(s1.split(""));
        String output2 = list1.stream().distinct()
                .collect(Collectors.partitioningBy(list2::contains)).toString();
        System.out.println("matching Elements ===> "+output2);
        //o/p:- 1,5
    }

    public void mergeArraysElements(){
        int[] a1 = {5, 9, 12, 17, 20, 21, 22, 23};
        int[] a2 = {2, 7, 8, 11};
        int a1Length =a1.length;
        int a2Length = a2.length;
        int a3Length = a1Length+a2Length;
        int[] a3 = new int[a3Length];
        System.arraycopy(a1,0,a3,0, a1Length);
        System.arraycopy(a2,0,a3, a1Length, a2Length);
        System.out.println("Array after merging:::::::::: "+ Arrays.toString(a3));
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

        String str = Arrays.toString(new String[]{"Eric", "Joseph", "Marry", "Elizabeth", "John", "Johnny"});

        List<String> nameList = List.of(str.split(" "));

        Map<Character, List<String>> groupedNames = nameList.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println(groupedNames);

    // find output :- a-3, b-2, c-1, g-1
        List<String> list = Arrays.asList( "apple","banana","application","graps","ball","cat","abc");

        Map<Character,Long> res = list.stream()
                .collect(Collectors
                    .groupingBy(s->s.charAt(0),Collectors.counting()));
        res.forEach((k,v) -> System.out.println(k + "-" + v));
    }

    
}
