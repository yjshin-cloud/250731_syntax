package step2;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
// ↓ import 추가 20250731 19:15
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class GemmiChat {

    // code add 20250731 19:15
    // API 키를 프로젝트 루트의 config.properties에서 로드하는 메서드
    private static String loadApiKey() {
        Properties properties = new Properties();

        // 프로젝트 루트의 config.properties 파일 경로
        String configFile = "config.properties";

        try (FileInputStream input = new FileInputStream(configFile)) {
            properties.load(input);
            String apiKey = properties.getProperty("gemini.api.key");

            if (apiKey == null || apiKey.trim().isEmpty() || apiKey.equals("여기에_실제_API_키를_입력하세요")) {
                throw new RuntimeException("API 키가 config.properties 파일에 올바르게 설정되지 않았습니다.");
            }

            return apiKey;

        } catch (IOException e) {
            throw new RuntimeException("config.properties 파일을 찾을 수 없습니다. 프로젝트 루트에 파일을 생성해주세요.\n" +
                    "오류 내용: " + e.getMessage());
        }
    }



    // main
    // 입출력
    // 변수, 타입
    public static void main(String[] args) {
        // 입력 : 질문을 받아서
        Scanner sc = new Scanner(System.in); // 터미널을 통한 입력
        System.out.print("질문을 입력해주세요 \uD83D\uDE3B: ");
        String question = sc.nextLine();
        System.out.println("당신의 질문은 [" + question + "]입니다.");
        // Gemini와 통신하는 로직은요? -> 저한테 받아서 해야죠 뭐...

        // Gemini와 통신하는 로직은요?
        // API_KEY
        // https://aistudio.google.com/apikey > 동의
        // API 키 만들기
        // 예시 : *****************
        HttpClient client = HttpClient.newHttpClient(); // 요청을 보내주는 친구
        String GEMINI_API_KEY = loadApiKey(); // code edit 20250731 19:15
        // 이건 절대 푸시하면 안된다 (open 되면 안된다... 이거 open하면 구글이 알아서 차단해줌)
        String rule = "100자 이내, 간결하게, 답변만 출력.";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://generativelanguage.googleapis.com/v1beta/models/gemini-2.0-flash:generateContent"))
                .headers("Content-Type", "application/json",
                        "X-goog-api-key", GEMINI_API_KEY)
                .POST(HttpRequest.BodyPublishers.ofString(
                        // """ : Text Block 문법
                        """
                            {
                                "contents": [
                                  {
                                    "parts": [
                                      {
                                        "text": "%s %s"
                                      }
                                    ]
                                  }
                                ]
                              }
                            """.formatted(question, rule) // (1) ✅ 입력할 때 가이드 프롬프트
                ))
                .build(); // 요청 자체
        // (2) ✅ 출력할 때 text만 추출
        String result = null;
        try {
            // 요청으로 받은 응답
            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());
//            System.out.println(response.body());
            result = response.body();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        // 출력 : Gemini
        // \ : "는 문자열을 나타내니까 문자열 내부에서 써주려면 \"로 나타내야함.
        result = result
                // 정규표현식
                .split("\"text\": \"")[1] // 쪼개주는 것
                .split("}")[0]
                .replace("\\n\"", "") // 바꿔주는 것
                .trim() // 앞뒤 공백 삭제
        ;
        // 0, 1, 2 ... 쪼개져있는 것. // 0 'text' 앞에 있는 것. 1 뒤에 있는 것.
        System.out.println("AI의 답변은 [" + result + "] 입니다.");
    }
}
