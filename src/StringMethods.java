public class StringMethods {

    public static void main(String[] args) {

        System.out.println(System.getProperty("user.dir"));
        String a = "Testing Java Selenium";
        System.out.println(a.length());
        System.out.println(a.substring(2));
        System.out.println(a.substring(8,12));
        System.out.println(a.replaceAll("t", "a"));
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.charAt(0));
        System.out.println(a.startsWith("Testing"));
        System.out.println(a.replace("Testing", "Automation Testing"));
    }
}
