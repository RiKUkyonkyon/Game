import java.util.*;
import static constants.Constants.*;
import enemy.Enemy;

class Game{
	public static void main(String []args){

		System.out.println();

		Enemy e = new Enemy();

		e.enemyName();



		Scanner scan=new Scanner(System.in);
	
		/*ここから導入*/
		System.out.println("\nランダム＆ドラゴンズの世界にようこそ！");
		
		System.out.print("あなたの名前は何ですか？\t");
		String userName=scan.next();
		System.out.println("\n"+userName+"さん\tこんにちは");
		System.out.println("あなたのパラメータは以下のようになります。\n");
		/*ここまで導入*/
	
		
		/*
		int[] parametersUser={hitpoint,attack,defence,magic_attack,magic_defence};
		*/
		for(int i=0;i<=4;i++){
			// Random random=new Random();
			/*
			parametersUser[i] = random.nextInt(10);
			*/
		}
		/*
		System.out.println("\n体力は"  + (parametersUser[hitpoint_index]+1));
		System.out.println("攻撃力は"  + (parametersUser[attack_index]+1));
		System.out.println("防御力は"  +( parametersUser[defence]+1));
		System.out.println("特攻は"  + (parametersUser[magic_attack]+1));
		System.out.println("特防は"  + (parametersUser[magic_defence]+1));
		/*終わり*/
		
		
		int enemy[][] = e.makeArray(enemy_size, parameter_size); //敵の情報を取得
		e.printMatrix(enemy, enemy_size, parameter_size); //敵の情報を仮に表示
		
		System.out.print("\n");
		
<<<<<<< HEAD
		int user[][] = makeArray(1,parameter_size);
		printMatrix(user,1,parameter_size);

		

		
	}

	//ここまでがmainメソッド

	/*
	配列をランダムに初期化するメソッド
	引数１：行数
	引数２：列数
	戻り値：int型2次元配列
	*/
	static int[][] makeArray(int row,int column){
		int rand_min=30;
		int rand_max = 50;
		int[][] enemy=new int[row][column];
		/*列が敵の名前になります。
		行がそれぞれのパラメーターになります。*/
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				Random randomEnemy=new Random();
				enemy[i][j]=rand_min+randomEnemy.nextInt(rand_max-rand_min);
			}
		}

		return enemy;
=======
		int user[][] = e.makeArray(1,parameter_size);
		e.printMatrix(user,1,parameter_size);	
>>>>>>> d1e13b960dbff31809424e3fc4ddcc71039f7f82
	}
}