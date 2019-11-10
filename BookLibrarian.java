package strat_pattern;

public class BookLibrarian {

	private InterfaceSortBook sortMethod = null;
	private BookInformation[] bookArr = new BookInformation[20];
	
	public void executeSort() {
		sortMethod.sortMethod(bookArr);
	}
	
	public void setSortMethod(InterfaceSortBook sb) {
		sortMethod = sb;
	}
	
	public BookInformation[] getBookArr() {
		return bookArr;
	}
	
	public void addBookAt(int index,BookInformation b){
		 bookArr[index]=b;
	}
	
	public String printList() {
		String build="";
		for(BookInformation b:bookArr) {
			build+=b.Title+","+'\n'+b.Author+","+'\n'+b.YearPublished+","+'\n'+b.Summary+'\n'+'\n';
		}
		return build;		
	}
}
