
public class TimeSpanTester {

	public static void main(String[] args) {
		//This testing code is pretty bare-bones.
		//Feel free to put in your own tests as well. 
		
		TimeSpan t1 = new TimeSpan(17, 125);
		System.out.println(t1); //Should output "2h5m"
		
		t1.add(1, 70);
		System.out.println(t1); //Should output "4h15m"
		
		//uncommenting the next line should give you an error "The field TimeSpan.hours is not visible." Make sure your fields are private!
		//t1.addHours = 5;
		
		System.out.println( t1.getHours() );  //Should output 4
		System.out.println( t1.getMinutes() ); //Should output 15
		
		System.out.println( t1.getTotalHours() ); //Should output 4.25
		
		TimeSpan t2 = new TimeSpan(2, 50);
		t1.add(t2); 
		System.out.println(t1); //Should output "7h5m"
		
		//TimeSpan t3 = new TimeSpan(24, 30);
		if (t1.getTotalHours() >= 24) {
			System.out.println("Gimme, Gimme, Gimme a man after midnight!");
		}
		//For finding the remainder of minutes as an int. If minutes = 150, I did (minutes - ((minutes / 60) * 60)).
		//So (150 - ((150 / 60) * 60))... 150 - (2 * 60) would give a remainder of 30 mins.
	}

}
