public class Player {
    public String name;
    public int hp;
    public String[] defeated = new String[5];
    public int count=0;
    public Player(String name,int hp){
        this.name=name;
        this.hp=hp;
        System.out.println(name+" joined the game");
        System.out.println("HP: "+hp);
    }
    public Player(String name){
        this.name=name;
        this.hp=100;
        System.out.println(name+" joined the game");
        System.out.println("HP: "+hp);
    }
    public void viewInfo(){
        System.out.println("Player Name: "+name);
        System.out.println("Current HP: "+hp);
        if(count<defeated.length && count>0){
            System.out.println("Defeated: ");
            for(int i=0;i<count;i++){
                System.out.print(defeated[i]+", ");
            }
            System.out.println();
        }
    }
    public void defeatVillain(String villainName,int vhp){
        if(vhp>this.hp){
            System.out.println("failed to defeat "+villainName);
        }
        else{
            this.hp+=vhp;
            System.out.println("defeated "+villainName);
            defeated[count] = villainName;
            count++;
        }
    }
    public void defeatVillain(char boost,String villainName,int vhp){
        int temp=(int)boost-48;
        hp=hp*temp;
        System.out.println("HP with "+boost+"x boost "+hp);
        defeatVillain(villainName, vhp);
    }
    public void defeatVillain(Player Opponent){
        if(Opponent.hp>this.hp){
            System.out.println("failed to defeat "+Opponent.name);
        }
        else{
            this.hp+=Opponent.hp;
            System.out.println("defeated "+Opponent.name);
            defeated[count] = Opponent.name;
            count++;
        }
    }
}
