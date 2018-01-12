
import java.util.Scanner;

public class IntegerListTest
{
    static IntegerList list = new IntegerList(10);
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
	printMenu();
	int choice = scan.nextInt();
	while (choice != 0)
	    {
		dispatch(choice);
		printMenu();
		choice = scan.nextInt();
	    }
    }

    public static void dispatch(int choice)
    {
	int loc;
	switch(choice)
	    {
	    case 0:
		System.out.println("Bye!");
		break;
	    case 1:
		System.out.println("How big should the list be?");
		int size = scan.nextInt();
		list = new IntegerList(size);
		list.randomize();
		break;
	    case 2:
		list.selectionSort();
		break;
	    case 3:
		System.out.print("Enter the value to look for: ");
		loc = list.search(scan.nextInt());
		if (loc != -1)
		    System.out.println("Found at location " + loc);
		else
		    System.out.println("Not in list");
		break;
	    case 4:
		list.print();
		break;
		case 5:
		System.out.println("Enter an old value to replace with a new one: ");
		int repOldVal = scan.nextInt();
		System.out.println("Enter a new value to replace the old one: ");
		int repNewVal = scan.nextInt();
		list.replaceFirst(repOldVal, repNewVal);
		break;
		case 6:
		System.out.println("Enter an old value to change: ");
		int repAllOldVal = scan.nextInt();
		System.out.println("Enter a new value to replace all old values: ");
		int repAllNewVal = scan.nextInt();
		list.replaceAll(repAllOldVal, repAllNewVal);
		break;
		case 7:
		list.sortDecreasing();
		break;
		case 8:
		System.out.print("Enter the value to look for: ");
		int target = scan.nextInt();
		int index = list.binarySearchD(target);
		if(index != -1)
			System.out.println("Found at location: " + index);
		else
			System.out.println("Not in list");
		break;
	    default:
		System.out.println("Sorry, invalid choice");
	    }
    }

    public static void printMenu()
    {
	System.out.println("\n   Menu   ");
	System.out.println("   ====");
	System.out.println("0: Quit");
	System.out.println("1: Create a new list (** do this first!! **)");
	System.out.println("2: Sort the list using selection sort");
	System.out.println("3: Find an element in the list using linear search");
	System.out.println("4: Print the list");
	System.out.println("5: Replace First");
	System.out.println("6: Replace All");
	System.out.println("7: Sort the list using selection sort in decreasing order");
	System.out.println("8: Find an element in the list if the list is in decreasing order");
	System.out.print("\nEnter your choice: ");
    }
}