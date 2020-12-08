public class CalculateAngleThree {
    public int angleThree(int angleOne,int angleTwo){
        int thirdAngle = 180-(  angleOne +  angleTwo);
        //
        return thirdAngle;
    }

    public static void main(String[] args) {
        CalculateAngleThree cat = new CalculateAngleThree();
        int thirdAngle = cat.angleThree(20,40);
        System.out.println("thirdAngle =" + thirdAngle);

    }



}
