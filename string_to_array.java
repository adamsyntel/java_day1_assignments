class string_to_array{
	
	public static void main(String[] args){

		/* .toCharArray() convert a string to a character array.Syntax is just string.toCharArray(char_array);
		 */
		String code = "123-7704";

		char [] new_array = code.toCharArray();
	

		System.out.println("Char Array Element 1: " + new_array[0]);
		
	}


}