package pauli_seyringer;

public class HelloGarstigerWicht {

	public static void main(String[] args) {
		System.out.println("Lassen Sie mich in Ruhe, Sie garstiger Wicht!");
		
		int age = 17;
		int ageP = 20;
		
		if(age < 18 && ageP > 18){
			System.out.println("It's not leagal to fuck girls younger than 18 brah");
			System.out.println("Baby: " + makeBaby(ageP,age));
		}
		
		tellOpinion(ageP, age);
		
		
		
	}

	public void thisIsANewMethod() {
		System.out.println("Call: 1-866-689-0209");
		int p = makeBaby(3, 2);
	}
	
	public static int makeBaby(int ageP, int age) {
		return ageP-age;
	}
	
	public static void tellOpinion(int ageP, int age) {
		if (ageP > 18) {
			System.out.println("Fuck off, Looser!");
		}else {
			System.out.println("It's free real estate.");
		}
	}
}
