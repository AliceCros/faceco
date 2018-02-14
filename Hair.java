public class Hair{
    String colorHair;
    String formHair;
    
    public Hair(){
        this.colorHair = "brown";
        this.formHair = "Default";
    }  
    
    public Hair(String getColorHair, String getFormHair){
        colorHair = getColorHair;
        formHair = getFormHair;
    }
    
    public String getColorHair(){
        return this.colorHair;
    }
    public String getFormHair(){
        return this.formHair;
    }
    
    public void setColorHair(String newColorHair){
        colorHair = newColorHair;
    }
    public void setFormHair(String newFormHair){
        formHair = newFormHair;
    }
    

}

