package Learn;

public class Rectangle {
    private int lengthRec;
    private int widthRec;
    public Rectangle(){

    }

    public Rectangle(int lengthRec, int widthRec) {
        this.lengthRec = lengthRec;
        this.widthRec = widthRec;
    }

    public int getLengthRec() {
        return lengthRec;
    }

    public void setLengthRec(int lengthRec) {
        this.lengthRec = lengthRec;
    }

    public int getWidthRec() {
        return widthRec;
    }

    public void setWidthRec(int widthRec) {
        this.widthRec = widthRec;
    }
    public int getPerimeter(int lengthRec,int widthRec){
        Rectangle rectangle = new Rectangle();
        int perimeter = (lengthRec+widthRec)*2;
        return perimeter;
    }
    public int getAcreage(int lengthRec,int widthRec){
        Rectangle rectangle = new Rectangle();
        int perimeter = (lengthRec*widthRec);
        return perimeter;
    }
}
