import java.util.Arrays;

public abstract class Stack {

    private int capacity;
    protected Object[] data;
    protected int top;
    private int count;
    public String cache;

    public Stack(int size){
        data = new Object[size];
        top = -1;
        capacity = size;
        count = 0;
    }

    public boolean isFull(){
        return top == capacity - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(Object x){
        if(isFull()){
            System.out.println("Stack Penuh!!!");
        }
        else
        {
            //System.out.println("Memasukkan " + x + " Ke Dalam Stack");
            data[++top] = x;
        }
    }

    public Object pop(){
        if(isEmpty()){
            //System.out.println("Stack Kosong!!!");
            return 0;
        }
        //System.out.println("Mengeluarkan " + data[top] + " Dari Stack");
        return data[top--];
    }

    public String printStack(){
        if(isEmpty()){
            //System.out.println("Stack Kosong!!!");
            return("List kosong");
        }
        else{
            cache = "";
            //System.out.print("Data Dalam Stack : ");
            for(int i = 0; i <= top; i++){
                cache = cache + (i+1) + ". " + data[i] + "\n";
            }
            //System.out.println();
            return("Barang yang dibeli: \n" +cache);
        }
    }
}
class listMinuman extends Stack{

    public listMinuman(int size) {
        super(size);
    }
    public void pushList(Object x){
        this.push(x);
    }
    public Object popList(){
        return this.pop();
    }
    public String printList(){
        return this.printStack();
    }
}
class hargaMinuman extends Stack{
    //int tops = top;
    public hargaMinuman(int size) {
        super(size);
    }
    public void pushHarga(Object x){
        this.push(x);
    }
    public Object popHarga(){
        return this.pop();
    }
    public String printHarga(){
        return this.printStack();
    }
    public int total(){
        int hasil = 0;
        //int length = harga.top;
        Integer[] dataInt = Arrays.copyOf(this.data, this.data.length, Integer[].class);
        for(int i = 0; i <=this.top; i++){
            hasil = hasil + dataInt[i];
        }
        return hasil;
    }
}