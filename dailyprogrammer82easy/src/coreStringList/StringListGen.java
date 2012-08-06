package coreStringList;

public class StringListGen {

	static String alphabet = "abcdefghijklmnopqrstuvwxyz";
	StringListGen(int value){
		
	}
	 public static void main( String[] args ){
		 alphaGet(5);
	 }
	
	public static void alphaGet(int pos){
		for(int count = pos; count != -1; count--){
			System.out.print(alphabet.charAt(count));
			if(count != pos){
				for(int count2 = count; count2 < pos; count2++){
				System.out.print(alphabet.charAt(count2));
				}
			}
			System.out.print("\n");
			
		}
	}
}
