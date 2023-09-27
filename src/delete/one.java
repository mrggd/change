package delete;

public class one {
        public static void main(String[] args) throws Exception {


                SqListClass<Integer> A = new SqListClass<>();
                A.Add(1);
                A.Add(2);
                A.Add(-1);
                A.Add(-2);
                A.Add(3);
                A.Add(-3);
                A.delete(A);
                System.out.print("运行后:");
                for (int i = 0; i < A.size; i++) {
                        System.out.print(A.get(i)+" ");
                }
        }
}