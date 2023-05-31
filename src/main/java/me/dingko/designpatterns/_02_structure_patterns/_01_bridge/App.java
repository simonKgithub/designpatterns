package me.dingko.designpatterns._02_structure_patterns._01_bridge;

/**
 * 브릿지 패턴: 추상적인 것과 구체적인 것을 분리하여 연결하는 패턴
 *  - 하나의 계층 구조일 때 보다 각기 나누었을 때 독립적인 계층 구조로 발전시킬 수 있다.
 */
public class App {
    public static void main(String[] args) {
        Champion 갑옷_첫찌 = new 첫찌(new 갑옷(), new 점프공격());
        갑옷_첫찌.move();
        갑옷_첫찌.skill();

        Champion 풀떼기_첫찌 = new 첫찌(new 풀떼기(), new 점프공격());
        풀떼기_첫찌.move();
        풀떼기_첫찌.skill();
    }
}
