import java.util.LinkedList;
class Linkedlist{
    public static void main(String[] args) {
        LinkedList<String> tasks=new LinkedList<>();
        tasks.add("Learn Java");
        tasks.add("Learn Sql");
        tasks.add("Learn React");

        tasks.addFirst(" start Training");
        tasks.addFirst("Build project");
        System.out.println(tasks);

        tasks.removeFirst();
        tasks.removeFirst();
        System.out.println("After removal:"+ tasks);
    }
}