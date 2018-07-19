
Given a non-empty string like "Code" return a string like "CCoCodCode".


stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
  ---------------------------------

public String stringSplosion(String str) {
  String newString = "";
  
  for(int i =0; i<str.length(); i++){
    
    String next = str.substring(0, i+1);
    
    newString = newString + next;
    
  }
  return newString;
}
