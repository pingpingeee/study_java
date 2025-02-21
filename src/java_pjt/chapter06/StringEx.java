package java_pjt.chapter06;

public class StringEx {
    public static void main(String[] args) {
        String str1 = new String(" C#"); // heap메모리에 저장
        String str2 = new String(", C++");

//        length() => 문자열 길이
        System.out.println(str1.length()); // 스페이스포함된 길이 3
//        contains() => 문자열 포함여부
        System.out.println(str1.contains("#")); // true
        System.out.println(str1.contains("*")); // false

//        concat() => 문자열 연결
        str1 = str1.concat(str2);
        System.out.println(str1);

//        trim() => 앞, 뒤 공백 제거
        str1 = str1.trim();
        System.out.println(str1);

//        replace() => 문자열 대체
        str1 = str1.replace("C#", "Java");
        System.out.println(str1);

//        split() => 문자열을 분리
        String[] strArr = str1.split(", ");
        for (int i = 0; i < strArr.length; i++) System.out.println("분리된 문자열 " + i + " : " + strArr[i]);

//        substring() => 인덱스 값으로 시작하는 문자열
        str1 = str1.substring(5);
        System.out.println(str1); // Java, C++ => C++부터 출력

//        charAt() => 인덱스에 해당하는 문자
        char c1 = str1.charAt(2);
        System.out.println(c1); // C++ => +
    }
}
