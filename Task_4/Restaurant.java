import java.util.*;

class FoodRatings {

    HashMap<String,List<String>> item=new HashMap<String,List<String>>();
    HashMap<String,Integer> rate=new HashMap<String,Integer>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for(int i=0;i<foods.length;i++){
            if(item.containsKey(cuisines[i]))
                item.get(cuisines[i]).add(foods[i]);
            else{
                item.put(cuisines[i],new ArrayList<String>());
                item.get(cuisines[i]).add(foods[i]);
            }
            rate.put(foods[i],ratings[i]);
        }
    }
    
    public void changeRating(String food, int newRating) {
        rate.put(food,newRating);
    }
    
    public String highestRated(String cuisine) {
        int m=0;
        String res="";
        for(String i:item.get(cuisine))
            if(rate.get(i)>=m){
                if(rate.get(i)==m){
                    if(i.compareTo(res)<0)
                        res=i;
                }else{
                    m=rate.get(i);
                    res=i;
                }
            }
        return res;
    }
}

class Restaurant{
    public static void main(String[] arg){
        Scanner x=new Scanner(System.in);
        String[] food=new String[]{"cpctxzh","bryvgjqmj","wedqhqrmyc","ee","lafzximxh","lojzxfel","flhs"};
        String[] cuisines=new String[]{"wbhdgqphq","wbhdgqphq","mxxajogm","wbhdgqphq","wbhdgqphq","mxxajogm","mxxajogm"};
        int[] ratings=new int[]{15,5,7,16,16,10,13};
        FoodRatings fr=new FoodRatings(food,cuisines,ratings);
        fr.changeRating("lojzxfel",1);
        System.out.println(fr.highestRated("mxxajogm"));
        System.out.println(fr.highestRated("wbhdgqphq"));
        System.out.println(fr.highestRated("mxxajogm"));
    }
}