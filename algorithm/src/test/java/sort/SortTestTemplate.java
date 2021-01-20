package sort;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;

abstract class SortTestTemplate
{
    private int[] random_array;
    private int[] sorted_array;
    protected SortTemplate testClass;

    @BeforeEach
    void setup() {
        this.random_array = new int[] {2, 5, 1, 1, 3, 4};
        this.testClass    = getTestClass        (random_array);
        this.sorted_array = testClass.arraycopy (random_array);
        Arrays.sort (sorted_array);
    }

    protected abstract SortTemplate getTestClass(int[] random_array);

    protected void assertArray(int[] result) {
        assertThat(result, is(sorted_array));
    }
}
