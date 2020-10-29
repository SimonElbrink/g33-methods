package se.lexcion.simon;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test_IsAdult_success(){
        //Arrange
        int age = 18;
        boolean expected = true;

        //Act
        boolean actual = App.isAdult(age);

        //Assert
        assertEquals(expected, actual);
        assertTrue(actual);
        assertNotNull(actual);
    }

    @Test
    public void test_IsAdult_unsuccessfully(){
        //Arrange
        int age = 17;

        //Act
        boolean actual = App.isAdult(age);

        //Assert
        assertFalse(actual);

    }

}
