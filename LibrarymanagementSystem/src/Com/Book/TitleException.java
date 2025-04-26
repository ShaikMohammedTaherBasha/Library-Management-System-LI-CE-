package Com.Book;

public class TitleException extends RuntimeException {
	public String toString()
	{
		return getClass()+"InvalidTitleException";
	}

}
