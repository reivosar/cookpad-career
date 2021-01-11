package sort;

import org.junit.jupiter.api.Test;

import sort.selection.SelectionSort;

class SelectionSortTest extends SortTestTemplate
{
    @Override
    protected Sort getTestClass(int[] random_array) {
        return new SelectionSort(random_array);
    }

    @Test
    void test() {
        assertArray(testClass.execute());
    }
}
