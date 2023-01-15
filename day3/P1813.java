package day3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class P1813 {
    public static void main(String[] args) {

    }

    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        Deque<String> queue1 = new ArrayDeque<>();
        Deque<String> queue2 = new ArrayDeque<>();
        for (String s : sentence1.split(" ")) {
            queue1.offer(s);
        }

        for (String s : sentence2.split(" ")) {
            queue2.offer(s);
        }

        while (!queue1.isEmpty() && !queue2.isEmpty() && queue1.peekLast().equals(queue2.peekLast())){
            queue1.pollLast();
            queue2.pollLast();
        }
        while (!queue1.isEmpty() && !queue2.isEmpty() && queue1.peekFirst().equals(queue2.peekFirst())){
            queue1.pollFirst();
            queue2.pollFirst();
        }

        return queue1.isEmpty() || queue2.isEmpty();
    }
}
