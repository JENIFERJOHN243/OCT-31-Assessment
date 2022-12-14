package task;

public class KnightProbability {
	static int dx[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
    static int dy[] = { 2, 1, -1, -2, -2, -1, 1, 2 };

	public static void main(String[] args) {
		int N = 3;
        int K = 2;
        int row = 0;
        int col = 0;
        System.out.println(findProbability(row, col, K,N));
	}

	static boolean checkInside(int x, int y,int N)
    {
        return (x >= 0 && x < N && y >= 0 && y < N);
    }

    static double findProbability(int start_x, int start_y, int noOfMoves,int N)
    {
        double dp1[][][] = new double[N][N][noOfMoves + 1];
        for (int i = 0; i < N; ++i)
            for (int j = 0; j < N; ++j)
                dp1[i][j][0] = 1;
        for (int s = 1; s <= noOfMoves; ++s) {
            for (int x = 0; x < N; ++x) {
                for (int y = 0; y < N; ++y) {
                   double prob = 0.0;
                    for (int i = 0; i < 8; ++i) {
                        int nx = x + dx[i];
                        int ny = y + dy[i];

                        if (checkInside(nx, ny,N))
                            prob += dp1[nx][ny][s - 1] / 8.0;
                    }
                    dp1[x][y][s] = prob;
                }
            }
        }
        return dp1[start_x][start_y][noOfMoves];
    }	
}
