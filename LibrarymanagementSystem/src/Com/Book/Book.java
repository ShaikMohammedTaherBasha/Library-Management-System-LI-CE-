package Com.Book;

import java.io.Serializable;
import java.util.Random;


public class Book implements Serializable {
   private int bookId;
   private String title;
   private String author;
   private double cost;
   private int noofpages;
   Random r=new Random();
   public Book() {}
public Book( String title, String author, double cost, int noofpages) {
	super();
	this.bookId = r.nextInt(123456);
	 boolean titlests=BookValidation.titlevalidation(title);
	 boolean autorsts=BookValidation.authorValidation(author);
	 boolean coststs=BookValidation.costValidation(cost);
	 boolean pagests=BookValidation.pagesValidation(noofpages);
	 if(titlests)
	 {
		 this.title=title;
	 }
	 else
	 {
		 TitleException e=new TitleException();
		 throw e;
	 }
 if(autorsts) 
	 {
		 this.author=author;
	 }
	 else
	 {
		 AuthorException e=new AuthorException();
		 throw e;
	 }
	 if(coststs)
	 {
		 this.cost=cost;
	 }
	 else
	 {
		 CostException e=new CostException();
		 throw e;
	 }
	 if(pagests)
	 {
		 this.noofpages=noofpages;
	 }
	 else
	 {
		 PagesException e= new PagesException();
		 throw e;
	 }
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public int getNoofpages() {
	return noofpages;
}
public void setNoofpages(int noofpages) {
	this.noofpages = noofpages;
}
   public void display()
   {
	   System.out.println(" Book Id :"+ getBookId());
	   System.out.println("Book Title :"+getTitle());
	   System.out.println("Book Author :"+getAuthor());
	   System.out.println("Book Cost :"+getCost());
	   System.out.println("No Of Pages :"+getNoofpages());
   }
   public String toString()
   {
	   return "\n Book Id "+getBookId()+"\n Book Titile :"+getTitle()+"\n Book Author "+getAuthor()+" \n Book Cost "+getCost()+"\n No of Pages :"+getNoofpages();
   }
}
