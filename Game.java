package jdbcApplication;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.*;


public class Game {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int score =0;
		System.out.println("Welcome to guessing game");
		List<Integer> sgn = new ArrayList<Integer>();
		List<Integer> uen = new ArrayList<Integer>();
		System.out.println("enter the name");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("enter the id");
		int id = sc.nextInt();
		System.out.println("let's guess a number between 1 to 9.You have 3 chance.For each time of correct guessing you got 10.");
		Timestamp standardtime =new Timestamp( System.currentTimeMillis());
		for(int i = 0;i<3;i++) {
			Random r = new Random();
			int num =r.nextInt(9);
			System.out.println("guess the number");
			int un = sc.nextInt();
			if(num==un) {
				score +=10;
			}
			sgn.add(num);
			uen.add(un);
			
		}	
		SaveData.SavedataInfo(id , name, sgn +"", uen+"", score,standardtime);
		if(score==0) {
			System.out.println("Better luck next time");
			System.out.println("Your Score is "+score);
		}
		else {
			System.out.println("Wow! You are doing well");
			System.out.println("Your Score is" +" "+ score);
		}
	}

	
}
