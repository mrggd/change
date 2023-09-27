package second;

import delete.SqListClass;

public class order {
    public void Order(SqListClass<Integer>list) throws Exception {
        SqListClass<Integer> P = new SqListClass<>();
        P.Add(0);
        P.Add(0);
        P.Add(0);
        P.Add(0);
        SqListClass<Integer> O = new SqListClass<>();
        O.Add(0);
        O.Add(0);
        O.Add(0);
        int k = 0;
        int l = 0;
        for (int i = 0; i < list.size; i++) {
            if (list.get(i)<0) {
                O.set(k, list.get(i));
                k++;
            }
            if (list.get(i)>0) {
                P.set(l, list.get(i));
                l++;
            }
        }
        int j = 0;
        int h = 0;
        for (int i = 0; i < O.size+P.size; i++) {
            if (i < O.size) {
                list.set(i, O.get(h));
                h++;
            }
            if (i >= O.size) {
                list.set(i, P.get(j));
                j++;
            }
        }
    }
}
