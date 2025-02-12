/** @author Somesh Diwan
 *  @version 1.0
 *  @since 2025
 **/

/**
 *
 * @author Somesh Diwan
 *
 * Class for Library Book
 */

public class JAVADocumentaion
{

    /**
     * @value 10 default value
     */
    static int val=10;


    /**
     * Parametrized Constructor
     * @param s Book Name
     */

    public JAVADocumentaion(String s){
    }

    /**
     * Issue a Book to a Student
     * @param roll roll number of a Student
     * @throws Exception if book is not available, throws Exception
     */
    public void issue(int roll) throws Exception{
    }

    /**
     * Check if book is available
     * @param str Book Name
     * @return if book is available returns true else false
     */
    public boolean available(String str){
        return true;
    }

    /**
     * Get Book name
     * @param id book id
     * @return returns book name
     */
    public String getName(int id){
        return "";
    }
}