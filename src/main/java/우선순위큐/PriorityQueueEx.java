package 우선순위큐;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

    // 1. 저장공간으로 배열을 사용한다.
    // 2. 각 요소를 힙(이진 트리의 한 종류, 큰 값이나 작은 값을 빠르게 찾을 수 있음)라는 자료구조의 형태로 저장한다.
    // 3. 반 정렬 상태이다.
    // 4. 이진 트리의 루트 노드에는 가장 작은 혹은 가장 큰 값이 존재한다.

    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(); // PriorityQueue는 queue의 구현체이다.
        pq.offer(1);
        pq.offer(2);
        pq.offer(3);
        pq.offer(4);
        pq.offer(5);
        System.out.println(pq);

        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
