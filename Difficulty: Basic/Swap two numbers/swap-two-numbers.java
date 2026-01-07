class Solution {
    static List<Integer> get(int a, int b) {
        // code here
        int temp = a;
         a= b;
         b= temp;
         
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);

        return list;
    }
}