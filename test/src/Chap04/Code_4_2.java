package Chap04;
public class Code_4_2 {
    public static void main(String[] args) throws Exception {
        recursive(5);
    }

    /**
     * ## 재귀함수 템플릿 ##
     * 
     * // 베이스 케이스 1 + .. + N 을 계산하는 재귀함수라면 N=0 인 경우가 베이스 케이스임
     * // 베이스 케이스에서 반환하는 처리를 하지 않으면 무한재귀에 빠질 수 있음
     * 
     * (반환값형) func(인수) {
     *  if (베이스케이스) {
     *    return 베이스 케이스에 대응하는 값
     *  }
     * // 재귀 호출
     * func(다음인수);
     * return 응답; 
     * }
     */

    public static int recursive(int N) {
        System.out.println("func" + N + " 호출함");
        
        if (N == 0) {
            return 0;
        }
        int result = N + recursive(N - 1);

        System.out.println(N + " 까지의 합 = " + result);

        return result;
    }
}
