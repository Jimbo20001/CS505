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
 * Extends the GenericDao
 * Allows you to use the composer objects
 * Allows you to use integer in a argument from the composer
 * Causes all the data to persist through multiple layers
 */
public interface ComposerDao extends GenericDao <Composer, Integer> {
	
}