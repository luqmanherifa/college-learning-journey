/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_pduts2;

/**
 *
 * @author Kyrin
 */
public class Dunia3_PDUTS2 {

    
    int stack[] = new int[10];
   
    public void push(int value){
        if(stack[0]==0){
            stack[0]=value;
        }else if(stack[1]==0){
            stack[1]=value;
        }else if(stack[2]==0){
            stack[2]=value;
        }else if(stack[3]==0){
            stack[3]=value;
        }else if(stack[4]==0){
            stack[4]=value;
        }else if(stack[5]==0){
            stack[5]=value;
        }else if(stack[6]==0){
            stack[6]=value;
        }else if(stack[7]==0){
            stack[7]=value;
        }else if(stack[8]==0){
            stack[8]=value;
        }else if(stack[9]==0){
            stack[9]=value;
        }else{
            penuh();
        }
    }
    
    public void penuh(){
        System.out.println("Stack Penuh!");
    }
    
    public void pop(){
        if(stack[5]!=0){
            stack[5]=0;
        } else if(stack[4]!=0){
            stack[4]=0;
        } else if(stack[3]!=0){
            stack[3]=0;
        } else if(stack[2]!=0){
            stack[2]=0;
        } else if(stack[1]!=0){
            stack[1]=0;
        } else if(stack[0]!=0){
            stack[0]=0;
        }
        else{
            kosong();
        }
    }
    public void kosong(){
        System.out.println("Stack Kosong!");
    }
    
    public void find(int i){
	int a = 0;
	boolean hasil = true;
	while(a < 0){
            if(i == stack[a]){
		hasil = true;
		break;
            }
                a++;
	}
            if(hasil){
		System.out.println("Nilai "+i+" ditemukan!");
		} else {
                System.out.println("Antrian"+"tidak ada!");
		}		
    }
    
    public void print(){
        for(int i=0; i<stack.length; i++){
            if(stack[i]!=0){
            System.out.println(stack[i]+" ");
            }
        }
    }
    
    public static void main(String[] args) {
        Dunia3_PDUTS2 dn2 = new Dunia3_PDUTS2();
        System.out.println("----------");
        System.out.println("DATA");
        System.out.println("----------");
        dn2.push(10);
        dn2.push(15);
        dn2.push(4);
        dn2.push(2);
        dn2.push(3);
        dn2.push(7);
        dn2.push(88);
        dn2.push(54);
        dn2.print();
        
        System.out.println("----------");
        System.out.println("KOSONG?");
        System.out.println("----------");
        dn2.kosong();
        
        System.out.println("----------");
        System.out.println("PUSH");
        System.out.println("----------");
        dn2.push(11);
        dn2.push(14);
        dn2.print();
        
        System.out.println("----------");
        System.out.println("POP '7'");
        System.out.println("----------");
        dn2.pop();
        
        System.out.println("----------");
        System.out.println("FIND '15'");
        System.out.println("----------");
        dn2.find(15);
        
        System.out.println("----------");
        System.out.println("PRINT DATA");
        System.out.println("----------");
        dn2.print();
    }
}