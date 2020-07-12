
package recursos;

public class Recursos {

       private String met1;
       private int met2;
       private int met3;
       private int met4;
    public Recursos(){
          met1="";
          met2=0;
          met3=0;
          met4=0;
        
    }
     
    public Recursos(String m1,int m2,int m3,int m4)
    {
        met1=met1;
        met2= m2;
        met2= m3;
        met4= m4;
    }

    Recursos(String met1) {
       
    }
  
     public String getMet1(){
        return met1;}
    public void setmet1 (String m1)
    {
      met1=m1;
    }
     public int getMet2(){
        return met2;}
    public void setmet2 (int m2)
    {
      met2=m2;
    }
     public int getMet3(){
        return met3;}
    public void setmet3 (int m3)
    {
      met3=m3;
    }
       public int getMet4(){
        return met4;}
    public void setmet4 (int m4)
    {
      met4=m4;
    }
    
}
