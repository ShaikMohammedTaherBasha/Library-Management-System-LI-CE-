package Com.Book;

public class CostException extends RuntimeException {
public String toString()
{
	return getClass()+"CostIsInvalidException";
}
}
