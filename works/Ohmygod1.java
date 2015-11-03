package works;
/**
 * Created by admin on 2015/10/29.
 */
class ClubMembers
{
  private String playersName[]={"lack","lack","lack","lack","lack","lack","lack","lack","lack","lack"};
    private boolean wills[]={false,false,false,false,false,false,false,false,false,false,};
     public void retire(int x)
     {
         wills[x]=true;
         for(int i=0;i<=9;i++)
         {
             if (wills[i]==true&&playersName[i]!="lack"){System.out.println(playersName[i] +"\0"+ "announce retire");playersName[i]="lack";}
         }
     }
  public void joinClub(String playerName,boolean wills)
  {
      int j=0;
      boolean pass=true;
      while (pass==true)
      {
          if (playersName[j]=="lack"){playersName[j]=playerName; System.out.println("welcome to join this club");pass=false;}
          else j++;
          this.wills[j]=wills;
          if (j==11) {System.out.println("It is so sorry that this club do not need new player");pass=false;}
  };
  }
 class OhmyGod1 extends ClubMembers {
    private String clubName;
    private String owner;
    private String level;

    public void changePlayer(String playerName1, String playerName2) {
        for (int x = 0; x <= 9; x++) {
            if (playersName[x] == playerName1) {
                playersName[x] = playerName2;
                playerName2 = playerName1;
                System.out.println("welcome" + playersName[x] + "join our club" + "we also feel bad for" + playerName2 + "'s leaving");
                break;
            }
        }
    }
    public  void getName(String clubName1,String owner1)
   {
       this.clubName=clubName1;
       this.owner=owner1;
       System.out.println(clubName+"\n"+owner);
   }
}


}