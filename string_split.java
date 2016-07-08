class string_split{
	
	public static void main(String[] args){

		/* From what I was reading, you have to have it declared as a String to do this
		 * and it didn't work when I declared the array like 'int [] code...'
		 *	-the 'split' method will search the string for a certain character and then 
		 * 	 divide the string into however many parts specified (2 by default) not including
		 *   the character that it was split on 
		 */
		String code = "123-7704";

		String [] split = code.split("-");
		String half1 = split[0];
		String half2 = split[1];
		
		System.out.println("First half of 123-7704 is: " + half1);
		System.out.println("Second half of 123-7704 is: " + half2);

	}


}