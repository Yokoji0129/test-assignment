public class Strucout {
    public static void main(String[] args) {
        int[][] scores = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 }
        };

        char[][] hits = {
                { 'o', 'x', 'o' },
                { 'o', 'o', 'x' },
                { 'o', 'x', 'o' },
                { 'x', 'x', 'x' }
        };

        strucout(scores, hits);
    }

    public static void strucout(int[][] scores, char[][] hits) {
        int totalScore = 0;

        for(int i = 0; i < scores.length; i++){
            for(int j = 0; j < scores[i].length; j++){
                //''はchar型""はString型
                if(hits[i][j] == 'o'){
                    totalScore += scores[i][j];
                }
            }
        }
        System.out.println(totalScore);
    }
}
