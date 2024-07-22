public class  CustomGenericArrayList<T> {
    private Object[] data;

    public int getSize() {
        return size;
    }

    private static final int DEFAULT_SIZE = 10;
    private int size = 0;
    CustomGenericArrayList(){
        data = new Object[DEFAULT_SIZE];
    }
    public void add(T n){
        if(isFull()){
            resize();
        }
        data[size++] = n;
    }
    public boolean isFull() {
        return size == data.length;
    }
    public void resize() {
        Object[] temp = new Object[2*size];
        for(int i = 0 ; i < size; i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    public T remove(int i){
        if(i>=size){
            throw new IndexOutOfBoundsException("Index " + i + " is out of bounds for length "+size+ "!");
        }
        T temp = (T)data[i];
        for(int j = i; j < size-1; j++){
            data[j] = data[j+1];
        }
        size--;
        return temp;
    }
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i = 0; i < size-1; i++){
            s.append(data[i]+", ");
        }
        s.append(data[size-1]+"]");
        return s.toString();
    }


    public  T get(int i){
        if(i>=size){
            throw new IndexOutOfBoundsException("Index " + i + " is out of bounds for length "+size+ "!");
        }
        return  (T) data[i];
    }


}
