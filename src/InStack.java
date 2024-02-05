import javafx.scene.chart.ScatterChart;

// 클래스 정의 & 생성자 사용 -> 각 메소드(함수) 정의,[하나의 파일] | 테스트 프로그램[두번쨰 파일]

import java.util.Scanner;

public class IntStack {

    private int [] stk; // 스택용 배열
    private int capacity;
    private int ptr; // 스택 포인터

    // 실행시 예외 : 스택이 비어있는 경우
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() { }
    }

    // Exception : Stack is full
    public class OverFloawIntstackException extends RuntimeException {
        public OverFloawIntstackException() { }
    }

}//스택 구조체 == 클래스 정의

// Creation 생성자를 통한 생성?
public IntStack(int maxlen) {
    ptr = 0;
    capacity = maxlen;
    try {
        stk = new int [capacity]; // 스택 본체용 배열 생성
    } catch (OutOfMemoryError e) { // 생성할 수 없으면 메모리 에러
        capacity = 0;
    }

}

// + 푸쉬 메서드, 팝 메서드, 피크 메서드, 클리어 메서드, 검색 메서드(index OF), getCapacity 메서드, 사이즈, Full, dump==show메서드

// IntStackTester.java
import java.util.Scanner;

class IntStackTester {
    pubic static void main (String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64); // 최고 64개



        while (true) {
            System.out.println();
            System.out.println("Current Data : %d / %d\n", s.size(), s.getCapacity());
            System.out.println("1번 푸쉬 2번 피크 3번 덤프 4번 팝  0종료");

            int menu = stdIn.nextInt();
            if (menu == 0 ) break;

            int x;
            switch (menu) {
                case 1:
                    print
                            s.push
                            try catch;
                            break;
                case 2:
                    try {
                        s.pop
                                catch
                    }
                    break;


                case 3:
                    try s.peek();
                    catch;
                    break;

                case 4:
                    s.dump() == show all
                        break;
            }
        }
    }
}