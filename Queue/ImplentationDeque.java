import java.util.* ;
import java.io.*;

public class ImplentationDeque {
    int[] q;
    int f, r, n;

    public ImplentationDeque(int nn) {
        n = nn;
        q = new int[n];
        f = -1;
        r = -1;
    }

    public boolean pushRear(int data) {
        if (isFull()) {
            return false;
        }
        if (f == -1) {
            f = 0;
            r = 0;
        } else {
            r = (r + 1) % n;
        }
        q[r] = data;
        return true;
    }

    public boolean pushFront(int data) {
        if (isFull()) {
            return false;
        }
        if (f == -1) {
            f = 0;
            r = 0;
        } else {
            f = (f - 1 + n) % n;
        }
        q[f] = data;
        return true;
    }

    public int popFront() {
        if (isEmpty()) {
            return -1;
        }
        int x = q[f];
        if (f == r) {
            f = -1;
            r = -1;
        } else {
            f = (f + 1) % n;
        }
        return x;
    }

    public int popRear() {
        if (isEmpty()) {
            return -1;
        }
        int x = q[r];
        if (f == r) {
            f = -1;
            r = -1;
        } else {
            r = (r - 1 + n) % n;
        }
        return x;
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return q[f];
    }

    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return q[r];
    }

    public boolean isEmpty() {
        return f == -1;
    }

    public boolean isFull() {
        return (r + 1) % n == f;
    }
}
