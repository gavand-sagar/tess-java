import java.util.Arrays;

class Person{
    public int age;

    public Person(int age) {
        this.age = age;
    }
}

public class Main {

    public  static  int addition(int... numbers){
        int sum = 0;
        for (int num:numbers) {
            sum+=num;
        }
        return  sum;
    }

    public  static  String getReverse(String input){

        StringBuilder s = new StringBuilder();
        for (int i = input.length()-1; i >= 0 ; i--) {
            s.append(input.charAt(i));
        }
        return s.toString();

    }

    public  static  String getWithoutDuplicate(String input){

        StringBuilder s = new StringBuilder();
        for (int i = 0; i <input.length() ; i++) {
            String currentChar = String.valueOf(input.charAt(i));
            if(!s.toString().contains(currentChar)){
                s.append(currentChar);
            }
        }
        return s.toString();

    }


    public  static  void  countVowels(String input){
        int vowels = 0;
        int consonents=0;
        String lowerInput = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char c = lowerInput.charAt(i);
            if(c>='a' && c<='z'){
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    vowels++;
                }else{
                    consonents++;
                }
            }
        }

        System.out.println("Vowel= " + vowels);
        System.out.println("Consonents= " + consonents);
    }

    public  static  void  checkPalindrome(String input){
        if(getReverse(input).equals(input)){
            System.out.println("Its Palindrome");
        }else{
            System.out.println("Its not Palindrome");
        }
    }


    public static boolean checkAnagram(String str1,String str2){
        if(str1.length() != str2.length()){
            return  false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);

    }


        public static void main(String[] args) {


        //countVowels("Admin123");


            if(checkAnagram("tea","ate")){
                System.out.println("Anagram");
            }else{
                System.out.println("Not anagram");
            }


//            String output = getWithoutDuplicate("Programmer");
//            System.out.println(output);

//            String str = "abc,sdf,dsaf,df,sdf,sdaf";
//
//            String[] result = str.split(",");
//
//            for (String value: result) {
//                System.out.println(value);
//            }

//            String a = new String("10");
//            String b = new String(a);
//            b = "45";
//            System.out.println("A="+a);
//            System.out.println("B="+b);

//             Person p1 = new Person(20);
//             Person p2 = p1;
//
//             p2.age = 100;
//
//            int num = p1.age;
//            num = 400;
//
//             System.out.println("p1="+p1.age);
//             System.out.println("p2="+p2.age);

        }

    static void print(int n){

        if(n <=0){
            return;
        }
        print(n-1);
        System.out.println(n);

    }


    static void printArray(int[] array,int index){
            if(index < array.length){
                System.out.println(array[index]);
                printArray(array,index+1);
            }
        }


        //non tail
        int factorial(int number){
            if(number<=1){
                return  1;
            }
            else{
                return number * factorial(number - 1);
            }
        }



        //tail
        static  int factorialTail(int number,int out){
            if(number<=1){
                return  out;
            }
            out = out * number;
            return factorialTail(number-1, out);
        }


        public static void fun1(int number){
            System.out.println(number);
            if(number <10){
                fun2(number+1);
            }
        }
        public static void fun2(int number){
            System.out.println(number);
            if(number <10){
                fun1(number+1);
            }

        }

}