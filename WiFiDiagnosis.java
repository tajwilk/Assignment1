import java.util.Scanner;

public class WiFiDiagnosis {
	public static void main(String[] args) {
		String response;
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
		System.out.println();
		
		System.out.println("First step: Reboot your computer. ");
		System.out.println("Are you able to connect with the internet? (yes or no)");
		
		response = stdin.nextLine();
		
		if(response.equals("yes")) {
			System.out.println("Rebooting your computer seemed to work. ");
			System.exit(0);
		}
		
		System.out.println("Second step: Reboot your router. ");
		System.out.println("Are you able to connect with the internet? (yes or no)");
		
		response = stdin.nextLine();
		
		if(response.equals("yes")) {
			System.out.println("Rebooting your router seemed to work. ");
			System.exit(0);
		}
		
		System.out.println("Third step: Make sure all cables connected to your router (power, coax, etc) "
						+ "are plugged in firmly and securely.");
		System.out.println("Are you able to connect with the internet? (yes or no)");
		
		response = stdin.nextLine();
		
		if(response.equals("yes")) {
			System.out.println("Checking the router's cables seemed to work.");
			System.exit(0);
		}
		

		System.out.println("Fourth step: Move your computer closer to the router. ");
		System.out.println("Are you able to connect with the internet? (yes or no)");
		
		response = stdin.nextLine();
		
		if(response.equals("yes")) {
			System.out.println("Moving the computer closer to the router seemed to work.");
			System.exit(0);
		}

		
		System.out.println("Fifth step: Contact your ISP. ");
		System.out.println("Make sure your ISP is hooked up to your router.");
		
	}
}
