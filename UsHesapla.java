import java.util.Scanner;
public class UsHesapla {


    public static void main(String[] args) {
        int taban,us,temp=1;
        Scanner in=new Scanner(System.in);
        System.out.print("Tabani giriniz:");
        taban=in.nextInt();
        System.out.print("Ussu giriniz:");
        us=in.nextInt();
          for(int i=1;i<=us;i++)
          {temp*=taban;}
          if(us==0)
              System.out.print(taban+"^"+us+":"+1);
           else
              System.out.println(taban+"^"+us+":"+temp);
    }
}
