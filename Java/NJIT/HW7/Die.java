package NJIT.HW7;

public class Die {

   // attributes
   private int faceValue;

   // operations
   // defaul constructor ->
   // are the only types that don't require a return statement
   public Die() {
      faceValue = 2;
   }

   // non-default constructor
   public Die(int face) {
      faceValue = face;
   }

   // roll method
   public void roll() {
      // Scanner scan = new Scanner(System.in);
      // Random generator = new Random();
      faceValue = (int) (Math.random() * 6) + 1;

   }

   // getter
   public int getFaceValue() {
      return faceValue;
   }

   // setter
   public void setFaceValue(int face) {
      faceValue = face;
   }

   public String toString() {
      return "" + faceValue;
   }

   // equals method
   public boolean equals(Die other) {
      if (faceValue == other.getFaceValue())
         return true;
      else
         return false;

   }
}