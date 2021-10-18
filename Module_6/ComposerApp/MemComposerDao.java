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

import java.util.ArrayList;
import java.util.List;

public class MemComposerDao implements ComposerDao {
	
	//Creates a new array list that will hold the data for each composer
	private List<Composer> Singers;
	
	/*
	 * A constructor that will hold all the data for each composer
	 * Allows the MemComposerDao to find the new list that was created with all the data in it
	 * Will return the data from MemComposerDao
	 */
	public MemComposerDao() {
		Singers = new ArrayList<Composer>();
		Singers.add(new Composer(9999, "Fall Out Boy", "Rock", "Sugar, We're Goin Down"));
		Singers.add(new Composer(9998, "Bruno Mars", "Pop", "Just The Way You Are"));
		Singers.add(new Composer(9997, "Eminem", "Rap", "Lose Yourself"));
		Singers.add(new Composer(9996, "Backstreet Boys", "Pop", "I Want It That Way"));
		Singers.add(new Composer(9995, "Pitbull and Ne-Yo", "Pop", "Time OF Our Lives"));
		Singers.add(new Composer(9994, "MKTO", "Pop", "Classic"));
	}

	//FindAll override that will allow the posting of all the composers in the constructor above
	@Override
	public List<Composer> findAll() {
		return Singers;
	}

	//FindBy override that will allow the user to find a specific composer based on their ID
	@Override
	public Composer findBy(Integer ID) {
		for (Composer composers : this.Singers) {
			if(composers.getID() == ID.intValue()) {
				return composers;
			}
	}
		return null;
}

	//Insert override that will allow the user to add another composer to the above list of composers into the constructor
	@Override
	public void insert(Composer composers) {
				Singers.add(composers);
		}
		
}