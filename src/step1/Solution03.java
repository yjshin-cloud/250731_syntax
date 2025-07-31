package step1;

import java.util.Scanner;

// 변수
public class Solution03 {
    public static void main(String[] args) {
        // 연산자 (Operator)
        // +, -, *, /, % => 산술연산자
//        System.out.println(1 + 1);
//        System.out.println(1 - 1);
//        System.out.println(1 * 1);
//        System.out.println(1 / 1);
//        System.out.println(1 % 1); // 나머지
//        System.out.println(10 / 3); // 3
//        System.out.println(10 / 3.0); // 3.333333
//        System.out.println(10 % 3); // 1
        // 숫자끼리는 이런게 성립...
//        String name = "사자";
//        System.out.println(name + 10);
//        // 한 쪽이 문자열이면, 나머지 쪽을 다 문자열화 시킨 다음에
//        // concatenate -> 연결. join...
//        // +는 문자열화 시켜서 합침, *는 없음.
//        System.out.println(1 + 2 * 3 + 4 / 5); // 1 + 6 + 0 // 7

        // 연산자들 간의 우선순위...

        // 대입/할당 연산자
//        int a; //선언. a라고 하는 이름에 int를 부여해서 변수로 쓰겠다.
//        a = 10; // a라고 하는 자리에 그 타입에 맞는 값을 집어 넣는 것 -> 할당, 대입.
//        int b = 10; // 초기화 (선언-할당) 한번에
//        // 이미 선언된 변수는 다시 선언될 수 없어요 (같은 scope 또는 block)
//        // '변'수 -> 변할 수 있음 -> 할당/대입을 통해 변할 수 있는 수
//        a = 100; // 변수는 재할당이 가능해요
//        // 최초에 선언된 변수에 할당시키거나, 초기화하거나, 재할당할 때 쓰는 연산자
//        // 대입/할당 연산자. -> 최초 선언, 초기화.
//        // +=., -=, *=, /=, %= ... 이런 복합할당/대입 연산자의 경우에는...
//        // 앞에 이미 할당, 초기화가 끝난 것
//        // c += 1; // c = c + 1;


//        System.out.println(a); // 100
//        a += 1; // 1씩 더하는 것 -> 대입 연산자는 ( ) 안에 못넣음
//        // 이건 대입 연산자가 섞이면 원칙으로는 못 넣는데...
//        System.out.println(a); // 101
//        a++; // 1을 더했슴다~ // 이 친구는 ( ) 안에 넣을 수 있음
//        System.out.println(a); // 102
//        System.out.println(a++); // 증감연산자 -> a라는 값이 호출되고 ++을 하겠다
//        System.out.println(++a); // 증감연산자 -> ++을 하고 a라는 값을 호출하겠다
//        System.out.println(a--); // 104인데 (103)
//        System.out.println(--a); // 102
        // ++, --는 파이썬에서 있다 없다? -> 없다
        // 흐름제어, 반복문


        // 비교 연산자, 관계 연산자
        // ==, !=, >, <, >=, <=
        // =이 원래는 같다인데 왜 =을 못써요?
        // 이미 대입연산자에 =이 있잖아요 (대입/할당이 비교/관계보다 더 중요해)
        // cf) 언어중에 =이 비교연산자인 언어가 있다 (R).

//        System.out.println(1 == 1); // true  (참)
//        System.out.println(1 == 2); // false (거짓)
//        // true, false, boolean. / bool
//        // Jeorge Bool -> 부울(불) 대수.
//        boolean condition = 10 == 10;
//        boolean condition2 = 10 > 5;
//        // 대부분 숫자를 비교함.
//        // 같다는 꼭 숫자일 필요가 있을까?
//        System.out.println(1 == 1);
//        System.out.println("1" == "1");
//        System.out.println("1" == new String("1"));
        // ex) 막국수집 -> 그 주소를 저장
//        String s1 = "1"; // "1"을 지칭하는 어떤 메모리상의 위치가 s1에 담겨 있음
//        // ex) 다음 막국수집 -> 그 직전 막국수를 주소 찾아준 것
//        String s2 = "1"; // 이미 쓴 String은 임시저장되어서 가져가 씀(주소가 같음)
//        // ex) 새로 검색해서 새로운 막국수집 주소
//        String s3 = new String("1"); // String -> 객체 -> 그 자체로 값을 비교할 수 없음.

        // 주소 // 강제로 new로 새로 만들면 -> 새로운 주소가 부여
//        System.out.println(s1 + " " + s2 + " " + s3);
//        System.out.println(s1 == s2);
//        System.out.println(s2 == s3);
//        // String은 그 자체로 == 동일 비교가 없음
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3)); // 들어 있는 값이 같아?
        // null safety 만큼 많이 실수하는 것 중 하나.

        // 비티는 생략함. (알고리즘 속도 개선할 거 아니면...)
        // 논리 연산자
        Scanner sc = new Scanner(System.in);
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//        System.out.println("n1 : " + n1 + "n2 : " + n2);
//        System.out.println("n1 > n2 : " + (n1 > n2)); // ( )를 사용하면 우선도 확보
//        System.out.println("n1 < n2 : " + (n1 > n2)); // ( )를 사용하면 우선도 확보

        // 19세 음주. 55세 연금.
//        System.out.print("당신의 나이는? ");
//        int age = sc.nextInt();
        // 19세 미만이라 음주도 안돼, 연금도 못 받아
        // 19세 이상이라 음주는 돼, 근데 연금은 못 받아
        // 55세 이상이라 음주도 돼, 연금도 받아

//        System.out.println("음주 no, 연금 no" + (age < 19));
//        System.out.println("음주 ok, 연금 no" + (age >= 19) + (age < 55));
//        System.out.println("음주 ok, 연금 no" + (age >= 19 && age < 55));
//        System.out.println("음주 ok, 연금 ok" + (age >= 55));
        // 15 : false / true
        // 20 : true / true
        // 60 : true / false

//        System.out.print("당신이 갖고 있는 돈은? : ");
//        int money = sc.nextInt();
        // 삼각김밥 1000원, 제로콜라 2000원
        // \(또는 \) -> | (shift)
//        System.out.println("삼각김밥 똔느 제로콜라 구매 가능" + (money >= 1000 || money >= 2000));

        // && || (단축연산자) -> &, | (비트연산자)
        // &&는 앞에 온 boolean이 false면 평가 종료하고 false로 리턴.
        // ||는 앞에 온 boolean이 true면 평가 종료하고 true로 리턴.
        // a() && b() : a()가 false면 b()가 실행이 안된다
        // a() || b() : a()가 true면 b()가 실행이 안된다 // 파이썬 and, or
        // !(not) -> true를  false로, false를 true로.

        // 아이디 검증 && 패스워드 검증 -> 로그인
        // 아이디 검증분터 실패하면, 패스워드 검증 관련된 작업을 생략.
        // true && true -> (true &&) true
        // false && true -> false // x
        // true || false -> true // x
        // false || false -> (false ||) false
//        System.out.println("++ --");
        int num = 0;
//        System.out.println(" (num++ == 0) && (num++ == 1) : "
//                + ((++num == 0) && (num++ == 1)));
//        System.out.println(num); // 1 -> (num++ == 1) 안 넘어감

        // 일부러 이렇게 하는 경우도 있음.
        // 위에 케이스에는 바로 연산자에서 비교하면서 작동하게 만들었으므로...

        boolean c1 = num++ == 0;
        boolean c2 = num++ == 1; // 연산을 시켜서 변수에 담았으므로 연산이 일어나는데
        System.out.println(c1 || c2);
        System.out.println(num);

    }
}
