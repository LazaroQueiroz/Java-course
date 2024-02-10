public class PhraseOMatic {
	public static void main (String[] args) {
		String[] wordListOne = {"horse", "canine", "cellphone"};
		String[] wordListTwo = {"dollar", "metanfetamine", "obnoxious"}; 
		String[] wordListThree = {"concurrent", "amnesia", "rebellion"}; 

		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;


		java.util.Random randomNumberGenerator = new java.util.Random();
		
		int randIntOne = randomNumberGenerator.nextInt(oneLength);
		int randIntTwo = randomNumberGenerator.nextInt(twoLength);
		int randIntThree = randomNumberGenerator.nextInt(threeLength);


		String phrase  = wordListOne[randIntOne] + " " + wordListTwo[randIntTwo] + " " + wordListThree[randIntThree];

		System.out.println("what we need is a : " + phrase);


	}
}
