package sortofenemy;
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


    
}
