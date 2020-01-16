import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// 用于模拟54张扑克牌的洗牌发牌过程
public class Poker {

   static String[] types = {"carre","flower","Rheart","Bheart"};
   static String[] points = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
   static ArrayList<String> pokes = new ArrayList<String>();
   static ArrayList<String> player1 = new ArrayList<String>();
   static ArrayList<String> player2 = new ArrayList<String>();
   static ArrayList<String> player3 = new ArrayList<String>();
   static ArrayList<String> player4 = new ArrayList<String>();

   public static void makePokers(){
       for(String s:types){
           for(String p:points){
               pokes.add(s.concat(p));
           }
       }
       pokes.add("King");
       pokes.add("King");
       pokes.add("Queen");
       pokes.add("Queen");
       System.out.println("makePoker finished, we have "+pokes.size()+" poke carts." );
       Collections.shuffle(pokes);
   }

   public static void deliveryCarte(){
        for(int i=0;i<pokes.size();i++){
            if(i%4 == 0){
                player1.add(pokes.get(i));
            }else if(i%4 == 1){
                player2.add(pokes.get(i));
            }else if(i%4 == 2){
                player3.add(pokes.get(i));
            }else{
                player4.add(pokes.get(i));
            }
        }
   }

//    public void deliveryCarte(ArrayList<String> carte){
//        for(String s:player2){
//            System.out.println(s+",");
//        }
//    }

    public static void main(String[] args){
       System.out.println("Beginning....");
       makePokers();
       deliveryCarte();
       System.out.println("Player1's carte:");
       for(String s:player2){
           System.out.print(s+",");
       }
       System.out.println("");
       System.out.println("Player2's carte:");
       for(String s:player1){
           System.out.print(s+",");
       }
       System.out.println("");
       System.out.println("Player3's carte:");
       for(String s:player1){
           System.out.print(s+",");
       }
       System.out.println("");
       System.out.println("Player4's carte:");
       for(String s:player1){
           System.out.print(s+",");
       }
   }

}

