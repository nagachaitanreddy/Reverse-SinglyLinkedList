class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    SinglyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReversePrint {

    static void reversePrint(SinglyLinkedListNode head) {
        if (head == null) {
            return;
        }

        Stack<Integer> stack = new Stack<>();
        SinglyLinkedListNode current = head;

        while (current != null) {
            stack.push(current.data);
            current = current.next;
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    static SinglyLinkedListNode buildLinkedList(int[] values) {
        if (values.length == 0) {
            return null;
        }

        SinglyLinkedListNode head = new SinglyLinkedListNode(values[0]);
        SinglyLinkedListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new SinglyLinkedListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] values = new int[n];

            for (int j = 0; j < n; j++) {
                values[j] = scanner.nextInt();
            }

            SinglyLinkedListNode head = buildLinkedList(values);
            reversePrint(head);
        }

        scanner.close();
    }
}