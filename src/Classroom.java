class Classroom extends Area{
    private int classNo;
    Classroom(String name,String openbetween,String usage,int classNo)
    {
        super(name,openbetween,usage);
        setClassNo(classNo);
    }

    public void setClassNo(int classNo) {this.classNo = classNo;}

    public int getClassNo() {return classNo;}
}
