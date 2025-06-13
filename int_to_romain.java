/*import java.util.Scanner;
public class int_to_romain{
	public static void main(String args[]){
	int[] intcode =	{1000,900,500,400,100,90,50,40,10,9,5,4,1};
	String[] code = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the number : ");
	int num = scan.nextInt();
	
	StringBuilder sb = new StringBuilder();
	for(int i=0;i<intcode.length;i++){
		if(num>=intcode[i]){
		sb.append(code[i]);
        num-=intcode[i];	
	} 
	}
	
	System.out.println(sb.toString());
	}

}

class int_to_romain{
	public static  String inttoromain(int num){
int[] intcode =	{1000,900,500,400,100,90,50,40,10,9,5,4,1};
	String[] code = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};		
	
StringBuilder sb = new StringBuilder();
for(int i =0;i< intcode.length;i++){
	while(num >= intcode[i]){
		sb.append(code[i]);
		num-=intcode[i];
	}
}	
return sb.toString();
	}
	public static void main(String args[]){
		inttoromain(123);
	}
	
}*/
import java.util.Scanner;

public class int_to_romain{
    public static void main(String[] args) {
        int[] intcode = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] code = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < intcode.length; i++) {
            while (num >= intcode[i]) {
                sb.append(code[i]);
                num -= intcode[i];
            }
        }

        System.out.println("Roman numeral: " + sb.toString());
    }
}
