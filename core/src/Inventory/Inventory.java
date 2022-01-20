package Inventory;

import java.util.ArrayList;

public class Inventory <T>{
    protected ArrayList<T> contents;
    public Inventory(){
        this.contents = new ArrayList<>();
    }

    public void add(T t){
        contents.add(t);
    }

    public T get(int index){
        return contents.get(index);
    }

    public void remove(int index){
        contents.remove(index);
    }


}
