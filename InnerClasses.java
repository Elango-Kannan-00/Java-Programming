public class InnerClasses{
    private String model;
    private int price;
    
    public InnerClasses(String model, int price){
        this.model=model;
        this.price=price;
    }
    public String getModel(){
        return model;
    }
    public int getPrice(){
        return price;
    }

    public class Camera{
        private int pixel;
        public Camera(int pixel){
            this.pixel=pixel;
        }
        public int getPixel(){
            return pixel;
        }
    }

    public static void main(String[] args){
        InnerClasses ph=new InnerClasses("Samsung", 39000);
        Camera cam=ph.new Camera(12);
        System.out.println("Model:"+ph.getModel());
        System.out.println("Price:"+ph.getPrice());
        System.out.println("Pixels:"+cam.getPixel());
    }

}