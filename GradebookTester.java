import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class GradebookTester
{
    private GradeBook gradeBook1;
    private GradeBook gradeBook2;

    @Before
    public void setUp()
    {

        gradeBook1 = new GradeBook(5);
        gradeBook2 = new GradeBook(5);


        gradeBook1.addScore(50);
        gradeBook1.addScore(75);

        gradeBook2.addScore(25);
        gradeBook2.addScore(100);
        gradeBook2.addScore(60);
        gradeBook2.addScore(30);
    }

    @After
    public void tearDown()
    {
        gradeBook1 = null;
        gradeBook2 = null;
    }

    @Test
    public void inaddScoreTest()
    {
        assertTrue((gradeBook1.toString()).equals("50.0 75.0"));
        assertTrue((gradeBook2.toString()).equals("30.0 10.0 40.0 20.0"));

        assertEquals(2, gradeBook1.getScoresSize(), 0.001);
        assertEquals(4, gradeBook2.getScoresSize(), 0.001);
    }

    @Test
    public void intestSum()
    {
        assertEquals(125.0, gradeBook1.sum(), 0.0001);
        assertEquals(215.0, gradeBook2.sum(), 0.0001);
    }

    @Test
    public void intestMinimum()
    {
        assertEquals(50.0, gradeBook1.minimum(), 0.001);
        assertEquals(25.0, gradeBook2.minimum(), 0.001);
    }

    @Test
    public void intestFinalScore()
    {
        assertEquals(75.0, gradeBook1.finalScore(), 0.001);
        assertEquals(190.0, gradeBook2.finalScore(), 0.001);
    }
}