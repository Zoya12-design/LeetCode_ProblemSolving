
// method overloading (static) and non static


public class a{

/* static method 

    public static void printnumber(int...numbers){
     for (int number: numbers){
     System.out.println(number);
       }
     }
*/
// non static method 
      public void printnumber(int...numbers){
      for(int number : numbers){
	  System.out.println(number);
	  System.out.println("non static function called");
	  }
    }
	public static void main(String atrgs[]){
		
		a ob = new a();
	  int [] array = {1,2,3,4};
	printnumber(array);
}
}