package step1;

import java.util.Scanner;

// [접근제어자] [구현체종류] [이름] {}
///  **Java Doc** 마크다운 됨
public class Solution01 {
    // PascalCase - 영어로 작성되어 있는데 띄어쓰기 대신 모두
    // 대문자를 쓰는 형태의 작성법
    // CamelCase - (...) 첫 문자가 소문자인 경우
    // - 나머지 메서드나 변수명 등
    // Snake_case : 띄어쓰기를 (_)로 처리
    // SCREAMING_SNAKE_CASE : snake case인데 전부 대문자
    // kebab-case : 띄어쓰기를 (-)로 처리
    // 들어오는 길.
    // 자세한 자바 주석 설명 please (for 초심자)
    /**
     * <p>이것도 여러줄 ** <strong>Java Doc</strong>입니다</p> <-
     * 이건 마크다운 안됨
     * (하지만 태그가 된다;;;)
     * */
    public static void main(String[] args) {
        // 출력
        System.out.println("큰 따옴표로 묶인 것을 출력한다");
        System.out.println(123456);

        System.out.print("뭔 차이지?"); // 줄바꿈이 없다
        System.out.print("뭔 차이지?");
//      System.out.println("뭔 차이지?" + "\n");
//      System.out.println("뭔 차이지?\n");
//      \n -> escape 문자
        // 주석표시 -> 앞을 //를 붙이면 무시가 된다
        // ctrl + / (win), 또는 cmd + / (mac)
        // /*로 시작해서 */로 끝나는 경우 -> 여러 줄 주석
        /*
            안녕하세요
            저는 클라우드 엔지니어링을 좋아하는 사람입니다
            클라우드 엔지니어링 너무 좋다
         */


        System.out.println("뭔 차이지?"); // 알아서 줄바꿈을 해준다
        System.out.println("뭔 차이지?");

        // 입력 (Scanner)
        // 터미널이나 CLI 할 때 입력 받는 방식
        // -> 우리는 일반적으로 화면을 앱으로 받거나 웹으로 받아요
        Scanner scanner = new Scanner(System.in);
        // Scanner라는 클래스를 바탕으로 인스턴스를 생성하여,
        // scanner라는 변수에 주입하기 위해,
        // new라는 키워드를 통해 생성자를 불러오고,
        // System.in이라는 arguments를 통해 터미널에서
        // 텍스트 입력값을 받아오는 설정을 주입

        System.out.print("본인이 좋아하는 숫자를 입력해주세요 : ");
        int num = scanner.nextInt(); // 숫자 입력을 받겠다
        // 내가 어떤 값을 받아서 재사용을 하려면 이름을 적어서 저장해둬야한다 - 변수
        // 숫자 -> 입력을 하면 \n\ 남아있음
        // (엔터를 쳐서 줄바꿈으로 입력하니까...)
        scanner.nextLine();
        System.out.println("당신이 좋아하는 숫자는 " + num + "입니다!\uD83E\uDD23");

        System.out.print("본인이 좋아하는 아이돌을 입력해주세요 : ");
        // int idol = scanner.nextInt(); // 아이돌 입력을 받겠다
       //  String idol = scanner.next(); // 단어 한 개 입력 (문자 한 개 입력 ->\n을 무시함)
        String idol = scanner.nextLine(); // 한 줄 입력 (\n을 만날 때까지)
        // Java는 타입 추론이 없나? Java가 var(JDK 10)가 있음.
        // 입력 받는 방법에 따라 '타입'이라는게 바뀐다 -> 이 타입을 변수에 붙여줘야한다
        System.out.println("당신이 좋아하는 아이돌은 " + idol + "입니다!\uD83E\uDD23");

        scanner.close(); // 다 썼으니까 반환

    }
}
