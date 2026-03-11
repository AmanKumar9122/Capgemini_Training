import java.util.*;

class Heap {
    List<Integer> heap = new ArrayList<>();

    void insert(int val) {
        heap.add(val);
        int i = heap.size() - 1;

        while (i > 0) {
            int parent = (i - 1) / 2;
            if (heap.get(parent) > heap.get(i)) {
                Collections.swap(heap, parent, i);
                i = parent;
            } else {
                break;
            }
        }
    }

    int remove() {
        int root = heap.get(0);
        int last = heap.remove(heap.size() - 1);

        if (heap.size() > 0) {
            heap.set(0, last);
            heapify(0);
        }

        return root;
    }

    void heapify(int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int smallest = i;

        if (left < heap.size() && heap.get(left) < heap.get(smallest)) {
            smallest = left;
        }

        if (right < heap.size() && heap.get(right) < heap.get(smallest)) {
            smallest = right;
        }

        if (smallest != i) {
            Collections.swap(heap, i, smallest);
            heapify(smallest);
        }
    }
}

public class HeapImplementation {
    public static void main(String[] args) {
        Heap h = new Heap();

        h.insert(10);
        h.insert(5);
        h.insert(30);
        h.insert(2);

        System.out.println(h.remove());
        System.out.println(h.remove());
    }
}