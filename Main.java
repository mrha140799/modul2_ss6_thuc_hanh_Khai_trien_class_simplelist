package SimpleList;

public class Main {
    public static void main(String[] args) {
        Mylist<String> list = new Mylist<>();
        list.add("abc");
        list.add("def");
        System.out.println(list.get(1));
    }
}
