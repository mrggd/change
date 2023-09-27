package second;

import delete.SqListClass;

public class forth {
    public static void main(String[]args) throws Exception {
        SqListClass<Integer> A = new SqListClass<>();
        SqListClass<Integer> B = new SqListClass<>();
        A.Add(1);
        A.Add(3);
        A.Add(2);
        B.Add(5);
        B.Add(1);
        B.Add(4);
        B.Add(2);

        A.differenceset(A,B);

    }
}
