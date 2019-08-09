import java.util.*;
class Main{ 
    public  static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
     int a,b,c,cd=0;
     int ch[]=new int[10]; 
     a=sc.nextInt();
     b=sc.nextInt();
     c=sc.nextInt();
     int i,j,k,l,pin,large,el;
     String con="";
       while(a>0&&b>0&&c>0)
          { i=a%10;
            j=b%10;
            k=c%10;
            a=a/10;
            b=b/10;
            c=c/10;
            large=i>j?i:j;
            el=large>k?large:k;
            ch[cd]=el;
            cd++;
            l=mini(i,j,k);
            con=con+Integer.toString(l);
          }
     int r=large(ch);
     con=con+Integer.toString(r);
     int len=con.length();
     String con1="";
          for(int x=len-1;x>=0;x--)
           { con1=con1+con.charAt(x);
           }
    pin=Integer.parseInt(con1);
    System.out.print(pin);
}
public  static int mini(int x,int y,int z)
{ int w,s;
    w=x<y?x:y;
    s=w<z?w:z;
    return s;
}
public static int large(int arr[])
  { int x,y;
    x=arr[0]>arr[1]?arr[0]:arr[1];
    y=x>arr[2]?x:arr[2];
    return y;
  }
}


