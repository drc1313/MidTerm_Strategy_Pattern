package strat_pattern;

public class Main {
	
	public static void main(String args[]) {
		String[][] raw = books();
		BookLibrarian librarian = new BookLibrarian();
		
		
		for(int i=0;i!=20;i++) {
			librarian.addBookAt(i, new BookInformation(raw[i][0], raw[i][1], raw[i][2], raw[i][3]));
		}
		System.out.println("---------------Sorting Authors-------------");
		librarian.setSortMethod(new SortAuthor());
		librarian.executeSort();		
		System.out.println(librarian.printList());
		
		System.out.println("---------------Sorting Years---------------");
		librarian.setSortMethod(new SortYear());
		librarian.executeSort();		
		System.out.println(librarian.printList());
		
		System.out.println("---------------Sorting Titles---------------");
		librarian.setSortMethod(new SortTitle());
		librarian.executeSort();		
		System.out.println(librarian.printList());
		
		
	}
	
	public static String[][] books() {
		String[][] arr ={
				{"ULYSSES", "James Joyce", "1975","I'd rather be a bird than a fish."},
				{"THE GREAT GATSBY", "Scott Fitzgerald", "1942","I currently have 4 windows open up… and I don’t know why."},
				{"A PORTRAIT OF THE ARTIST AS A YOUNG MAN", "James Joyce", "1922","They got there early, and they got really good seats."},
				{"LOLITA", "Vladimir Nabokov", "1985","Yeah, I think it's a good environment for learning English."},
				{"BRAVE NEW WORLD", "Aldous Huxley", "1972","Sometimes, all you need to do is completely make an ass of yourself and laugh it off to realise that life isn’t so bad after all."},
				{"THE SOUND AND THE FURY", "William Faulkner", "1940","Tom got a small piece of pie."},
				{"CATCH-22", "Joseph Heller", "1910","Wednesday is hump day, but has anyone asked the camel if he’s happy about it?"},
				{"DARKNESS AT NOON", "Arthur Koestler", "1962","There was no ice cream in the freezer, nor did they have money to go to the store."},
				{"SONS AND LOVERS", "D.H. Lawrence", "1932","Sometimes, all you need to do is completely make an ass of yourself and laugh it off to realise that life isn’t so bad after all."},
				{"THE GRAPES OF WRATH", "John Steinbeck", "1752","She advised him to come back at once."},
				{"THE GREAT GATSBY", "Scott Fitzgerald", "1937","A song can make or ruin a person’s day if they let it get to them."},
				{"UNDER THE VOLCANO", "Malcolm Lowry", "1947","Everyone was busy, so I went to the movie alone."},
				{"THE WAY OF ALL FLESH", "Samuel Butler", "1963","She borrowed the book from him many years ago and hasn't yet returned it."},
				{"1984", "George Orwell", "1912","I want more detailed information."},
				{"I, CLAUDIUS", "Robert Graves", "1992","If you like tuna and tomato sauce- try combining the two. It’s really not as bad as it sounds."},
				{"TO THE LIGHTHOUSE", "Virginia Woolf", "1963","A purple pig and a green donkey flew a kite in the middle of the night and ended up sunburnt."},
				{"AN AMERICAN TRAGEDY", "Theodore Dreiser", "1979","Please wait outside of the house."},
				{"THE HEART IS A LONELY HUNTER", "Carson McCullers", "1946","The stranger officiates the meal."},
				{"SLAUGHTERHOUSE-FIVE", "Kurt Vonnegut", "1914","A song can make or ruin a person’s day if they let it get to them."},
				{"INVISIBLE MAN", "Ralph Ellison", "1933","Don't step on the broken glass."},
				{"NATIVE SON", "Richard Wright", "1994","He turned in the research paper on Friday; otherwise, he would have not passed the class."}

		};
		return arr;
		
	}
	
}
