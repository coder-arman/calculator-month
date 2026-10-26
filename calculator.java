import java.util.*;
	class cal{
	public static void main(String arrgs[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first number");
	int a=sc.nextInt();
	System.out.println("enter seceond number");
	int b=sc.nextInt();
	System.out.println("choose opration");
	System.out.println("1.Addition");
	System.out.println("2.Subtarction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");
	System.out.println("5.Remainder");
	System.out.println("enter choise");
	int choise=sc.nextInt();
	switch(choise)
	{
		case 1:
			System.out.println("Addition is ="+(a+b));
			break;
		case 2:
			System.out.println("Subtraction is ="+(a-b));
			break;
		case 3:
			System.out.println("Multiplication is ="+(a*b));
			break;
		case 4:
			System.out.println("Division is ="+(a/b));
			break;
		case 5:
			System.out.println("Remainder is ="+(a%b));
			break;
		default:
			System.out.println("invailed choise");
	}
		}
			}			