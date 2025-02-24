package java_pjt.chapter07_generic;

//대문자 알파벳 T를 타입파라미터로 받은 제네릭
public class Box2<T> {
    //    타입파라미터를 t의 타입으로 사용
    private T t;

    //    타입파라미터를 메소드의 리턴타입으로 사용
    public T getT() {
        return t;
    }

    //    타입파라미터를 메소드의 매개변수 타입으로 사용
    public void setT(T t) {
        this.t = t;
    }
}
