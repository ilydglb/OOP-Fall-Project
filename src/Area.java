public class Area {
    private String name;
    private String openbetween;
    private String usage;
    CleaningStaff cs;   //cleaning staff who is responsible from cleaning the area



    Area(String nme,String open,String use){
        setName(nme);
        setOpenbetween(open);
        setUsage(use);
    }

    public void setName(String name) {this.name = name;}

    public String getName() {return name;}

    public void setOpenbetween(String openbetween) {this.openbetween = openbetween;}

    public String getOpenbetween() {return openbetween;}

    public void setUsage(String usage) {this.usage = usage;}

    public String getUsage() {return usage;}

    public void setCS(CleaningStaff cs){this.cs=cs;}

    public CleaningStaff getCs() {return cs;}
}