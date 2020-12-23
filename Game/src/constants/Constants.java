package constants;

public class Constants {
    private Constants(){};

	//定数
		//　敵の情報に対する配列のindex番号
        public static int hitpoint_index=0;
		public static int attack_index=1;
		public static int defence_index=2;
		public static int magic_attack_index=3;
		public static int magic_defence_index=4;
		public static int speed_index = 5;
	
		// 敵の種類に対する配列のindex番号
		public static int riku_index=0;
		public static int kyon_index=1;
		public static int hibiki_index=2;
		public static int karen_index=3;
		public static int nozomi_index=4;
		

		public static int enemy_size = 5; // 敵の種類
		public static int parameter_size = 6; //パラメータの数

		public static int enemy_rand_min=30; // 敵のパラメータの最小値
		public static int enemy_rand_max = 50; // 敵のパラメータの最大値
}

