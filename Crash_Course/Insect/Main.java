public class Main {
    public static void main(String[] arg){
        Insect insect=new Insect(5,6);
        Spider spider=new Spider(13,true);
        Cricket cricket=new Cricket(2,1.25);

        insect.crawl();
        insect.says();

        spider.crawl();
        spider.says();

        cricket.says();
        cricket.jump();
        cricket.crawl();

        if(spider instanceof Insect && spider instanceof Spider)
            System.out.println("Spider is Sub of Insect");

    }
}
