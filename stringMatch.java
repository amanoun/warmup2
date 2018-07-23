
Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.


stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0

-----------------------------------------------

public int stringMatch(String a, String b) {
  if(a.length()<2 || b.length()<2){
    return 0;
  }
  
  String aResult = "";
  String bResult = "";
  int count = 0 ;
 
for(int i =0; i<a.length()-1 && i<b.length()-1; i++){
  
      aResult = a.substring(i, i+2);
      bResult = b.substring(i, i+2);
      
      if (aResult.equals(bResult)){
        
            count++;
    }
  
  }
  
return count;
}
