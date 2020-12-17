import java.util.*;

class Game{
	public static void main(String []args){

		// 定義
		int enemy_size = 5;
		int parametar_size = 5;


		Scanner scan=new Scanner(System.in);
	
		/*ここから導入*/
		System.out.println("\nランダム＆ドラゴンズの世界にようこそ！");
		
		System.out.print("あなたの名前は何ですか？\t");
		String userName=scan.next();
		System.out.println("\n"+userName+"さん\tこんにちは");
		System.out.println("あなたのパラメータは以下のようになります。\n");
		/*ここまで導入*/
	
		/*パラメータ生成*/
		int hitpoint=0;
		int attack=1;
		int defence=2;
		int magicattack=3;
		int magicdefence=4;
		
		int[] parametersUser={hitpoint,attack,defence,magicattack,magicdefence};
		
		for(int i=0;i<=4;i++){
			Random random=new Random();
			
			parametersUser[i] = random.nextInt(10);
			
		}
		System.out.println("\n体力は"  + (parametersUser[hitpoint]+1));
		System.out.println("攻撃力は"  + (parametersUser[attack]+1));
		System.out.println("防御力は"  +( parametersUser[defence]+1));
		System.out.println("特攻は"  + (parametersUser[magicattack]+1));
		System.out.println("特防は"  + (parametersUser[magicdefence]+1));
		/*終わり*/
		
		int riku=0,kyon=1,hibiki=2,karen=3,nozomi=4;
		int enemy[][] = makeArray(enemy_size, parametar_size); //敵の情報を取得
		printMatrix(enemy, enemy_size, parametar_size); //敵の情報を仮に表示
		
		
	}


	/*
	配列をランダムに初期化するメソッド
	引数１：行数
	引数２：列数
	戻り値：2次正方行列
	*/
	static int[][] makeArray(int row,int column){

		int[][] enemy=new int[row][column];
		/*列が敵の名前になります。
		行がそれぞれのパラメーターになります。*/
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				Random randomEnemy=new Random();
				enemy[i][j]=randomEnemy.nextInt(10);
			}
		}

		return enemy;
	}

	/*
	(row)行(column)列の配列を行列で表示するメソッド
	引数１：int型配列
	引数２：行数
	引数３：列数
	戻り値：なし
	*/
	static void printMatrix(int[][] array, int row,int column){
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print(array[i][j]);
			}
			System.out.println("");
		}
	}
}