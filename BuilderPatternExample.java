public class BuilderPatternExample
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Person p=new Person.BuilderPattern().setName("Ram").setGender("Male").setMandatoryID("1").build();
		System.out.println(p.toString());
		
	}
}

class Person{
    
    private String name;
    private String gender;
    private String mandatoryid;
    
    public Person(String name,String gender,String mandatoryID){
        this.name=name;
        this.gender=gender;
        this.mandatoryid=mandatoryID;
    }
    
    public static class BuilderPattern{
        private String name;
        private String gender;
        private String mandatoryid;
        public BuilderPattern(){}
        
        public BuilderPattern setName(String name){
            this.name=name;
            return this;
        }
        
        public BuilderPattern setGender(String gender){
            this.gender=gender;
            return this;
        }
        
         public BuilderPattern setMandatoryID(String mandatoryid){
         this.mandatoryid=mandatoryid;
         return this;
        }
       
        public Person build(){
            return new Person(name,gender,mandatoryid);
        }
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    
    public String getGender(){
        return gender;
    }
    
     public void setGender(String gender){
        this.gender=gender;
    }
    
    
    public String getMandatoryID(){
        return mandatoryid;
    }
    
    public void setMandatoryID(String mandatoryid){
        this.mandatoryid=mandatoryid;
    }
    
    public String toString(){
        return "Hello "+name+" ID is"+mandatoryid;
    }
}
