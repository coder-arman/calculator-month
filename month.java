import java.util.*;
	class mont{
	public static void main(String args[])
	{
		System.out.println("choose month");
		System.out.println("1.January");
		System.out.println("2.Feburary");
		System.out.println("3.March");
		System.out.println("4.April");
		System.out.println("5.May");
		System.out.println("6.June");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Month");
		int month=sc.nextInt();
		switch(month)
		{
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("Feburary");
			        break;
			case 3:
				System.out.println("March");
			        break;
			case 4:
				System.out.println("April");
			        break;
			case 5:
				System.out.println("May");
			        break;
			case 6:
				System.out.println("June");
			        break;
			default:
				System.out.print("invailed choise");
			}
				}
					}

				