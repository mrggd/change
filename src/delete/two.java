package delete;

public class two {
    public static void main(String[]args) throws Exception {
        SqListClass<Integer> B = new SqListClass<>();
        B.Add(4);
        B.Add(2);
        B.Add(1);
        B.Add(5);
        B.Add(3);
        B.Add(6);
        B.Add(4);
        B.change(B);
        System.out.print("运行后:");
        for (int i = 0; i < B.size; i++) {
            System.out.print(B.get(i)+" ");
        }
    }


}
