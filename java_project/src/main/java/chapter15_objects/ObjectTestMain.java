package chapter15_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
//        String strExample1 = "안녕하세요";
//        String strExample2 = new String("안녕하세요");
//
//        boolean result1 = (strExample1 == strExample2);
//        System.out.println(result1);    // false
//
//        boolean result2 = strExample1.equals(strExample2);
//        System.out.println(result2);

        ObjectTest objectTest1 = new ObjectTest("안근수", "부산광역시 연제구");
        objectTest1.displayInfo1();
        System.out.println(objectTest1.displayInfo2());
        System.out.println();

        ObjectTest objectTest2 = new ObjectTest("김태윤", "부산광역시 동래구");
        System.out.println("---- toString() ---- 검증 부분");
        System.out.println(objectTest2);
        // sout -> toString 메서드를 자동 호출하기 때문에 .toString 필요X


    }
}
