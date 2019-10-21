package by.epam.java.kazlova.task1;


public class Main {
    public static void main(String ars[]){
        City minsk=new City("Minsk");
        City homel=new City("Homel");
        City hrodna=new City("Hrodna");
        City brest=new City("Brest");

        Neighborhood minskiNei=new Neighborhood("Minski", 100, minsk, new City[]{minsk});
        Neighborhood homelskiNei=new Neighborhood("Homelski", 120, homel, new City[]{homel});
        Neighborhood hrodzenskiNei=new Neighborhood("Hrodzenski", 109, hrodna, new City[]{hrodna});
        Neighborhood brestskiNei=new Neighborhood("Brestski", 95, brest, new City[]{brest});

        Region minskiReg=new Region("Minskaya",minsk, new Neighborhood[]{minskiNei});
        Region homelskiReg=new Region("Homelskaya", homel, new Neighborhood[]{homelskiNei});
        Region hrodzenskiReg=new Region("Hrodzenskaya", hrodna, new Neighborhood[]{hrodzenskiNei});
        Region brestskiReg=new Region("Briestskaya", brest, new Neighborhood[]{brestskiNei});

        State belarus=new State("Belarus", minsk, new Region[]{minskiReg, homelskiReg, hrodzenskiReg, brestskiReg});
        StateLogic belLog=new StateLogic();

        System.out.println(belarus.getName()+": "+belarus.getCapital().toString()+", number of regions - "+belarus.countRegions()+", square - "+
                belLog.countSquare(belarus)+", region centers - ");
         City[] centers=belLog.regionCenters(belarus);
         for(int i=0; i<centers.length; i++){
             System.out.println(centers[i].getName());
         }
    }
}
