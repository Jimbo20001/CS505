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

import java.util.List;

/*
 * Creates data fields that will persist through multiple layers
 * Allows the option of finding all the composers
 * Allows the option to find by their ID
 * Allows you to add another composer
 */
public interface GenericDao<E,K> {
	public List<E> findAll();
	public E findBy(K key);
	public void insert (E entity);
	
}
