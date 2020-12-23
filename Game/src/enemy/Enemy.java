package enemy;
import java.util.*;

public class Enemy {

    public void enemyName(){
        Random kindOfEnemy=new Random();
        int x = kindOfEnemy.nextInt(4);
    
        if(x==0){
            System.out.println("りくが現れた！");
        }
        if(x==1){
            System.out.println("kyonnが現れた！");
        }
        if(x==2){
            System.out.println("hibikiが現れた！");
        }
        if(x==3){
            System.out.println("karenが現れた！");
        }
        if(x==4){
            System.out.println("nozomiが現れた！");
        }
    
    }

    /*
	(row)行(column)列の配列を行列で表示するメソッド
	引数１：int型配列
	引数２：行数
	引数３：列数
	戻り値：なし
	*/
	public void printMatrix(int[][] array, int row,int column) {
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}
		return;
    }
    
    /*
	行列をランダムに初期化するメソッド
	引数１：行数
	引数２：列数
	戻り値：int型2次元配列
	*/
	public int[][] makeMatrix(int row,int column,int rand_min,int rand_max){
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
	}
	
	public int[] makeArray(int size, int rand_min, int rand_max){
		int[] aray = 
	}
    /*　作成中
    static int calcDamage(int[][] array,int player[][] int enemy_number){
		array[enemy_number][hitpoint_index] = array[enemy_number][hitpoint_index] - array[][];

		return 0;
	} 
	*/
    
}
