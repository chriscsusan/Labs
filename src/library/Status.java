package library;

public enum Status {
	ON_SHELF, CHECKED_OUT, RETURNED, ON_ORDER;

	public String toString() {
		if (this == Status.CHECKED_OUT) {
			return "Book is currently checked out by another person.";
		} else if (this == Status.ON_ORDER) {
			return "Book is currently on order and should be in soon.";
		} else if (this == Status.ON_SHELF) {
			return "Book is on the shelf and available for check out.";
		} else if (this == Status.RETURNED) {
			return "Book has been returned but has not been put back on the shelf.";
		}
		return "";
	}
}