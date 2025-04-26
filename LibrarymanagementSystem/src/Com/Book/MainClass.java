package Com.Book;

import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	Library l=new Library();
	boolean start=true;
	while(start)
		
	{   
		System.out.println("Enter your Choice ");
		System.out.println("Press 1 for Adding book");
		System.out.println("Press 2 for Displaing book details");
		System.out.println("Press 3 for Searching book by Id");
		System.out.println("Press 4 for searhing  book by author");
		System.out.println("Press 5 for Updating  book");
		System.out.println("Press 6 for Removing book");
		System.out.println("Press 7 to exit");
		int ch=s.nextInt();
		switch(ch)
		{
		case 1 :
		{ 
			  System.out.println("Enter Book Title");
			  String title=s.next();
			  System.out.println("Enter Author of the Book");
			  String author=s.next();
			  System.out.println("Enter Cost of the book ");
			  double cost=s.nextDouble();
			  System.out.println("Enter No of Pa=ges");
			  int pages=s.nextInt();
			   l.addBook(new Book( title, author, cost, pages));
		}
		break;
		case 2 :
		{
			  l.showBook();
				
		}
		break;
		case 3 :
		{
			System.out.println("Enter the book id ");
			int id=s.nextInt();
			l.searchBookById(id);
		}
		break;
		case 4 :
		{       
			System.out.println("Enter the Book Author");
			String author=s.next();
			l.searchBookByAuthor(author);
		}
		break;
		case 5 :
		{
			System.out.println("Enter the Id of the book");
			int cost=s.nextInt();
			l.updateBookById(ch);
		}
		break;
		case 6: {
			System.out.println("Enter the cost of the Book");
			double cost=s.nextDouble();
			l.remove(cost);
		}
		break;
		case 7:
		{
			start=false;
			System.out.println("Thank you...🙏🏾 Visit again");
		}
		break;
		default : {
			System.out.println("Enter valid Choice...");
		}
		}
	}
	 
}
}
