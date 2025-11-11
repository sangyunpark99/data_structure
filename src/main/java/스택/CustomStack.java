package 스택;

import java.util.Arrays;
import java.util.EmptyStackException;

public class CustomStack<E> {
    private Object[] data;
    private int size = 0;
    private static final int DEFAULT_CAP = 1;

    public CustomStack() {
        data = new Object[DEFAULT_CAP];
    }

    public void push(E item) {
        ensureCapacityForPush();
        data[size++] = item;
    }

    @SuppressWarnings("unchecked")
    public E pop() {
        if(size == 0) throw new EmptyStackException();
        E item = (E) data[--size];
        data[size] = null;
        shrinkIfNeeded();
        return item;
    }

    @SuppressWarnings("unchecked")
    public E peek() {
        if(size == 0) throw new EmptyStackException();
        E item = (E) data[size - 1];
        return item;
    }

    private void shrinkIfNeeded() {
        int cap = data.length;
        if(cap <= DEFAULT_CAP) return;
        if(size <= cap / 4) { // 용량 사용률 25% 이하인 경우
            int newCap = Math.min(size / 2, DEFAULT_CAP); // 크기 절반으로 줄이기
            data = Arrays.copyOf(data, newCap);
        }
    }

    private void ensureCapacityForPush() {
        if(size == data.length) {
            int newCap = data.length * 2;
            data = Arrays.copyOf(data, newCap);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < size; i++) {
            sb.append(data[i]).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");

        return sb.toString();
    }
}
