package models.dataSaver;

public class MemoryDataSaver<T> implements DataSaver<T> {
    private T data;


    @Override
    public void save(T a) {
        this.data = a;
    }

    @Override
    public T load() {
        return data;
    }
}
