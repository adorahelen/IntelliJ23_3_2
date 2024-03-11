/*
객체지향의 주요 개념과 특징
 1. 객체
 2. 클래스
 3. 인스턴스
public class Circle { // 클래스, 즉 하나의 구조체를 설정
    public int radius;
    public String name; // 필드라고 부르지만 결국 변수

    public Circle() {
    public double getArea() {
        return 3.14*radius*radius;
    } // 메소드라고 부르지만 결국 함수
} // 클래스라는 구조체 안에 여러 필수와 메소드를 정의

// 생성자 == 클래스 이름과 동일한 메소드(함수)
// 객체가 생성될 때 자동으로 호출된다.

4. 모듈 개념 ( 소프트웨어 공학 하위설계 )
Package 란 서로 관련 있는 클래스나( class )
    인터페이스의 컴파일된 클래스(.class)file들을 한 곳에 묶어 놓은 것;
    * 패키지 == 디렉터리 (관련된 클래스 파일들이 내재된)
Module 란 패키지들을 묶은 단위

: java(java.base)모듈(폴더) > util(java.util)패키지(폴더) > Scanner.class(파일)
ex: import java.util.Scanner;

 */
public class adadas { // 자바 class 이름과 .java 동일해야함 (Main )
    public int radius;
    public String name;

    public adadas() { // 생성자 메소드(함수) == 정의와 동시에 호출
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }


    public static void main(String[] args) {
        adadas pizza;
        pizza = new adadas();

        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();

        System.out.println("원의 면적wwwww: " + area);
    }

}