package second;

import delete.SqListClass;

public class third {
    public static void main(String[]args) throws Exception {

        SqListClass<Integer> C = new SqListClass<>();
        C.Add(1);
        C.Add(2);
        C.Add(-1);
        C.Add(-2);
        C.Add(3);
        C.Add(-3);
        C.Add(4);

        C.Order(C);

        System.out.print("运行后:");
        for (int i = 0; i < C.size; i++) {
            System.out.print(C.get(i)+" ");
        }
    }
}
