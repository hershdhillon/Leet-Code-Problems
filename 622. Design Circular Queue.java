class MyCircularQueue {

    /** Initialize your data structure here. Set the size of the queue to be k. */
    List<Integer> list;
    int capacity;
    int start;
    int end;
	
    public MyCircularQueue(int k) {
        list = new ArrayList<>();
        capacity = k;
        start = 0;
        end = 0;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (end - start < capacity) {
            list.add(value);
            end++;
            return true;
        } 
        return false;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (end > start) {
            start++;
            return true;
        }
        return false;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if (this.isEmpty()) {
            return -1;
        }
        return list.get(start);
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if (this.isEmpty()) {
            return -1;
        }
        return list.get(end-1);
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return start == end;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return (end - start) == capacity;
    }
}