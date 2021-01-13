package sk.kosickaakademia.stovcikova.rodnecislo;

public class StringReverse {
    public static void main(String[] args) {
        String inputStr="0";
        String outputStr="";
        /*StringBuilder sb= new StringBuilder(inputStr);
        outputStr=sb.reverse().toString();
        System.out.println("Reverse String :"+outputStr);*/
            char arr[]=inputStr.toCharArray();
            for (int i=arr.length-1;i>=0;i--){
                outputStr=outputStr+arr[i];
            }
            System.out.println("Reverse String:"+outputStr);
    }
}

package sk.kosickaakademia.stovcikova.rodnecislo;

import java.util.ArrayList;
import java.util.List;

public class StringReverse {

    public static String reverse(String s){
        List<String> tempArray = new ArrayList<String>(s.length());
        for(int i = 0; i <s.length(); i++){
            tempArray.add(s.substring(i, i+1));
        }
        StringBuilder reverseString = new StringBuilder(s.length());
        for(int i = tempArray.size() - 1; i >=0; i--){
            reverseString.append(tempArray.get(i));
        }
        return reverseString.toString();
    }


}