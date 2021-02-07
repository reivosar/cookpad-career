package sort;

import reivosar.common.util.concurrent.promise.Promise;
import sort.bubble.BubbleSort;
import sort.insertation.InsertationSort;
import sort.merge.MergeSort;
import sort.quick.QuickSort;
import sort.selection.SelectionSort;

public class SortPerformanceMeasurement
{
    public static void main(String[] args) {
        new SortPerformanceMeasurement().run();
    }

    private void run() {
        SortItemGenerator generator = new SortItemGenerator();
        sortAction("ランダム値", generator.random ());
        sortAction("ソート済",  generator.sorted ());
        sortAction("同値",    generator.same   ());
    }

    private void sortAction(String sortItemType, int[] sortItems) {
        System.out.println ("ソート種別：" + sortItemType);
        Promise.multi(5)
            .then(() -> doSort(new BubbleSort      (sortItems)))
            .then(() -> doSort(new SelectionSort   (sortItems)))
            .then(() -> doSort(new InsertationSort (sortItems)))
            .then(() -> doSort(new QuickSort       (sortItems)))
            .then(() -> doSort(new MergeSort       (sortItems)))
            .await();
        ;
    }

    private int[] doSort(SortTemplate sortClass) {
        return sortClass.execute();
    }
}
