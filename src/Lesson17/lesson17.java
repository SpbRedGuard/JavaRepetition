package Lesson17;

public class lesson17 {

    /* Создайте класс, в котором создайте метод ravenstvo.
Инпут параметрами которого будут 2 объекта класса StringBuilder.
Метод должен возвращать true, если значение объектов совпадают,
false если не совпадают.
    */

    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        boolean result = true;
        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        }else{
                result = false;
            }
            return result;
        }
    }
class Lesson17Test {
    public static void main(String[] args) {
        StringBuilder sb3 = new StringBuilder("hello");
        StringBuilder sb4 = new StringBuilder("hello");
        StringBuilder sb5 = new StringBuilder("Hello");
        boolean a = lesson17.ravenstvo(sb4, sb5);
        System.out.println(a);
        //System.out.println(lesson17.ravenstvo(sb4,sb5));
        //System.out.println(lesson17.ravenstvo(new StringBuilder(""), new StringBuilder("")));
        //System.out.println(lesson17.ravenstvo(new StringBuilder(), new StringBuilder()));

    }
}