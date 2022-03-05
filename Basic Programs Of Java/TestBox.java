class Box {
    int height, width, depth,vol;
    Box(int h,int w,int d){
        height=h;
        width=w;
        depth=d;
    }
    void display(){
       vol=height*width*depth;
        System.out.println(vol);
    }
}
    public class TestBox {
        public static void main(String[] args) {
            Box t = new Box(3,4,5);
            System.out.println("Volume is:");
            t.display();
        }
    }
