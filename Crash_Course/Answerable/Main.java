public class Main {
    public static void main(String[] arg){
        Answerable ans=()->"Hello, World";
        System.out.println(ans.answer());
        Predicate check=n->n%2==0;
        System.out.println(check.check(8));
    }
}
