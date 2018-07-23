
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"

---------------------------------------------------------------------

public String altPairs(String str) {
  if(str.length()<2){
    return str;
  }
  
  String stringo = "";
  
  for (int i =0; i <str.length(); i=i+4){
    
    int last = i+2;
    if(last >= str.length()){
      stringo = stringo + str.substring(i);
      
   
  }else {
  
   stringo = stringo + str.substring(i, i+2);
  }
  
  }
  return stringo;
}



// below was my first direction
  
//   String stringo = str;
  
//   if(str.length()>=2 && str.length()<4 ){
//   stringo = str.substring(0,2);
  
// } else if (str.length()>4 && str.length()<10){
//   stringo = (str.substring(0,2) + str.substring(4,6));
// } else if((str.length()>10)){
//   stringo = (str.substring(0,2) + str.substring(4,6) + str.substring(8,10));
// }

