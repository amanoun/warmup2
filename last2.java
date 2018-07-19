public int last2(String str) {
  
  if(str.length()<3){
    return 0;
  }
  int count = 0;
  String lastTwo = str.substring(str.length()-2);
  
  for(int i =0; i<str.length()-2; i++){
    
    if(str.substring(i, i+2).equals(lastTwo)){
      count++;
    }
  }
  return count;
}
