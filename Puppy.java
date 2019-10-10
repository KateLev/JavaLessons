public class Puppy{
   
   int puppyAge;

   public Puppy(String name){
      // Это конструктор и у него один параметр, name.
      System.out.println("The name of the puppy:" + name ); 
   }
   public void setAge( int age ){
       puppyAge = age;
   }

   public int getAge( ){
       System.out.println("The puppy's age:" + puppyAge ); 
       return puppyAge;
   }
   public static void main(String []args){
      /* Создание объекта. */
      Puppy myPuppy = new Puppy( "Bobby" );

      /* Вызов метод класса, чтобы установить возраст щенка. */ 
      myPuppy.setAge( 2 );

      /* Вызов другого метода класса, чтобы получить возраст щенка. */
      myPuppy.getAge( );

      /* Получение переменной экземпляра класса. */
      System.out.println("The value of setage " + myPuppy.puppyAge ); 
   }
}