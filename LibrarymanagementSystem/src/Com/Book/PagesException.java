package Com.Book;

public class PagesException extends RuntimeException {
public String toString()
{
	return getClass()+"PagesOutOfBoundsException";
}
}
