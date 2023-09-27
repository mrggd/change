package delete;

public class SqListClass<E> {
    final int initcapacity = 10;
    public E[] data;
    public int size;
    private int capacity;

    public SqListClass() {
        data = (E[]) new Object[initcapacity];
        capacity = initcapacity;
        size = 0;
    }

    private void updatecapacity(int newcapacity) {
        E[] newdata = (E[]) new Object[newcapacity];
        for (int i = 0; i < size; i++) {
            newdata[i] = data[i];
            capacity = newcapacity;
            data = newdata;
        }

    }

    public void Add(E e) {
        if (size == capacity)
            updatecapacity(2 * size);
        data[size] = e;
        size++;
    }

    public E get(int i) throws Exception {
        if (i <0 || i >size-1){
            throw new Exception("i不在有效范围内");
        }else {
            return (E)data[i];
        }
    }
    public void set(int i, E e) throws Exception {
        if (i < 0 || i > size - 1) {
            throw new Exception("i不在有效范围内");
        } else {
            data[i] = e;
        }
    }
     public void delete(SqListClass<Integer>list) throws Exception {
        int k = 0;
         for (int i= 0;i < list.size;i++) {
             if (list.get(i)>0) {
                 list.set(k, list.get(i));
                 k++;
             }
         }
         list.size = k;
     }
     public void change(SqListClass<Integer>list) throws Exception{
        int x = 2;
        int y = 4;
        int k = 0;
         for (int i = 0; i < list.size; i++) {
             if(list.get(i)>y || list.get(i)<x){
                 list.set(k, list.get(i));
                 k++;
             }
         }
       list.size = k;


    }
    public void Order(SqListClass<Integer>list) throws Exception {
        SqListClass<Integer> P = new SqListClass<>();
        SqListClass<Integer> O = new SqListClass<>();
        int k = 0;
        int l = 0;
        for (int i = 0; i < list.size; i++) {
            if (list.get(i)<0) {
                //O.set(k, list.get(i));
                O.Add(list.get(i));           //将负数存储到O数组
                k++;
            }
            if (list.get(i)>0) {
                //P.set(l, list.get(i));
                P.Add(list.get(i));           //将正数存储到P数组
                l++;
            }
        }
        int j = 0;
        int h = 0;
        for (int i = 0; i < O.size+P.size; i++) {        //再分别将两个数组的数替换到原数组中
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
       public void differenceset (SqListClass<Integer>list1,SqListClass<Integer>list2) throws Exception {

           for (int i = 0; i < list1.size; i++) {
               int d = 1;
               for (int j = 0; j < list2.size; j++) {
                   if (list1.get(i) == list2.get(j)) {
                       d = 0;
                       break;
                   }
               }
               if (d == 1) {
                   int g = 0;
                   SqListClass<Integer> G = new SqListClass<>();
                   G.Add(list1.get(i));
                   System.out.print(G.get(g)+" ");

                   }
           }



       }
}




