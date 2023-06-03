public class John implements CGPA{
    static double sum=0.0;
    John(double[] mark){
        for(int i=0;i<4;i++){
        sum+=mark[i];
        }
    }
    public double getCGPA(){
        return sum/4.0;
    }
}
