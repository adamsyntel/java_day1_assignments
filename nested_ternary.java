class nested_ternary{

	public static void main(String[] args){
		int i = 5;
		int j = 18;
		int k = 15;
		int l = 13;
		int biggest;
		/* This nested ternary operator will find the biggest number of i, j, and k */
		biggest = 
		(i>=j && i>=k && i>=l)?i 		// Check to see if i is greater or equal to j, k, and l. If it is, assign biggest = i
		: (j>=i && j>=k && j>=l)?j 		// If i is not bigger than j, k, and l, do the same check for j
		: (k>=i && k>=j && k>=l)?k  	// If i and j do not satisfy this, then check k and assign k if it satisfies
		: l;							// If i,j, and k are all not the largest, by process of elimination l is the largest
		System.out.println("The largest number is: " + biggest);
	}


}