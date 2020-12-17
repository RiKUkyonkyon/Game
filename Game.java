import java.util.*;

class Game{
	public static void main(String []args){
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
		
		int[][] enemy=new int[5][5];
		/*列が敵の名前になります。
		行がそれぞれのパラメーターになります。*/
		for(int i=0;i<=4;i++){
			for(int j=0;j<=4;j++){
				Random randomEnemy=new Random();
				enemy[i][j]=randomEnemy.nextInt(10);
			}
			
		}
		
		for(int i=0;i<=4;i++){
			System.out.print(enemy[0][i]);
		}
		
		

		
	}
}