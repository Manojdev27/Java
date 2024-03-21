public class ArrayList {
    public static void main(String[] args) {

        //ArrayList is also exactly operates like array but it is dynamically sized

        java.util.ArrayList<String> arrayList = new java.util.ArrayList<>();
        arrayList.add("Testing");
        arrayList.add("Java");
        arrayList.add("Selenium");

//        System.out.println(arrayList.get(0));
//        System.out.println(arrayList.get(1));
//        System.out.println(arrayList.get(2));

        for (int i=0; i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

    }
}
