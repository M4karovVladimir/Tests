import first_task.SetMerger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;
import java.util.HashSet;

public class SetMergerTest {
    @Test
    public void testMergeWithOverlappingSets(){
        SetMerger setMerger = new SetMerger();

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);


        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> expectedResult = new HashSet<>();
        expectedResult.add(1);
        expectedResult.add(2);
        expectedResult.add(3);
        expectedResult.add(4);
        expectedResult.add(5);


        Set<Integer> resultSet = new SetMerger().mergeSets(set1, set2);
        assertEquals(expectedResult, resultSet);
    }

    @Test
    public void testMergeWithNonOverlappingSets(){
        SetMerger setMerger = new SetMerger();

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);


        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        Set<Integer> expectedResult = new HashSet<>();
        expectedResult.add(1);
        expectedResult.add(2);
        expectedResult.add(3);
        expectedResult.add(4);
        expectedResult.add(5);
        expectedResult.add(6);

        Set<Integer> resultSet = new SetMerger().mergeSets(set1, set2);
        assertEquals(expectedResult, resultSet);
    }

    @Test
    public void testMergeWithEmptySet(){
        SetMerger setMerger = new SetMerger();

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();

        Set<Integer> expectedResult = new HashSet<>();
        expectedResult.add(1);
        expectedResult.add(2);
        expectedResult.add(3);

        Set<Integer> resultSet = new SetMerger().mergeSets(set1, set2);
        assertEquals(expectedResult, resultSet);

    }
    @Test
    public void testMergeWithSelf(){
        SetMerger setMerger = new SetMerger();

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> expectedResult = new HashSet<>();
        expectedResult.add(1);
        expectedResult.add(2);
        expectedResult.add(3);

        Set<Integer> resultSet = new SetMerger().mergeSets(set1, set1);
        assertEquals(expectedResult, resultSet);
    }

    @Test
    public void testMergeTwoEmptySets(){
        SetMerger setMerger = new SetMerger();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        Set<Integer> expectedResult = new HashSet<>();

        Set<Integer> resultSet = setMerger.mergeSets(set1, set2);
        assertEquals(expectedResult, resultSet);
    }

}


