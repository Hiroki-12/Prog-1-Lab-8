

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CommentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommentTest
{
    private Comment comment;
    /**
     * Default constructor for test class CommentTest
     */
    public CommentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    /**
     * 
     */
    @Test
    public void testDuplicateAuthor()
    {
        SalesItem salesIte1 = new SalesItem("Title",2);
        
        assertEquals(true, salesIte1.addComment("John", "First", 2));
        assertEquals(false, salesIte1.addComment("John", "Second", 2));
    }
    
    /**
     * 
     */
    @Test
    public void testInvalidRatings0()
    {
        SalesItem salesIte1 = new SalesItem("Title",2);
        
        assertEquals(false, salesIte1.addComment("John", "First", 0));
    }
    
    /**
     * 
     */
    @Test
    public void testInvalidRatings6()
    {
        SalesItem salesIte1 = new SalesItem("Title",2);
        
        assertEquals(false, salesIte1.addComment("Adam", "Second", 6));
    }
}   
