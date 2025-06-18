public class binarytodecimal{
  public static void main(String args[]){
    int decimal = 0;
    	 
    String num = args[0];
	    int length = num.length();    
		for(int i=0;i<length; i++){
			char n = num.charAt();
		decimal += n[i] * Math.pow(2,length-1-i); 
		
		}
    System.out.print(decimal);
  } 
}