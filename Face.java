public class Face {
    private String formFace;
    private int sizeFace;
    private String hairinessFace;
    
    public Face(){
        this.formFace = "Default";
        this.sizeFace = 1;
        this.hairinessFace = "Default";
    }
    
    public Face(String getFormFace, int getSizeFace, String getHairinessFace){
        formFace = getFormFace;
        sizeFace = getSizeFace;
        hairinessFace = getHairinessFace;
    }
    
   public String getFormface() {
       return this.formFace;
   }
   
   public int getSizeFace() {
       return this.sizeFace;
   }
   
   public String getHairinessFace() {
       return this.hairinessFace;
   }
   
    public void setFormFace(String newFormFace) {
       formFace = newFormFace;
   }
    
     public void setSizeFace(int newSizeFace) {
       sizeFace = newSizeFace;
   }
     
      public void setHairinessFace(String newHairinessFace) {
       hairinessFace = newHairinessFace;
   }
}
