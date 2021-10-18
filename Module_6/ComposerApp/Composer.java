/*
 * Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 * Comprehensive Version (12th ed.). Pearson Education, Inc.
 * Modified by R. Krasso 2021
 * Additional modifications by A. Student 2021
 */
/*
 * Tabor, J. (2021). CIS 505 Intermediate Java Programming. 
 * Bellevue University.
 */

/*
 * Date fields for the composer are below
 * Along with constructor and no constructor
 * As well as accessors and setters
 */
public class Composer {
	private int ID; //Data field to hold the ID number
	private String Name; //Data field to hold the name of the singer or band
	private String Genre; //Data field to hold the name of the genre they sing in
	private String Song; //Data field to hold the recommend song to listen to by them
	
	//A no argument Constructor
	public Composer() {
		this.ID = 0;
		this.Name = "";
		this.Genre = "";
		this.Song = "";
	}
	
	//Argument constructor
	public Composer (int ID, String Name, String Genre, String Song) {
		this.ID = ID;
		this.Name = Name;
		this.Genre = Genre;
		this.Song = Song;
	}
	
	//Accessors and setters
	public int getID() {
		return ID;
	}
	
	public String getGenre() {
		return Genre;
	}
	
	public String getName() {
		return Name;
	}
	
	public String getSong() {
		return Song;
	}
	
	public void setGenre(String genre) {
		Genre = genre;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public void setSong(String song) {
		Song = song;
	}
	
	/*
	 * Tostring override that will post the information for each band or person
	 * Tells you their name, ID, genre and song
	 * Puts each set of information on different lines
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("\n Their ID is: %d\n The band or person's name is: %s\n Their genre is: %s\n The song recommendation is: %s", ID, Name, Genre, Song);
	}
	
}