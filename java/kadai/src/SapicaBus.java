public class SapicaBus {
    public static void main(String[] args) {
        int cardBalance = 2000; //カード残高
        int[] fares = { 300, 500, 300, 100, 100 }; //運賃

        sapicaBus(cardBalance, fares);
    }

    public static void sapicaBus(int cardBalance, int[] fares) {
        int balance = cardBalance; //残高
        int points = 0; //ポイント

        System.out.println("最初のカード残高: " + balance + "円");

        for (int i = 0; i < fares.length; i++) {
            int fare = fares[i];
            if (points >= fare) {
                //ポイントが運賃以上の場合ポイントを運賃分引く
                points -= fare;
                System.out.println((i + 1) + "回目降車時、運賃" + fare + "円。カード残高: " + balance + "円 ポイント: " + points);
            } else {
                //ポイントが足りない場合
                balance -= fare; //カード残高から運賃を引く
                points += Math.floor(fare * 0.1); //運賃の10%をポイントとして追加
                System.out.println((i + 1) + "回目降車時、運賃" + fare + "円。カード残高: " + balance + "円 ポイント: " + points);
            }
        }
    }
}