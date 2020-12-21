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
		
		int user[][] = e.makeArray(1,parameter_size);
		e.printMatrix(user,1,parameter_size);	
	}
}