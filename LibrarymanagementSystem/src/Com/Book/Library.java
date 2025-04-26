package Com.Book;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
	ArrayList<Book> book=new ArrayList<Book>();
   public void addBook(Book b)
   {
	  book.add(b);
	  System.out.println("Book Added suscessfully...");
   }
   public void showBook()
   {
	   if(book.isEmpty())
	   {
		   System.out.println("Noo Books Are Added yet");
	   }
	   else
	   {
		   for(Book b:book)
		   {
			   b.display();
		   }
	   }
   }
   public void  searchBookById(int id)
   {
	   boolean ispresent=false;
	   if(book.isEmpty())
	   {
		   System.out.println("Book not found....");
	   }
	   else
	   {
		   for(Book b:book)
		   {
			   if(b.getBookId()==id)
			   {
				  System.out.println("Book is "+b.getTitle()); 
				  ispresent=true;
			   }
		   }
	   }
	   if(!ispresent)
	   {
		   System.err.println("Invalid Book Id Given...Book Not Found");
	   }
   }
   public void searchBookByAuthor(String s)
   {
	   boolean ispresent=false;
	   if(book.isEmpty())
	   {
		   System.out.println("Book not yet added...");
	   }
	   else
	   {
		   for(Book b:book)
		   {
			   if(b.getAuthor().equalsIgnoreCase(s) )
			   {
				   System.out.println(" Book is "+b.getTitle());
				   ispresent=true;
				   
			   }
		   }
	   }
	   if(!ispresent)
	   {
		   System.out.println("Enterd author is not presetn ...");
	   }
   }
   public void updateBookById(int id)
   {
	   boolean isUpdated=false;
	   if(book.isEmpty())
	   {
		   System.out.println("Book not yet added...");
	   }
	   else
	   {
		   for(Book b: book)
		   {
			   if(b.getBookId()==id)
			   {
				   b.setCost(1000.0);
				   isUpdated=true;
			   }
		   }
	   }
	   if(!isUpdated)
	   {
		   System.out.println("Enterd Cost of the book is invalid.. Book Not found");
	   }
   }
   public  void remove(double cost)
   {
	   boolean isRemoved=false;
	   if(book.isEmpty())
	   {
		   System.out.println("Books not yet added ...");
	   }
	   else
	   {
		   Iterator<Book> it=book.iterator();
		   while(it.hasNext())
		   {
			   Book b=it.next();
			   it.remove();
			   System.out.println("Book removed sucessfully...");
			   isRemoved=true;
		   }
	   }
	   if(!isRemoved)
	   {
		  System.out.println("Enterd cost of the book id invalid ... book not found"); 
	   }
   }
}
