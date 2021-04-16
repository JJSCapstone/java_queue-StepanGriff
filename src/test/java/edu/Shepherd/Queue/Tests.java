package edu.Shepherd.Queue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class Tests {
    @Test
    public void testConstructor()
    {
        Queue test = new Queue();
        assertEquals(test.head, null);
    }

    @Test
    public void testSize()
    {
        int testSize =5;
        Queue<Integer> test = new Queue<Integer>();

        for (int i = 0; i < testSize; i++)
        {
            test.insert(i);
        }
        assertEquals(test.size(), testSize);
    }

    @Test
    public void testInsert()
    {
        Queue<String> test = new Queue<String>();
        String example = "Justin";
        test.insert(example);
        assertFalse(test.isEmpty());
        Queue<String> current = test.head;
        while (current.next!=null){
            current = current.link;
        }
        assertEquals(current.data, example);
        
    }

    public void testPeek()
    {
        int ex1= 1;
        int ex2=2;
        Queue<Integer> test = new Queue<Integer>();
        test.insert(ex1);
        test.insert (ex2);
        assertEquals(test.peek().data, ex1);

    }

    public void testPop()
    {
        int testSize = 5;
        Queue<Integer> test = new Queue<Integer>();
        for (int i = 0; i < testSize; i++)
        {
            test.insert(i);
        }
        for (int i = testSize-1; i > 0; i++)
        {
            assertEquals(test.pop(), i);
        }
    }

    public void testIsEmpty()
    {
        int testSize =5;
        Queue<Integer> test = new Queue<Integer>();
        assertTrue(test.isEmpty());
        for (int i = 0; i < testSize; i++)
        {
            test.insert(i);
        }
        assertFalse(test.isEmpty());
    }
}
