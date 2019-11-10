package strat_pattern;
public class SortYear implements InterfaceSortBook {

	@Override
	public BookInformation[] sortMethod(BookInformation[] bookArr) {
		boolean flag = true;
        BookInformation temp;

        while (flag){
          flag = false;
          for (int i=0;i!=bookArr.length-1;i++){
			  if (bookArr[i].YearPublished.compareToIgnoreCase(bookArr[i+1].YearPublished)>0){
				  temp = bookArr[i];
				  bookArr[i] = bookArr[i+1];
				  bookArr[i+1] = temp;
				  flag = true;
			  }
           }
        }
		return bookArr;
	}

}
