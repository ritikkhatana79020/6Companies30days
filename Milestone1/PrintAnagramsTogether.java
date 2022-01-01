package Milestone1;

import java.util.*;
 
public class PrintAnagramsTogether {
 
    public static List<List<String>> groupAnagrams(String[] words) {
 
       List<List<String>> ans = new ArrayList<>();
  
       //Initialize hashmap
       HashMap<String, List<String>> map = new HashMap<>();
 
       //Traverse a list of string
       for(int i=0;i<words.length;i++){
 
         //Convert to character array
          char[] chArr = words[i].toCharArray();
          //Sort character array
          Arrays.sort(chArr);
          //Create a string
          String key = new String(chArr);
 
          //Create a key from a sorted string
          //if this key is found add new string element
          if(map.containsKey(key)){
             map.get(key).add(words[i]);
 
          } else {
             List<String> list = new ArrayList<>();
             list.add(words[i]);
             map.put(key, list);
          }
        }
 
         ans.addAll(map.values());
         return ans;
   }
 
    public static void main(String[] args) {
 
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result  = groupAnagrams(words);
        result.forEach(item -> System.out.println(item + " "));
      }
}