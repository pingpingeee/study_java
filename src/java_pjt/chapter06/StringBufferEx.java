package java_pjt.chapter06;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This");
        System.out.println(sb);

//        append() => 문자열을 연결(추가되면서 수정됨)
        sb.append(" is pencil");
        System.out.println(sb);

//        insert() => 해당 인덱스에 문자열 삽입
        sb.insert(7, " my");
        System.out.println(sb);

//        replace() => 시작인덱스, 끝인덱스, 대체문자열
        sb.replace(8, 10, "your");
        System.out.println(sb);

//        delete() => 문자열 삭제
        sb.delete(8, 13);
        System.out.println(sb);

//        setLength() => 문자열 길이 수정
        sb.setLength(4);
        System.out.println(sb);
    }
}
