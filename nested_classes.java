class nested_classes{

	static class OutClass{
		
		public static final String num = "123456-890";
		
		class Inside{
			
			public void check(String s){
				
				String regex = "\\d{10}";
				
				if(s.matches(regex) == true){
					System.out.println("That input is valid.");
				}
				else {
					System.out.println("Input is invalid. Please enter 10 digits between 0 and 9.");
				}
			}
			
		}
	}

	public static void main(String[] args){

		OutClass out = new OutClass();
		OutClass.Inside in = out.new Inside();
		in.check("123456-7890");
		

	}

}