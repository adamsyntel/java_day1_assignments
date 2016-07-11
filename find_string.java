class find_string{
	
	public static void main(String[] args){

		int count = 0;
		String search = "syntel";
		String big = "Adam works for Syntel. Syntel sent Adam to Phoenix for training. Syntel should have sent Adam to Hawaii.";

		String small = big.toLowerCase();
		int i = 0;
		while(i < small.length()) {
			if(small.indexOf(search,i) != -1){
				count++;
				i = small.indexOf(search,i);
			}
			i++;
		}

		System.out.println("'" + search + "'" + " was found " + count + " times.");
	}


}