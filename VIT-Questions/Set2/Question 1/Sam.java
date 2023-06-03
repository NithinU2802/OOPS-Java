class Sam implements CGPA{
    static double sum=0.0;
    Sam(double[] mark){
        for(int i=0;i<3;i++){
        sum+=mark[i];
        }
    }

    public double getCGPA(){
        return sum/4.0;
    }

}
