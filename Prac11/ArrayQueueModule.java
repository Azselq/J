package mirea;

public class ArrayQueueModule {
    public Object[] queue;
    private int maxSize;
    private int nElem; //текущее количетсво элементов в очереди
    private int front;
    private int rear;
    public ArrayQueueModule(int maxSize) {
        this.maxSize = maxSize;
        queue = new Object[maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }
    //добавить элемент в очередь
    public void enqueue(Object elem) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queue[++rear] = elem; //увелечение rear и вставка
        nElem++;
    }
    //удалить и вернуть первый элемент в очереди
    public Object dequeue() {
        Object temp = queue[front++]; // получение первого элемента
        if (front == maxSize) {
            front = 0; //цикличесий перенос
        }
        nElem--;
        return temp;
    }
    //первый элемент в очереди
    public Object element() {
        return queue[front++];
    }
    //удаление элементов из очереди
    public void clear() {
        queue = new Object[maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }
    //очередь пуста?
    public boolean isEmpty() {
        return (nElem == 0);
    }
    //получить размер очереди
    public int getSize() {
        return nElem;
    }
}
