/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author romar
 */
public class comparar {
    public String compescalerareal(int a,int b){
         String t = null;
         
         if(a==5&&b==5){
             t="no";
         }
           if(a!=5&&b!=5){  
             t="empate";
         }
           if (a==5&&b!=5){
               if(b==1){
                   t="gana blanco con escalera real de espada";
               }
               if(b==2){
                   t="gana blanco con escalera real de corazones";
               }
               if(b==3){
                   t="gana blanco con escalera real de diamantes";
               }
               if(b==4){
                   t="gana blanco con escalera real de trebol";
               }
               
           }
           if (b==5&&a!=5){
               if(a==1){
                   t="gana negro con escalera real de espada";
               }
               if(a==2){
                   t="gana negro con escalera real de corazones";
               }
               if(a==3){
                   t="gana negro con escalera real de diamantes";
               }
               if(a==4){
                   t="gana negro con escalera real de trebol";
               }
               
           }
        
         
    
        
        return t;
    }
    
    public String comppoker(int a,int b){
        String t=null;
        if(a==b){
            t="empate con poker"+a;
        }else{
            if(b<a){
                t="gana negro con poker "+a;
            }
            if(a<b){
                t="gana blanco con poker"+b;
            }
        }
        return t;
    }
    
    public String compescaleradecolor(int a,int b){
         String t = null;
         
         if(a==5&&b==5){
             t="no";
         }
           if(a!=5&&b!=5){
               
             t="e";
         }
           if (a==5&&b!=5){
               if(b==1){
                   t="gana blanco con escalera de espada";
               }
               if(b==2){
                   t="gana blanco con escalera de corazones";
               }
               if(b==3){
                   t="gana blanco con escalera de diamantes";
               }
               if(b==4){
                   t="gana blanco con escalera de trebol";
               }
               
           }
           if (b==5&&a!=5){
               if(a==1){
                   t="gana negro con escalera de espada";
               }
               if(a==2){
                   
                   t="gana negro con escalera de corazones";
               }
               if(a==3){
                   t="gana negro con escalera de diamantes";
               }
               if(a==4){
                   t="gana negro con escalera de trebol";
               }
               
           }
        
         
    
        
        return t;
    }
}
