import java.util.Scanner;

class name {

public static void main(String[] args) {
	String name;
	int i;
	int j;
	int s;
	int tg;
	String password;

	System.out.println("this is my second program");
	System.out.println();
	Scanner obj = new Scanner(System.in);
	System.out.println("what is ur name");
	System.out.println();
	name = obj.nextLine();
        WriteToFile NAME = new WriteToFile();
	NAME.Writen(name);
	System.out.println();
	System.out.println("how many times do you want me to say hello, enter a number");
	j = obj.nextInt();
	System.out.println();
	for( i = 0; i < j; i++){
	System.out.println("hello " + name  + " and the counter is " + i);
		}
	System.out.println();
	if (name.contains("jemsher"))
	 {	System.out.println("that's my name to");
       }	else
	{
		System.out.println("well its not a great name but it will do");
	}	 
	System.out.println();
	System.out.println("What mark did you get in computer class " + name + " enter it as perecent");
	s = obj.nextInt();
	NAME.Writes(s);
	{
	if (s > 70)
	System.out.println("that is a A, good job " + name);
	else if ( s > 60)
	System.out.println("that is a B, good job " + name);
	else if ( s > 50)
	System.out.println("that is a C, not bad job " + name);
	else 
	System.out.println("that is a D, you might need to study more " + name);
	}
	System.out.println("and finally " + name + " i want you to enter your password");
	tg=0;
	do
	{
	System.out.println("what is it");
	password = obj.next();
	tg++;
	}
	while (!password.equals("computing") && tg < 2);
	if (password.equals("computing"))
	{
		System.out.println("password correct");

	}

	else
	{
	System.out.println("to many guesses");
		NAME.Writep(password);

	}
	NAME.Prints(name, s, password);       
     }
}
