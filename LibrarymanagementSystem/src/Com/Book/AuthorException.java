package Com.Book;

public class AuthorException extends RuntimeException{
	public String toString()
	{
		return getClass()+"AuthorNotPresent";
	}

}
