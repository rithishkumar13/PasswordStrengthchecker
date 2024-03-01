import java.util.Scanner;
class Password
{
	public static void main(String[] args) 
	{
		//password-strength-checke
		System.out.println("----Welcome to password strength checker----");
		while(true){
			Scanner sc=new Scanner(System.in);
			System.out.println("Do you want to check your password Strength:");
			String choice =sc.nextLine();
			int strength=0;
			int lowercount=0;
			int uppercount=0;
			int digit_count=0;
			int white_space_count=0;
			int special_character_count=0;
			switch(choice){
			    case "yes":
			        System.out.println("Enter your Password:");
				    String password =sc.nextLine();
				    for (int ch=0;ch<password.length();ch++){
					    if (password.charAt(ch)>='A' && password.charAt(ch)<='Z')
						    uppercount+=1;
					    else if (password.charAt(ch)>='a' && password.charAt(ch)<='z')
						    lowercount+=1;
					    else if (password.charAt(ch)>='0' && password.charAt(ch)<='9') 
						    digit_count+=1;
					    else if ( password.charAt(ch)==' ')
						    white_space_count+=1;
					    else
						    special_character_count+=1;
			        }
				    if (uppercount>=1)
					   strength+=1;
				    if (lowercount>=1)
					   strength+=1;
				    if (digit_count>=1)
					   strength+=1;
					if (white_space_count>=1)
					   strength+=1;
				    if (special_character_count>=1)
					   strength+=1;
			 System.out.println("Your password has:");
			 System.out.println(uppercount+"uppercaseletters");
			 System.out.println(lowercount+"lowercaseletters");
			 System.out.println(digit_count+"digits");
			 System.out.println(white_space_count+"whitespaces");
			 System.out.println(special_character_count+"special character count");
		    if (strength==1)
				System.out.println("Your password is bad...change it immediately");
			else if (strength==2)
				System.out.println("Your password is weaker...consider a toughest password");
			else if (strength==3)
				System.out.println("Your password is okay, but it can be improved.");
			else if (strength==4)
				System.out.println("Your password is hard to guess. But you could make it even more secure.");
			else if (strength==5)
				System.out.println("Now that\'s one hell of a strong password!!!' Hackers don\'t have a chance guessing that password!");
			break;
			    case "no":
				    System.out.println("Exit");break;
			    default:
				    System.out.println("Invalid");break;
			}
		}
	}
}

