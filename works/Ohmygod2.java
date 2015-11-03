package works;
/**
 * Created by admin on 2015/10/29.
 */
class PlayerStates
{
    private String states[]={"good","good","good","good","good","good","good","good","good","good",};
    private boolean check=false;
    public void states(String state,int i,int j)
   {
       for (int x=j;x<=9;x++){states[i]="lack";}
       states[i]=state;
   }
   public void PassInS()
   {
       int sum=0;
       for(int i=0;i<=9;i++)
       {
           if (states[i]=="good") sum++;
       }
      if (sum>5) {System.out.println("we get the ticket of S6 ");check=true;}
   }
}
