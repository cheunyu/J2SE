package generic.example;

public class Zoo<T>{

    private T item;
    public  Zoo(T t){
        item = t;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
