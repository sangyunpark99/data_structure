package 힙;

import java.util.ArrayList;

public class MinHeapEx {

    // 완전 이진 트리 형태(포화 이진 트리)
    // 중복 값을 허용한다.

    public static class MinHeap {
        ArrayList<Integer> heap;

        public MinHeap() {
            this.heap = new ArrayList<>();
            this.heap.add(0);
        }

        // 1. 트리의 가장 끝부분에 데이터를 추가 해준다(ArrayList 기준 맨뒤)
        // 2. 부모 노드로 올라오면서, 크기 비교를 한후 위치를 변경한다.
        public void insert(int data) {
            heap.add(data);

            // 정렳
            int cur = heap.size() - 1; // 방금 넣은 데이터의 인덱스 위치
            while(cur > 1 && heap.get(cur / 2) > heap.get(cur)) {
                int parentValue = heap.get(cur / 2);
                heap.set(cur / 2, data);
                heap.set(cur, parentValue);

                cur /= 2; // 트리 타고 올라가기
            }
        }

        public void remove() {
            heap.remove(1);
        }

        public void printTree() {
            for(int i = 1; i < this.heap.size(); i++) {
                System.out.print(this.heap.get(i) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MinHeap minheap = new MinHeap();
        minheap.insert(30);
        minheap.insert(40);
        minheap.insert(10);
        minheap.printTree();
        minheap.insert(50);
        minheap.insert(60);
        minheap.insert(70);
        minheap.printTree();
        minheap.insert(20);
        minheap.printTree();
        minheap.insert(30);
        minheap.printTree();
    }
}
