/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author romar
 */
public class tiposdemanos {
    
    public int escalerareal(int a[][]){
        int m=0;
         int conts=0;
        int conth=0;
        int contd=0;
        int contc=0;
        int concc=0;
        
        
        
        for(int i = 0; i <= 4 ; i = i + 1){
            int cp=a[i][1];
            
            int cc=a[i][0];
            
            if(cc==10||cc==11||cc==12||cc==13||cc==14){
                concc=concc+1;
            }
            if (cp=='s'){
                conts=conts+1;
            }
            if (cp=='h'){
                conth=conth+1;
            }
            if (cp=='d'){
                contd=contd+1;
            }
            if (cp=='c'){
                contc=contc+1;
            }  
        }
        if (concc==5){
            if(conts==5){
                m=1;
            }
            if(conth==5){
                m=2;
            }
            if(contd==5){
                m=3;
            }
            if(contc==5){
                m=4;
            }
            if(conts!=5&&conth!=5&&contd!=5&&contc!=5){
                m=5;
            }
        }else{
            m=5;
        }
        return m;
    }
            
     public int escaleradecolor(int a[][]){
         int ec=0;
          int conts=0;
        int conth=0;
        int contd=0;
        int contc=0;
        int concc=0;
        int f=0;
        for(int j = 0; j <= 4 ; j = j + 1){
            int cc=a[j][0];
            if (f<=cc){
                f=cc;
            }
            
        }
        
        for(int i = 0; i <= 4 ; i = i + 1){
            int cp=a[i][1];
            int cc=a[i][0];
            
            if(cc==(f-1)||cc==(f-2)||cc==(f-3)||cc==(f-4)||cc==(f)){
                concc=concc+1;
            }
            if (cp=='s'){
                conts=conts+1;
            }
            if (cp=='h'){
                conth=conth+1;
            }
            if (cp=='d'){
                contd=contd+1;
            }
            if (cp=='c'){
                contc=contc+1;
            }
        }
        if (concc==5){
            if(conts==5){
                ec=1;
            }
            if(conth==5){
                ec=2;
            }
            if(contd==5){
                ec=3;
            }
            if(contc==5){
                ec=4;
            }
            if(conts!=5&&conth!=5&&contd!=5&&contc!=5){
                ec=5;
            }
        }else{
            ec=5;
        }
         
         
         return ec;
     }
     
     
     
     public int poker(int a[][]){
        int m =0;
        int cont=0;
        for (int i=0;i<=4;i++){
            for (int j=0;j<=4;j++){
                if((a[i][0])==(a[j][0])){
                    cont++;
                }
            }
            if (cont==4){
                
                m=a[i][0];
                return m;
                
            }else{
                cont=0;
            }
           
            
        }
   
        
     
        
        
        return m;
    }
     
}