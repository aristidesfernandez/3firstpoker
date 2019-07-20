import java.util.Random;
import java.util.Scanner;
import org.junit.jupiter.api.DisplayName;


public class Poker {
    
    
    public static void main(String[] args) {
        
        Scanner entradaEscaner = new Scanner(System.in);
        //J=11;Q=12;K=13;A=14;
        //juego 1
        int negro[][] = {{10,'h'},{10,'h'},{10,'h'},{9,'h'},{14,'h'}};
        int blanco[][] = {{10,'s'},{10,'h'},{4,'h'},{10,'d'},{10,'c'}};
        
        
        //imprime negro
         int g;
        System.out.print("negro: ");
        for(int jn=0;jn<=4;jn++){
            for(int in=0;in<=1;in++){
                
                g=negro[jn][in];
                if(g=='h'){
                    System.out.print("H");
                }else{
                if(g=='d'){
                    System.out.print("D");
                }else{
                  if(g=='c'){
                    System.out.print("C");
                  }else{
                      if(g=='s'){
                          System.out.print("S");
                      }else{
                          if(g==11){
                          System.out.print("J");
                      }else{
                              if(g==12){
                          System.out.print("Q");
                      }else{
                                  if(g==13){
                          System.out.print("K");
                      }else{
                                      if(g==14){
                          System.out.print("A");
                      }else{
                                    System.out.print(g);       
                                      }
                                  }
                              }
                              
                          }
                          
                         //System.out.print(g); 
                      }
                  }
                  
                }
               
            }
            
        }
            if(jn<=3){
            System.out.print("-"); 
            } 
             
        }
        System.out.println(""); 
        //imprime negro
         int gb;
        System.out.print("blanco: ");
        for(int jb=0;jb<=4;jb++){
            for(int ib=0;ib<=1;ib++){
                
                gb=blanco[jb][ib];
                if(gb=='h'){
                    System.out.print("H");
                }else{
                if(gb=='d'){
                    System.out.print("D");
                }else{
                  if(gb=='c'){
                    System.out.print("C");
                  }else{
                      if(gb=='s'){
                          System.out.print("S");
                      }else{
                          if(gb==11){
                          System.out.print("J");
                      }else{
                              if(gb==12){
                          System.out.print("Q");
                      }else{
                                  if(gb==13){
                          System.out.print("K");
                      }else{
                                      if(gb==14){
                          System.out.print("A");
                      }else{
                                    System.out.print(gb);       
                                      }
                                  }
                              }
                              
                          }
                          
                         //System.out.print(g); 
                      }
                  }
                  
                }
               
            }
            
        }
            if(jb<=3){
            System.out.print("-"); 
            }
        }
        System.out.println(""); 
        //escalera real
        tiposdemanos obj= new tiposdemanos();
        comparar ob= new comparar();
        int n=obj.escalerareal(negro);
        int m=obj.escalerareal(blanco);
        String p=ob.compescalerareal(n, m);
        
        if (p=="no"){
            int nec=obj.escaleradecolor(negro);
            int mec=obj.escaleradecolor(blanco);
            int f=0;
            int y=0;
            String k=ob.compescaleradecolor(nec, mec);
            if(k=="no"){
                int np=obj.poker(negro);
                int mp=obj.poker(blanco);
                String l=ob.comppoker(np, mp);
                System.out.print(l);
            }else{
            if (k=="e"){
                for(int j = 0; j <= 4 ; j = j + 1){
            int cc=negro[j][0];
            if (f<=cc){
                f=cc;
            }
                }
                for(int i = 0; i <= 4 ; i = i + 1){
            int ccb=blanco[i][0];
            if (y<=ccb){
                y=ccb;
            }
        }
                if(f==y){
                    System.out.print("empate");
                }else{
                    if(f<y){
                        System.out.print("gana blanco con escalera de color");
                    }
                    if(f>y){
                        System.out.print("gana negro con escalera de color");
                    }
                }
            }else{
            System.out.print(k);
            } 
        }
        }else{
            System.out.print(p);
        }
    }
}


    

