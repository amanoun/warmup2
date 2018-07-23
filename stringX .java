Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.


stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"

--------------------------------------------------------

public String stringX(String str) {
  
  String stringo = "";
  
  for(int i =0; i<str.length(); i++){
    
    if(!((i<str.length()-1 && i>0)  && str.substring(i, i+1).equals("x"))){
      
      stringo = stringo + str.charAt(i);
      
    }
  }
  return stringo ;
}
