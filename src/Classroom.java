class Classroom extends Area{
    private int classNo;
    Classroom(String name,String openbetween,String usage,int classno)
    {
        super(name,openbetween,usage);
        setClassNo(classno);
    }

    public void setClassNo(int classNo) {this.classNo = classNo;}

    public int getClassNo() {return classNo;}
}
