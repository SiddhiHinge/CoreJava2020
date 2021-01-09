package Day6.ArrayListPrac;

public class BookChanda {
		
		private String bookName;
		private int price;
		private int pageNo;
		
		public BookChanda() {
			
		}

		public BookChanda(String bookName, int price,int pageNo) {
			super();
			this.bookName = bookName;
			this.price = price;
			this.pageNo=pageNo;
		}

		public String getBookName() {
			return bookName;
		}

		public void setBookName(String bookName) {
			this.bookName = bookName;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getPageNo() {
			return pageNo;
		}

		public void setPageNo(int pageNo) {
			this.pageNo = pageNo;
		}

		@Override
		public String toString() {
			return "BookInfo [bookName=" + bookName + ", price=" + price + ", pageNo=" + pageNo + "]";
		}

}
