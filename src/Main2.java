 class Main2 {
     int id=3456;
     String fname="Jas";
     String lname="Mohd";
     boolean passed=true;
     public Main2(int s_id,String frstnme,String lstname){
         id=s_id;
         fname=frstnme;
         lname=lstname;

     }
     public static void main(String[] args) {
         Main2 stu1=new Main2(23,"jdf","ghj");
         System.out.println("Id is.."+stu1.id);
         System.out.println("Name is"+" "+stu1.fname+" "+stu1.lname);



     }
}
