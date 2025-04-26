package Com.Book;

public class BookValidation {
public static boolean titlevalidation(String s)
{    boolean ispresent=false;
	String titles[]= {"Java","Sql","Web","Cloud"};
	for(int i=0;i<=titles.length-1;i++)
	{
		if(s.equalsIgnoreCase(titles[i]))
		{
			ispresent=true;
		}
	}
	if(ispresent)
	{
		return true;
	}
	else
	{
		return false;
	}
}
public static boolean authorValidation(String s)
{
	boolean ispresent=false;
	String authors[]= {"James","scott","Smith","Allean"};
	for(int i=0;i<=authors.length-1;i++)
	{
		if(s.equalsIgnoreCase(authors[i]))
		{
			ispresent=true;
		}
	}
	if(ispresent)
	{
		return true;
	}
	else
		return false;
}
public static boolean costValidation(double cost)
{
	if(cost>300 && cost<3000)
	{
		return true;
	}
	else
		return false;
}
public static boolean pagesValidation(int p)
{
	if(p>200 && p<1000)
		return true;
	else
		return false;
}
}
