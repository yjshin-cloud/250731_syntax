package step3;

import java.util.Scanner;
import java.util.Random;

public class PokemonBattleGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 플레이어와 상대 포켓몬 설정
        String playerPokemon = "피카츄";
        String enemyPokemon = "이상해씨";

        int playerHP = 100;
        int enemyHP = 100;

        System.out.println("포켓몬 배틀 시작!");
        System.out.println(playerPokemon + " VS " + enemyPokemon);
        System.out.println();

        // 게임 루프
        while (playerHP > 0 && enemyHP > 0) {
            System.out.println("당신의 포켓몬: " + playerPokemon + " (HP: " + playerHP + ")");
            System.out.println("상대 포켓몬: " + enemyPokemon + " (HP: " + enemyHP + ")");
            System.out.println("공격을 선택하세요:");
            System.out.println("1. 전기쇼크 (10~20)");
            System.out.println("2. 백만볼트 (15~25)");
            System.out.print("입력 (1 또는 2): ");

            int choice = scanner.nextInt();
            int damage = 0;

            if (choice == 1) {
                damage = 10 + random.nextInt(11); // 10~20
                System.out.println("피카츄의 전기쇼크! " + damage + "의 데미지를 입혔습니다!");
            } else if (choice == 2) {
                damage = 15 + random.nextInt(11); // 15~25
                System.out.println("피카츄의 백만볼트! " + damage + "의 데미지를 입혔습니다!");
            } else {
                System.out.println("잘못된 입력입니다! 턴을 넘깁니다!");
                damage = 0;
            }

            enemyHP -= damage;
            if (enemyHP <= 0) {
                System.out.println("\n" + enemyPokemon + "이(가) 쓰러졌습니다! 승리했습니다!");
                break;
            }

            // 상대 포켓몬의 공격
            int enemyDamage = 10 + random.nextInt(11); // 10~20
            System.out.println(enemyPokemon + "의 덩쿨채찍! " + enemyDamage + "의 데미지를 입었습니다!");
            playerHP -= enemyDamage;

            if (playerHP <= 0) {
                System.out.println("\n" + playerPokemon + "이(가) 쓰러졌습니다... 패배했습니다.");
                break;
            }

            System.out.println("\n------------------------\n");
        }

        scanner.close();
    }
}
