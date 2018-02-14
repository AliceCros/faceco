public class Eyes{
    private String colorEyes;
    private int sizeEyes;
    private String formEyes;
    
   public Eyes(){
       this.colorEyes = "black" ;
       this.sizeEyes = 1 ;
       this.formEyes = "default" ;
       
               
   }
   
   public Eyes(String getColorEyes, int getSizeEyes, String getFormEyes ){
       colorEyes = getColorEyes ;
       sizeEyes = getSizeEyes ;
       formEyes = getFormEyes ;
   }
   
   public String getColorEyes() {
       return this.colorEyes ;
   }
   
   public int getSizeEyes() {
       return this.sizeEyes ;
   }
   
   public String getFormEyes() {
       return this.formEyes ;
   }
   
    public void setColorEyes(String newColorEyes) {
       colorEyes = newColorEyes;
   }
    
     public void setSizeEyes(int newSizeEyes) {
       sizeEyes = newSizeEyes;
   }
     
      public void setFormEyes(String newFormEyes) {
       formEyes = newFormEyes;
   }
   
}
